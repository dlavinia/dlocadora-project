import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'
import GetCarros from '../views/GetCarrosView.vue'
import FormClienteView from '../views/FormClienteView.vue'
import FormAluguelView from "@/views/FormAluguelView.vue";

Vue.use(VueRouter)

  const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/cadastrarcarro',
    name: 'FormCarro',
    component: function () {
      return import('../views/FormCadastroCarro.vue')
    }
  },
  {
    path: '/carros',
    name: 'GetCarrosView',
    component: GetCarros
  },
  {
    path: '/alugar/:id',
    name: 'alugar1',
    component: FormClienteView
  },

  {
    path: '/alugar/:idCarro/:idCliente',
    name: 'alugar2',
    component: FormAluguelView
  }
 
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
