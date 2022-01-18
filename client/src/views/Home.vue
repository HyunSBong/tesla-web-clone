<template>
  <vue-scroll-snap :fullscreen="true">
    <div class="item" id="modelY"></div>
    <div class="item" id="model3"></div>
    <div class="item" id="modelX"></div>
    <div class="item" id="modelS"></div>
    <div class="item" id="powerwall"></div>

    <div class="header">
      <div class="header_logo">
        <a href="/home">
          <img
            className="header_logo"
            src="https://assets.website-files.com/5e8fceb1c9af5c3915ec97a0/5ec2f037975ed372da9f6286_Tesla-Logo-PNG-HD.png"
          />
        </a>
      </div>
      <div class="header_top_menu">
        <li><a href="/">Model Y</a></li>
        <li><a href="/">Model 3</a></li>
        <li><a href="/">Model X</a></li>
        <li><a href="/">Model Y</a></li>
        <li><a href="/">Cybertruck</a></li>
        <li><a href="/">Powerwall</a></li>
      </div>
      <div class="header_edge_menu">
        <li><a href="/shop">Shop</a></li>
        <li><a href="/account/login">계정</a></li>
        <div class="header_edge_popup_menu">메뉴</div>
      </div>
    </div>

    <div class="float_header" style="z-index: 2">
      <div class="prodName">
        <h1>Model Y</h1>
      </div>
      <div class="mid_session">
        <span
          ><a href="https://www.tesla.com/ko_kr/modely/design#battery"
            >주문하기</a
          ></span
        >
        <span
          ><a href="https://www.tesla.com/ko_kr/modely"
            >자세히 알아보기</a
          ></span
        >
      </div>
    </div>
  </vue-scroll-snap>
</template>

<script>
import VueScrollSnap from "vue-scroll-snap";
export default {
  components: { VueScrollSnap },
};
</script>

<style scoped>
#modelY {
  background: url("../assets/images/Desktop-ModelY.jpeg");
  background-size: cover;
}
#model3 {
  background: url("../assets/images/M3-Homepage-D.jpeg");
  background-size: cover;
}
#modelX {
  /* background: url("../assets/images/mx-homepage-desktop2.jpeg") no-repeat center
    center fixed;
  -webkit-background-size: cover;
  -moz-background-size: cover;
  -o-background-size: cover; */
  background: url("../assets/images/mx-homepage-desktop2.jpeg");
  background-size: cover;
}
#modelS {
  background: url("../assets/images/ms-homepage-desktop.jpeg");
  background-size: cover;
}
#powerwall {
  background: url("../assets/images/Desktop-SolarPanels.jpeg");
  background-size: cover;
}

* {
  font-family: tesla;
  list-style: none;
  text-decoration: none;
  border-collapse: collapse;
  margin: 0px;
  padding: 0px;
  color: #393c41;
}
@font-face {
  font-family: "tesla";
  src: url("../assets/font/Gotham/Gotham-Medium.otf");
}

.header {
  display: flex;
  position: fixed;
  top: 0;
  left: 0;
  right: 0;
  justify-content: space-between;
  padding: 25px;
  padding-top: 15px;
  padding-left: 50px;
  padding-right: 50px;
}

.header_logo {
  object-fit: contain;
  width: 100px;
}

.header_top_menu {
  display: flex;
  gap: 30px;
  font-size: 14px;
  color: black;
}

.header_edge_menu {
  display: flex;
  gap: 30px;
  font-size: 14px;
}

/* root productName and OrdeBtn r*/
.float_header {
  justify-content: center;
}
.prodName {
  display: flex;
  position: fixed;
  top: 20%;
  left: 39%;
  width: 500px;
  height: 30px;
  justify-content: center;
}

.prodName > h1 {
  font-family: tesla;
  font-size: 40px;
}

.mid_session {
  display: flex;
  position: fixed;
  width: 550px;
  height: 60px;
  top: 80%;
  left: 38%;
  cursor: pointer;
}

.mid_session > span {
  margin: auto;
  width: 256px;
  height: 40px;
  border-radius: 20px;
  background-color: aqua;
  text-align: center;
  line-height: 40px;
}

.mid_session > span:nth-child(1) {
  background-color: #171a20cc;
}

.mid_session > span:nth-child(2) {
  background-color: #ffffffa6;
}

.mid_session > span > a {
  font-family: tesla;
  font-size: 12px;
}

.mid_session > span:nth-child(1) > a {
  color: white;
}

/* animation */
@keyframes shadeIn {
  from {
    transform: translateY(30px);
    opacity: 0;
  }
  to {
    transform: translateY(0px);
    opacity: 1;
  }
}
@keyframes shadeLeft {
  from {
    transform: translateX(-30px) scaleX(1);
    opacity: 0;
  }
  to {
    transform: translateY(0px);
    opacity: 1;
  }
}
@keyframes shadeRight {
  from {
    transform: translateX(30px) scaleX(1);
    opacity: 0;
  }
  to {
    transform: translateY(0px);
    opacity: 1;
  }
}

.prodName > h1 {
  animation: shadeIn 1.1s;
  animation-fill-mode: both;
}
.mid_session > span:nth-child(1) {
  animation: shadeLeft 0.5s;
  animation-fill-mode: both;
  animation-delay: 0.7s;
}
.mid_session > span:nth-child(2) {
  animation: shadeRight 0.5s;
  animation-fill-mode: both;
  animation-delay: 0.7s;
}
</style>
