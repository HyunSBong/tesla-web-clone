<template>
  <div>
    <h1>Spring API TEST</h1>
    <button type="button" @click="getData">Get</button>
    <li v-for="resdata in responseData" v-bind:key="resdata">
      <span class="userId">{{ resdata.userId }}</span>
    </li>
    <h1>HelloController 호출</h1>
    {{ user.name }}, {{ user.age }}
  </div>
</template>

<script>
import axios from "axios";
export default {
  data() {
    return {
      user: { name: "", age: 0 },
    };
  },
  mounted() {
    axios.get("/rest").then((res) => {
      this.user = res.data;
    });
  },

  // methods: {
  //   getData() {
  //     this.axios
  //       .get("/api/users")
  //       .then((response) => {
  //         console.log(response.staus);
  //         console.log(response.data);
  //         this.responseData = response.data;
  //       })
  //       .catch((error) => {
  //         console.log(error);
  //       });
  //   },
  //   data() {
  //     return {
  //       responseData: [],
  //     };
  //   },
  // },
  // mounted() {
  //   this.getData();
  // },
};
</script>

<style></style>
