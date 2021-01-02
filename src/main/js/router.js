import Vue from 'vue'
import Router from 'vue-router'
import RoomsPage from './views/RoomsPage.vue'
import MainPage from './views/MainPage.vue'

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
        }
    ],
    scrollBehavior () {
        return { x: 0, y: 0 }
    }
})