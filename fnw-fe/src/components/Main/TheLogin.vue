<template>
    <form class="form-signin" style="padding: 10px; background-color: #ebebeb;" data-dashlane-rid="0e78da42bc484ac8" data-form-type="login">
      <h1 class="h3 mb-3 font-weight-normal">Please sign in</h1>
      <label for="inputEmail" class="sr-only">Email address</label>
      <input type="email" id="inputEmail" class="form-control" placeholder="Email address" required="" autofocus="" data-dashlane-rid="f5111088d29d6f41" data-form-type="email" data-kwimpalastatus="alive" data-kwimpalaid="1673381633908-0">
      <label for="inputPassword" class="sr-only">Password</label>
      <input type="password" id="inputPassword" class="form-control" placeholder="Password" required="" data-dashlane-rid="cc9963121605ad01" data-form-type="password" data-kwimpalastatus="alive" data-kwimpalaid="1673381633908-1">
      <div class="checkbox mb-3">
        <label data-dashlane-label="true">
          <input type="checkbox" value="remember-me" data-dashlane-rid="edb67f76de68997d" data-form-type="consent,rememberme"> Remember me
        </label>
      </div>
      <button class="btn btn-lg btn-primary btn-block" type="submit" @click="login" data-dashlane-label="true" data-dashlane-rid="39bbb57564a936e3" data-form-type="action,login" data-kwimpalastatus="dead">Zaloguj się</button> <br>
    </form>
</template>

<style scoped>
.form-signin{
    display: flex;
    flex-direction: column;
    justify-content: center;
}
</style>


<script >
import axios from "axios";
export default {
  data(){
    return{
      name:'',
      lastName:'',
      phone:'',
      email:'',
      password:'',
    }
  },
  methods:{
    async login(){
      try{
        await axios.post(
            'http://localhost:8082/login/response',
            {
              name:this.name,
              lastName:this.lastName,
              phoneNumber:this.phone,
              email:this.email,
              password:this.password
            }
        );
        alert(`Zalogowano`);
        window.open("http://localhost:8080/#/about")
      }catch (error){
        alert("Konto nie istnieje");
      }
    }
  }
}
</script>