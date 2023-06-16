<template>
    <div id="cards" >
        <div v-for="img in imgs" :key="img.id">
            <TheCard :img="img"/>
        </div>
    
    </div>
</template>

<script>
import TheCard from './TheCard.vue';
export default{
    components: { TheCard },
    data(){
        return{
           imgs:[
            {id:1,path:require('@/assets/img/1.jpg')},
            {id:2,path:require('@/assets/img/2.jpg')},
            {id:3,path:require('@/assets/img/3.jpg')},
            {id:4,path:require('@/assets/img/4.jpg')}
           ]
        }
    }
}
</script>
    
    <style scoped>
    #cards{
        display:grid;
        grid-template-columns: repeat(auto-fit, minmax(300px, 1fr));
        grid-gap: 10px;
        justify-items:center;
    }
    </style>