import Vue from 'vue'
import App from './main/js/views/App.vue'
import router from './main/js/router'
import store from './main/js/store'
import BootstrapVue from 'bootstrap-vue'
import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'

Vue.config.productionTip = false
Vue.use(BootstrapVue)

new Vue({
    router,
    store,
    render: h => h(App)
}).$mount('#app')