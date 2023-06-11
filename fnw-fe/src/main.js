import "bootstrap/dist/css/bootstrap.css"
import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import $ from 'jquery';
createApp(App).use(store).use(router).mount('#app');


const firstName = document.querySelectorAll('#inputFirstName');
const lastName = document.querySelectorAll('#inputLastName');
const phoneNumber = document.querySelectorAll('#inputPhoneNumber');
const city = document.querySelectorAll('#inputCity');
const email = document.querySelectorAll('#inputEmail');
const password = document.querySelectorAll('#inputPassword');
const registrationButton = document.querySelectorAll('#registrationButton');

registrationButton.addEventListener('click',
    () => {
        const obj = {
            firstName: firstName.value,
            lastName: lastName.value,
            phoneNumber: phoneNumber.value,
            city: city.value,
            email: email.value,
            password: password.value,
        };
        fetch("http://localhost:3000/register", {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify(obj)
        }).then(r => {
            if (r.status === 200) {
                window.location.replace("http://localhost:3000/home");
            }
        });
    })


$.ajax({
    url: "http://localhost:3000/registration/response",
    type: "GET",
    success: function (data) {
        prompt("Witaj " + data.firstName + " " + data.lastName + ". Zarejestrowano!");
        const url = "http://localhost:3000/home";
        window.location.replace(url);
    },
    error: function (err) {
        prompt("Błąd przy rejestracji: " + err);
        console.log(err);
    }
}, "json");