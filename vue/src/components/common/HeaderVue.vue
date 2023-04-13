<template>
  <div class="container">
    <div class="header">
      <div class="head_tit">
        <img alt="Hongsong logo" src="@/assets/img/hongsong_title.png">
        <nav>
          <ul class="head_list_ul">
            <li>회사소개</li>
            <li>리폼접수</li>
            <li>커뮤티니</li>
            <li>가구이야기</li>
            <li>고객센터</li>
          </ul>
          <div class="nav_menu">
            <img alt="메뉴" src="@/assets/icon/menu_FILL0_wght400_GRAD0_opsz48.png">
          </div>
        </nav>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "HeaderVue"
}
</script>

<style scoped>
  .container {
    width: 1280px;
    height: 93px;
    position: absolute;
    background-color: rgba(236, 236, 236, 0.99);
  }
  .header {

  }
  .head_tit {
  }
  .head_tit img {
    float: left;
    margin: 5px 0 0 15px;
  }
  .head_tit nav .head_list_ul {
    float: right;
    margin-right: 180px;
  }
  .head_tit nav .head_list_ul li{
    float: left;
    list-style: none;
    margin-right: 30px;
    font-size: 17px;
    padding-top: 10px;

  }
  .head_tit nav .head_list_ul li:nth-child(5){
    margin-right: 0;
  }
  .nav_menu {
    position: absolute;
    right: 30px;
    margin-top: 8px;
  }

</style>