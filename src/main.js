import Vue from 'vue'
import App from './main/js/App.vue'
import router from './main/js/router'

Vue.config.productionTip = false

new Vue({
    router,
    render: h => h(App)
}).$mount('#app')