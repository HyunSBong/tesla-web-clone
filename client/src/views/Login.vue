<template>
  <div class="header">
    <div class="logoArea">
      <img
        className="teslaLogo"
        src="https://assets.website-files.com/5e8fceb1c9af5c3915ec97a0/5ec2f037975ed372da9f6286_Tesla-Logo-PNG-HD.png"
      />
    </div>
    <div class="temp"></div>
    <div class="languageArea">
      <!-- <img
        className="header_logo"
        src="https://assets.website-files.com/5e8fceb1c9af5c3915ec97a0/5ec2f037975ed372da9f6286_Tesla-Logo-PNG-HD.png"
      /> -->
    </div>
  </div>
  <!-- header-end -->
  <div class="mid_session">
    <h1>로그인</h1>
    <p>이메일 주소</p>
    <div>
      <form>
        <input type="text" placeholder="" />
      </form>
    </div>
    <p>비밀번호</p>
    <div>
      <form>
        <input type="text" placeholder="" />
      </form>
    </div>
    <div id="order"><a href="/process/memberlogin">로그인</a></div>
    <div class="help">
      <a href="/account/email/forgot">이메일 주소를 잊으셨나요?</a>
      <p>|</p>
      <a href="/account/password/forgot">비밀번호를 잊으셨나요?</a>
    </div>
    <p id="br">또는</p>
    <div class="sign"><a href="/account/signin">계정 생성하기</a></div>
  </div>

  <div class="footer">
    <p>Tesla 2022 개인정보 처리방침 및 법적고지 연락처</p>
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

.header {
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
  /* width: 100px;
  height: 10px;
  margin-top: 10px;
  margin-left: 20px;
  justify-content: center; */
  object-fit: contain;
  flex: 1;
  width: 90px;
  margin-left: 20px;
}
.temp {
  display: flex;
  width: 1100px;
  justify-content: center;
  line-height: 52px;
  /* background-color:blue; */
}
.languageArea {
  width: 100px;
  height: 30px;
  margin-top: 11px;
  /* background: yellow; */
}
.language_ic {
  width: 80px;
  height: 45px;
  margin-top: 0px;
  margin-left: 20px;
  justify-content: center;
  /* background: green; */
}

.mid_session {
  display: block;
  position: absolute;
  width: 400px;
  height: 400px;
  left: 0;
  right: 0;
  margin-left: auto;
  margin-right: auto;
  cursor: pointer;
  /* background-color:pink; */
}
.mid_session > h1 {
  font-family: tesla;
  font-size: 32px;
  margin-bottom: 30px;
  margin-left: calc((400px - 332px) / 2);
}
.mid_session > p {
  font-family: tesla;
  font-size: 14px;
  color: #5c5e62;
  margin-left: calc((400px - 332px) / 2 + 20px);
  padding: 8px 0px 8px 0px;
}

.mid_session > div {
  margin: auto;
  width: 332px;
  height: 38px;
  border-radius: 20px;
  background-color: #f4f4f4;
  text-align: center;
  line-height: 40px;
  /* 3E6AE1 */
}
.mid_session > div > form > input {
  background-color: transparent;
  width: 300px;
  height: 20px;
  border: none;
}
#order {
  background-color: #3e6ae1;
  margin-top: 12px;
  /* margin-left: calc((400px - 332px)/2); */
}
#order > a {
  color: #ffffff;
  font-size: 12px;
  /* margin-left: calc((400px - 332px)/2); */
}
#order:hover {
  background-color: #483ee1;
}

.mid_session > a {
  font-family: tesla;
  font-size: 14px;
  width: 5px;
  margin: 0 auto;
}
.mid_session > div.help {
  background-color: white;
}
.help {
  display: flex;
  position: absolute;
  width: 400px;
  left: 50%;
  transform: translateX(-50%);
  font-size: 12px;
  justify-content: center;
  background-color: white;
}
.help > a {
  text-decoration: underline;
  color: #5c5e62;
}
.help > p {
  margin: 0 5px 0 5px;
}
#br {
  border: hidden;
  background-color: transparent;
  justify-content: center;
  text-align: center;
  margin: 55px 0px 20px 0px;
}
.sign {
  border: solid 3px;
  border-color: black;
}
.sign > a {
  color: #5c5e62;
  font-size: 12px;
}
.sign:hover {
  background-color: black;
  color: white;
}

.footer {
  position: absolute;
  font-family: tesla;
  font-size: 12px;
  justify-content: center;
  text-align: center;
  left: 0;
  right: 0;
  margin-left: auto;
  margin-right: auto;
  bottom: 5%;
}
</style>
