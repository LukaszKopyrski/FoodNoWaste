<template>
    
    <div id="cards">
    <TheCardView></TheCardView>
    <TheCardView></TheCardView>
    <TheCardView></TheCardView>
   
    </div>
</template>

<script>
import TheCardView from '@/views/Main/TheCardView.vue';
export default{
    components: { TheCardView }
}
</script>

<style scoped>
#cards{
    display:grid;
    grid-template-columns: repeat(auto-fill, minmax(300px, 1fr));
    justify-items:center;
}
</style>
