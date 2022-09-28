import { createApp } from 'vue'
import App from './App.vue'
import axios from 'axios'

axios.defaults.baseURL = process.env.PORT || 3000;

createApp(App).mount('#app')
