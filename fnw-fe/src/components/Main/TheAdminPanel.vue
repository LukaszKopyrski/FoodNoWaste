<template>
    <section>
        {{ this.$store.state.isLogged }} {{ this.$store.state.isAdmin }}
        <div v-if="!isAdminAndIsLogged">treść tylko dla administratora</div>
        <div v-if="isAdminAndIsLogged">Lorem ipsum, dolor sit amet consectetur adipisicing elit. Dolor illo debitis consequatur corrupti! Excepturi alias corrupti odit, iusto voluptatibus laborum, ratione delectus, ipsum facilis repellat error debitis odio nostrum natus.</div>
    </section>
</template>

<script>
export default{
    computed: {
    isAdminAndIsLogged() {
      return this.$store.state.isLogged && this.$store.state.isAdmin;
    },
  },
}
</script>