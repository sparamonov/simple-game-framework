import Vue from 'vue'
import Vuex from 'vuex'
import api from '../api'

Vue.use(Vuex)

export default new Vuex.Store({
    state: {
        rooms: []
    },
    mutations: {
        addNewRoom(state, room) {
            state.rooms.push(room)
        }
    },
    actions: {
        async loadRooms({ commit }) {
            let { data } = await api.getRooms()
            data.forEach(rec => {
                commit('addNewRoom', rec)
            });
        }
    }
})