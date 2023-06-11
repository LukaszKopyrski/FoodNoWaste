<template>
  <form class="form-signin" style="padding: 10px; background-color: #ebebeb;" data-dashlane-rid="0e78da42bc484ac8"
        data-form-type="login">
    <h1 class="h3 mb-3 font-weight-normal">Please sign up</h1>

    <label for="inputFirstName" class="sr-only">Imię</label>
    <input type="text" id="inputFirstName" class="form-control" placeholder="Imię" required="" autofocus=""
           data-dashlane-rid="f5111088d29d6f41" data-kwimpalastatus="alive" data-kwimpalaid="1673381633908-0">

    <label for="inputLastName" class="sr-only">Nazwisko</label>
    <input type="text" id="inputLastName" class="form-control" placeholder="Nazwisko" required="" autofocus=""
           data-dashlane-rid="f5111088d29d6f41" data-kwimpalastatus="alive" data-kwimpalaid="1673381633908-0">

    <label for="inputPhoneNumber" class="sr-only">Telefon</label>
    <input type="tel" pattern="[0-9]{3}-[0-9]{3}-[0-9]{3}" id="inputPhoneNumber" class="form-control"
           placeholder="123-456-789" required="" autofocus="" data-dashlane-rid="f5111088d29d6f41"
           data-form-type="email" data-kwimpalastatus="alive" data-kwimpalaid="1673381633908-0">

    <label for="inputCity" class="sr-only">Miasto</label>
    <input type="text" id="inputCity" class="form-control" placeholder="Miasto" required="" autofocus=""
           data-dashlane-rid="f5111088d29d6f41" data-kwimpalastatus="alive" data-kwimpalaid="1673381633908-0">

    <label for="inputEmail" class="sr-only">Adres Email</label>
    <input type="email" id="inputEmail" class="form-control" placeholder="Adres Email" required="" autofocus=""
           data-dashlane-rid="f5111088d29d6f41" data-form-type="email" data-kwimpalastatus="alive"
           data-kwimpalaid="1673381633908-0">
    <label for="inputPassword" class="sr-only">Hasło</label>
    <input type="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
           title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters"
           id="inputPassword" class="form-control" placeholder="Hasło" required="" data-dashlane-rid="cc9963121605ad01"
           data-form-type="password" data-kwimpalastatus="alive" data-kwimpalaid="1673381633908-1">
    <div class="checkbox mb-3">
    </div>
    <button class="btn btn-lg btn-primary btn-block" id="registrationButton" type="submit" data-dashlane-label="true"
            data-dashlane-rid="39bbb57564a936e3" data-form-type="action,login" data-kwimpalastatus="dead"
            style="margin-top:10px;">
      <router-link to="" class="nav-link" style="font-size:1rem;" @click="visible=!visible">Zarejestruj się
      </router-link>
    </button>
  </form>
</template>

<style scoped>
.form-signin{
  display: flex;
  flex-direction: column;
  justify-content: center;
}
</style>
