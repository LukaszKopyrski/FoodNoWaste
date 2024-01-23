<template>
    <form class="form-signin" style="padding: 10px; background-color: #ebebeb;" data-dashlane-rid="0e78da42bc484ac8" data-form-type="login">
      <h1 class="h3 mb-3 font-weight-normal">Zarejestruj się</h1>

      <label for="inputFirstName" class="sr-only">Imię</label>
      <input type="text" id="inputFirstName" class="form-control" placeholder="Imię" v-model="name" required="" autofocus="" data-dashlane-rid="f5111088d29d6f41"  data-kwimpalastatus="alive" data-kwimpalaid="1673381633908-0">

      <label for="inputLastName" class="sr-only">Nazwisko</label>
      <input type="text" id="inputLastName" class="form-control" placeholder="Nazwisko" v-model="lastName" required="" autofocus="" data-dashlane-rid="f5111088d29d6f41" data-kwimpalastatus="alive" data-kwimpalaid="1673381633908-0">

      <label for="inputPhoneNumber" class="sr-only">Telefon</label>
      <input type="tel" pattern="[0-9]{3}-[0-9]{3}-[0-9]{3}" id="inputPhoneNumber" v-model="phone" class="form-control" placeholder="123-456-789" required="" autofocus="" data-dashlane-rid="f5111088d29d6f41" data-form-type="email" data-kwimpalastatus="alive" data-kwimpalaid="1673381633908-0">

      <label for="inputEmail" class="sr-only">Adres Email</label>
      <input type="email" id="inputEmail" class="form-control" placeholder="Adres Email" v-model="email" required="" autofocus="" data-dashlane-rid="f5111088d29d6f41" data-form-type="email" data-kwimpalastatus="alive" data-kwimpalaid="1673381633908-0">
      <label for="inputPassword" class="sr-only">Hasło</label>
      <input type="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" v-model="password" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" id="inputPassword" class="form-control" placeholder="Hasło" required="" data-dashlane-rid="cc9963121605ad01" data-form-type="password" data-kwimpalastatus="alive" data-kwimpalaid="1673381633908-1">
      
      <label data-dashlane-label="true">
          <input type="checkbox" v-model="admin" value="admin" data-dashlane-rid="edb67f76de68997d" data-form-type="consent,admin" id="admin" > Admin
        </label>
      <button class="btn btn-lg btn-primary btn-block" @click="addUser" type="submit" data-dashlane-label="true" data-dashlane-rid="39bbb57564a936e3" data-form-type="action,login" data-kwimpalastatus="dead" style="margin-top:10px;"><router-link to="/" class="nav-link" style="font-size:1rem;" @click="visible=!visible">Zarejestruj się</router-link></button>
    </form>
</template>

<script >
import router from "@/router";
import axios from "axios";
export default {
  data(){
    return{
      name:'',
      lastName:'',
      phone:'',
      email:'',
      password:'',
      admin:false
    }
  },
  methods:{
     async addUser(){
        try{
          await axios.post(
              'http://localhost:8082/registration/response',
              {
                name:this.name,
                lastName:this.lastName,
                phoneNumber:this.phone,
                email:this.email,
                password:this.password
              }
          );
          alert(`Dodano konto do bazy danych`);
          this.$store.commit('admin', this.admin);
          router.push('/');
        }catch (error){
          alert(error.message);
        }
    }
  }
}
</script>

<style scoped>
.form-signin{
    display: flex;
    flex-direction: column;
    justify-content: center;
}
</style>