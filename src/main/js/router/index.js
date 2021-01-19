import Vue from 'vue'
import Router from 'vue-router'
import RoomsPage from '../views/pages/RoomsPage.vue'
import MainPage from '../views/pages/MainPage.vue'
import RoomPage from '../views/pages/RoomPage.vue'

Vue.use(Router)

export default new Router({
    mode: 'history',
    routes: [
        {
            path: '/app',
            component: MainPage
        },
        {
            path: '/app/rooms',
            component: RoomsPage
        },
        {
            path: '/app/room/:roomId',
            name: 'room',
            component: RoomPage,
            props: true
        }
    ],
    scrollBehavior () {
        return { x: 0, y: 0 }
    }
})