import Vue from 'vue'
import Vuex from 'vuex'
import api from '../api'

Vue.use(Vuex)

export default new Vuex.Store({
    state: {
        user: {},
        rooms: {}
    },
    mutations: {
        setUser(state, user) {
            state.user = user
        },
        addNewRoom(state, room) {
            Vue.set(state.rooms, room.id, room)
        }
    },
    actions: {
        async auth({ commit, state }) {
            if (state.user.id) {
                return
            }
            let user = JSON.parse(localStorage.getItem('User'))
            if (!user) {
                let { data } = await api.createUser({name: 'unknown'})
                localStorage.setItem('User', JSON.stringify(data))
                user = data
            }
            commit('setUser', user)
        },
        async loadRooms({ commit }) {
            let { data } = await api.getRooms()
            data.forEach(rec => {
                commit('addNewRoom', rec)
            })
        },
        async loadRoom({ commit }, roomId) {
            let { data } = await api.getRoom(roomId)
            commit('addNewRoom', data)
        }
    }
})