import axios from 'axios'
import store from '../store'

const axiosInstance = () => axios.create({
    baseURL: process.env.NODE_ENV === 'development' ? 'http://localhost:8080/api' : '/api',
    headers:  {'X-User-Id': store.state.user.id || ''}
})

class Api {
    createUser(userData) {
        return axiosInstance().post('/user/save', userData)
    }
    getRooms() {
        return axiosInstance().get('/rooms')
    }
    getRoom(roomId) {
        return axiosInstance().get('/room', {params: {id: roomId}})
    }
}

export default new Api()