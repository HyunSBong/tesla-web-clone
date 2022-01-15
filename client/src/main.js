import { createApp } from "vue";
import App from "./App.vue";
// import BootstrapVue from "bootstrap-vue";
import "bootstrap/dist/css/bootstrap.min.css";
import "bootstrap-vue/dist/bootstrap-vue.css";
import axios from "axios";
import VueAxios from "vue-axios";
import router from "./router/index";

axios.defaults.baseURL = "http://localhost:3000";

const app = createApp(App);
app.config.globalProperties.axios = axios;
app.use(VueAxios, axios);
// app.use(BootstrapVue);
app.use(router);
app.mount("#app");