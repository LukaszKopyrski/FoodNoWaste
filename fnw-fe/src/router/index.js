import { createRouter, createWebHashHistory } from 'vue-router'
import TheListView from '../views/Main/TheListView.vue'
import TheLoginView from '../views/Main/TheLoginView.vue'
import TheRegisterView from '../views/Main/TheRegisterView.vue'
import TheMITView from '../views/Main/TheMITView.vue'
import TheContactView from '../views/Main/TheContactView.vue'
import TheAboutView from '../views/Main/TheAboutView.vue'
import TheRegisterAdminView from '../views/Main/TheRegisterAdminView.vue'
import TheCartView from '../views/Main/TheCartView.vue'
const routes = [
  {
    path: '/',
    name: 'home',
    component: TheListView
  },
  {
    path: '/login',
    name: 'login',
    component:TheLoginView
    
  },
  {
    path: '/register',
    name: 'register',
    component:TheRegisterView
    
  },
  {
    path: '/license',
    name: 'license',
    component:TheMITView
  },
  {
    path: '/contact',
    name: 'contact',
    component:TheContactView
  },
  {
    path: '/about',
    name: 'about',
    component:TheAboutView
  },
  {
    path:'/cart',
    name:'cart',
    component:TheCartView
  },
  {
    path: '/regadmin',
    name: 'RegisterAdmin',
    component:TheRegisterAdminView
  }

  
]

const router = createRouter({
  history: createWebHashHistory(),
  routes
})

export default router
