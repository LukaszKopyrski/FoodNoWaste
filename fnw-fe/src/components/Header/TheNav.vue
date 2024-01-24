<template>
<nav class="navbar navbar-expand-lg" style="background-color: bisque; color: red;">
      <div class="container">
        <a class="navbar-brand" href="#">Food no waste</a>
        <button class="navbar-toggler" type="button" 
            data-bs-toggle="collapse"
            data-bs-target="#navbarSupportedContent" 
            @click="visible=!visible"
            >
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="navbar-collapse" :class="!visible?'collapse':''" id="navbarSupportedContent">
          <ul class="navbar-nav ms-auto">
            <li class="nav-item">
                <router-link to="/" class="nav-link" style=" font-size:1rem;" @click="visible=!visible">Strona główna</router-link>
            </li>
            <li class="nav-item">
                <router-link to="/login" class="nav-link" style="font-size:1rem;" @click="visible=!visible" v-if="!isLogged">Logowanie</router-link>
            </li>
            <li class="nav-item">
                <router-link to="/myaccout" class="nav-link" style="font-size:1rem;" @click="visible=!visible" v-if="isLogged">moje konto</router-link>
            </li>
            <li class="nav-item">
                <router-link to="#" class="nav-link" style="font-size:1rem;"  @click="logout" v-if="isLogged">wyloguj się</router-link>
            </li>
            <li class="nav-item">
                <router-link to="/register" class="nav-link" style="font-size:1rem;" @click="visible=!visible" v-if="!isLogged">Rejestracja</router-link>
            </li>
            <li class="nav-item">
                <router-link to="/contact" class="nav-link" style="font-size:1rem;" @click="visible=!visible">Kontakt</router-link>
            </li>
            <li class="nav-item">
                <router-link to="/about" class="nav-link" style="font-size:1rem;" @click="visible=!visible">O nas</router-link>
            </li>
            <li class="nav-item">
                <router-link to="/cart" class="nav-link" style="font-size:1rem;" @click="visible=!visible"><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-cart" viewBox="0 0 16 16">
  <path d="M0 1.5A.5.5 0 0 1 .5 1H2a.5.5 0 0 1 .485.379L2.89 3H14.5a.5.5 0 0 1 .491.592l-1.5 8A.5.5 0 0 1 13 12H4a.5.5 0 0 1-.491-.408L2.01 3.607 1.61 2H.5a.5.5 0 0 1-.5-.5zM3.102 4l1.313 7h8.17l1.313-7H3.102zM5 12a2 2 0 1 0 0 4 2 2 0 0 0 0-4zm7 0a2 2 0 1 0 0 4 2 2 0 0 0 0-4zm-7 1a1 1 0 1 1 0 2 1 1 0 0 1 0-2zm7 0a1 1 0 1 1 0 2 1 1 0 0 1 0-2z"/>
</svg></router-link>
            </li>
          </ul>
        </div>
      </div>
    </nav>
   
</template>

<script>
export default{
  computed:{
    isLogged(){
      return this.$store.state.isLogged;
    }
  },
  methods:{
    logout(){
      this.$store.commit('logged', false);
      this.$store.commit('admin', false);
    }
  }
}
</script>