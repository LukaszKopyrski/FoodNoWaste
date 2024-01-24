import { createStore } from 'vuex'

export default createStore({
  state: {
    isLogged:localStorage.getItem('isLogged')==='true' || false,
    isAdmin:localStorage.getItem('isAdmin')==='true' || false
  },
  getters: {
  },
  mutations: {
    logged(state, value){
      state.isLogged = value;
      localStorage.setItem('isLogged',value.toString());
    },
    admin(state,value){
      state.isAdmin = value
      localStorage.setItem('isAdmin',value.toString());
    }
  },
  actions: {
  },
  modules: {
  }
})
