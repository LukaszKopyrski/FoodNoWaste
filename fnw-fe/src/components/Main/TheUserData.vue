<template>
    <article class="person">
      {{ user.id }} {{ user.name }} {{ user.lastName }} {{ user.email }} {{ user.phoneNumber }}
      <button class="edit" @click="toggleEdit">zmień dane</button>
      <button class="delete">usuń użytkownika</button>
      <br>
      <input v-if="isEditMode" type="text" class="person__name" placeholder="name">
      <input v-if="isEditMode" type="text" class="person__name" placeholder="lastname">
      <input v-if="isEditMode" type="email" class="person__name" placeholder="email">
      <input v-if="isEditMode" type="number" class="person__name" placeholder="phone">
      <input v-if="isEditMode" type="submit" value="zastosuj" @click="applyChanges">
    </article>
  </template>
  
  <script>
  export default {
    props: {
      user: {
        type: Object,
        required: true
      }
    },
    data() {
      return {
        isEditMode: false
      };
    },
    methods: {
      toggleEdit() {
        this.isEditMode = !this.isEditMode;
      },
      applyChanges() {
        this.isEditMode = false;
      }
    }
  };
  </script>
  
  <style>
  .person {
    margin: 10px;
  }
  
  button {
    border: 0;
    border-radius: 5px;
    background-color: #0d6efd;
    color: white;
    font-weight: bold;
    padding: 3px;
    text-align: center;
    margin-left: 5px;
  }
  input{
    margin-left: 5px;
  }
  .edit {
    background-color: #0d6efd;
  }
  
  .delete {
    background-color: #d81515d2;
  }
  </style>
  