<template>
  <vue-scroll-snap :fullscreen="true">
    <div class="item" id="one"></div>
    <div class="item" id="two"></div>
    <div class="item" id="three"></div>
    <div class="item" id="four"></div>
  </vue-scroll-snap>
</template>

<script>
import VueScrollSnap from "vue-scroll-snap";
export default {
  components: { VueScrollSnap },
};
</script>

<style>
#one {
  background: #1e91d6;
}
#two {
  background: #db5461;
}
#three {
  background: #fc7753;
}
#four {
  background: #ffffff;
}
</style>
