import { createRouter, createWebHistory } from "vue-router";

const routes = [{
        path: "/",
        name: "Test",
        component: () =>
            import ("../views/Test.vue"),
    },
    {
        path: "/home",
        name: "Home",
        component: () =>
            import ("../views/Home.vue"),
    },
    {
        path: "/shop",
        name: "ShopHome",
        component: () =>
            import ("../views/ShopHome.vue"),
    },
    {
        path: "/account/login",
        name: "Login",
        component: () =>
            import ("../views/Login.vue"),
    },
    {
        path: "/account/signin",
        name: "SignIn",
        component: () =>
            import ("../views/SignIn.vue"),
    },
    {
        path: "/account/password/forgot",
        name: "PasswordReset",
        component: () =>
            import ("../views/PasswordReset.vue"),
    },
    {
        path: "/test/scrollsnap",
        name: "scrollSnapTest",
        component: () =>
            import ("../views/ScrollSnap.vue"),
    },
];

const router = createRouter({
    history: createWebHistory(),
    routes,
});
export default router;