<!--
<nav>
    <router-link to="/">Home</router-link> |
    <router-link to="/about">About</router-link>
  </nav>
  <router-view/>
-->
<template>
  <TheNavView/>
  <TheMainView/>
  <TheFooterView/>
</template>

<style>
*,*::before,*::after{
  margin: 0;
  padding: 0;
}
body{
  font-family: sans-serif;
  box-sizing: border-box;
  font-size: 12px;
}
</style>
 
<script>
import TheNavView from './views/Header/TheNavView.vue';
import TheMainView from './views/Main/TheMainView.vue';
import TheFooterView from './views/Footer/TheFooterView.vue';
export default{
  components:{
    TheNavView,
    TheMainView,
    TheFooterView
  }
}
</script>