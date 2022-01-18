<template>
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
      <li><a href="/">차량</a></li>
      <li><a href="/">차량 액세서리</a></li>
      <li><a href="/">의류</a></li>
      <li><a href="/">라이프스타일</a></li>
    </div>
    <div class="header_edge_menu">
      <li><a href="/">검색</a></li>
      <li><a href="/account/login">장바구니</a></li>
      <div class="header_edge_popup_menu"></div>
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
</style>
