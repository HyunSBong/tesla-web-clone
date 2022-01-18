import { createApp } from "vue";
import App from "./App.vue";
import BootstrapVue3 from "bootstrap-vue-3";
import "bootstrap/dist/css/bootstrap.css";
import "bootstrap-vue-3/dist/bootstrap-vue-3.css";
import axios from "axios";
import VueAxios from "vue-axios";
import router from "./router/index";

axios.defaults.baseURL = "http://localhost:3000";

const app = createApp(App);
app.config.globalProperties.axios = axios;
app.use(VueAxios, axios);
app.use(BootstrapVue3);
app.use(router);
app.mount("#app");