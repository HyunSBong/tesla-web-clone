<template>
  <div class="step1">
    <div class="main_bg">
      <div class="header">
        <div class="logoArea">
          <img class="teslaLogo" src="images/logo.png" alt="teslaLogo" />
        </div>
        <ul class="nav">
          <li><a href="https://www.tesla.com/ko_kr/models">MODEL S</a></li>
          <li><a href="https://www.tesla.com/ko_kr/model3">MODEL 3</a></li>
          <li><a href="https://www.tesla.com/ko_kr/modelx">MODEL X</a></li>
          <li><a href="https://www.tesla.com/ko_kr/modely">MODEL Y</a></li>
          <li>
            <a href="https://www.tesla.com/ko_kr/cybertruck">CYBERTRUCK</a>
          </li>
          <li><a href="https://www.tesla.com/ko_kr/powerwall">POWERWALL</a></li>
        </ul>
        <!-- 256 40 -->
        <ul class="nav2">
          <li><a href="https://shop.tesla.com/ko_kr?redirect=no">SHOP</a></li>
          <li><a href="tesla_account.html">TESLA 계정</a></li>
        </ul>
      </div>
    </div>
  </div>
  <!-- step1 - end -->
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
      ><a href="https://www.tesla.com/ko_kr/modely">자세히 알아보기</a></span
    >
  </div>
  <div class="step2">
    <div class="sub_bg"></div>
  </div>
</template>

<script>
export default {};
</script>

<style>
* {
  font-family: "Noto Sans KR", sans-serif;
  list-style: none;
  text-decoration: none;
  border-collapse: collapse;
  margin: 0px;
  padding: 0px;
  color: #000;
}

@font-face {
  font-family: "tesla";
  src: url("../assets/font/Gotham/Gotham-Medium.otf");
}

.main_bg {
  background-image: url("../assets/images/Desktop-ModelY.jpeg");
  background-size: 100%;
  width: 100%;
  height: 1000px;
}
.sub_bg {
  background-image: url("../assets/images/CN-D-3.jpeg");
  background-size: 100%;
  width: 100%;
  height: 1000px;
}
.header {
  position: fixed;
  display: flex;
  width: 1400px;
  height: 52px;
  /* background-color:beige; */
}
.logoArea {
  width: 200px;
  height: 30px;
  margin-top: 11px;
  /* background: red; */
}
.teslaLogo {
  width: 100px;
  height: 10px;
  margin-top: 10px;
  margin-left: 20px;
  justify-content: center;
  /* background: green; */
}
.nav {
  display: flex;
  width: 1000px;
  justify-content: center;
  line-height: 52px;
  /* background-color:blue; */
}
.nav2 {
  display: flex;
  width: 200px;
  justify-content: flex-end;
  line-height: 52px;
  /* background-color:yellow; */
}

.nav > li {
  margin-left: 10px;
  margin-right: 10px;
}

.nav > li > a {
  font-family: tesla;
  font-size: 14px;
  color: black;
}
.nav2 > li {
  margin-left: 10px;
  margin-right: 10px;
}

.nav2 > li > a {
  font-family: tesla;
  font-size: 14px;
  color: black;
}

.prodName {
  position: fixed;
  top: 20%;
  left: 42%;
  width: 500px;
  height: 30px;
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
  left: 28%;
  cursor: pointer;
  /* background-color:blueviolet; */
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

/* 171A20CC */
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
