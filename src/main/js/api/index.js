import axios from 'axios'

const axiosInstance = axios.create({
    baseURL: process.env.NODE_ENV === 'development' ? 'http://localhost:8080/api' : '/api'
})

class Api {
    getRooms() {
        return axiosInstance.get('/rooms')
    }
}

export default new Api()