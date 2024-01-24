<template>
  <section v-if="isAdminAndIsLogged">
    <article v-for="u in userData" :key="u.id">
      <TheUserData :user="u"></TheUserData>
    </article>
  </section>
  <section v-if="!isAdminAndIsLogged">
    Treść tylko dla administratora
  </section>
</template>

<style>
section{
  margin: 10px;
}
</style>
<script>
import axios from 'axios';
import TheUserData from './TheUserData.vue';

export default {
  components: {
    TheUserData
  },
  data() {
    return {
      userData: []
    };
  },
  mounted() {
    this.getData();
  },
  methods: {
    async getData() {
      try {
        const response = await axios.get('http://localhost:8082/registration/allUsers');
        this.userData = response.data;
        console.log(this.userData)
      } catch (error) {
        console.log(error);
      }
    }
  },
  computed: {
    isAdminAndIsLogged() {
      return this.$store.state.isLogged && this.$store.state.isAdmin;
    }
  }
};
</script>
