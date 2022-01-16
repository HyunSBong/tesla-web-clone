<template>
  <div class="backgroundPanel">
    <div class="header">
      <div class="header_logo">
        <li>
          <a href="/home">
            <img
              className="header_logo"
              src="https://assets.website-files.com/5e8fceb1c9af5c3915ec97a0/5ec2f037975ed372da9f6286_Tesla-Logo-PNG-HD.png"
            />
          </a>
        </li>
      </div>
      <div class="header_top_menu">
        <li><a href="/">MODEL S</a></li>
        <li><a href="/">MODEL 3</a></li>
        <li><a href="/">MODEL X</a></li>
        <li><a href="/">MODEL Y</a></li>
        <li><a href="/">Cybertruck</a></li>
        <li><a href="/">Powerwall</a></li>
      </div>
      <div class="header_edge_menu">
        <li><a href="/">Shop</a></li>
        <li><a href="/account/login">계정</a></li>
        <div class="header_edge_popup_menu">메뉴</div>
      </div>
    </div>

    <div class="float_header" style="z-index: 1">
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
  </div>
</template>

<script>
export default {};
</script>

<style scoped>
* {
  font-family: tesla;
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

.backgroundPanel {
  background: url("https://tesla.com/ns_videos/model-3-social.jpg") no-repeat
    center center fixed;
  -webkit-background-size: cover;
  -moz-background-size: cover;
  -o-background-size: cover;
  background-size: cover;
  position: absolute;
  top: 0;
  right: 0;
  bottom: 0;
  left: 0;
  place-items: center;
}

.header {
  display: flex;
  position: sticky;
  z-index: 2;
  top: 0;
  left: 0;
  right: 0;
  justify-content: space-between;
  align-items: center;
  padding: 25px;
  padding-top: 15px;
}

.header_logo {
  object-fit: contain;
  flex: 1;
  width: 90px;
  /* margin-right: 100px; */
}

.header_top_menu {
  display: flex;
  gap: 15px;
}

.header_top_menu > a {
  text-transform: uppercase;
  color: black;
  font-weight: 500;
  font-size: 15px;
}

.header_edge_menu {
  display: flex;
  align-items: center;
  gap: 15px;
  margin-left: 100px;
}

.header_edge_menu > a {
  text-transform: uppercase;
  color: black;
  font-weight: 500;
  font-size: 15px;
  z-index: 0;
  position: relative;
}

/* root productName and OrdeBtn r*/
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
