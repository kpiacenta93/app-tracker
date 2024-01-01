import { createRouter, createWebHistory } from "vue-router";
import Home from '../Views/Home'
import AddApplicationsViews from '../Views/AddApplicationsViews'
import SeeApplicationViews from '../Views/SeeApplicationsViews'



const routes = [
    {
        path: "/",
        name: "Home",
        component: Home
    },

    {
        path: "/AddApplications",
        name: "AddApplicationsViews",
        component: AddApplicationsViews
    },

    {
        path: "/SeeApplications",
        name: "SeeApplicationsViews",
        component: SeeApplicationViews
    }

];

const router = createRouter({
        history: createWebHistory(),
        routes,
});


export default router;
