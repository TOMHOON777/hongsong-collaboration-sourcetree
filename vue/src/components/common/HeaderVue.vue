<template>
  <header id="header">
    <div id="hd_wrap">

      <h1 class="logo">
        <a href='#'> <img src="@/assets/img/hongsong_title.png" alt="퍼피플로고"></a>
      </h1>

      <div id="gnb_wrap">
        <div class="gnb_sub_wrap">
          <div class="gnb_sub">
          </div>
        </div>
        <nav id="menu">
          <ul class="gnb">
            <li class="hover community"><a href="#">회사소개</a></li>
            <div id="lnb_wrap">
              <ul class="lnb lnb_menu1">
                <li><a href="#">인사말</a></li>
                <li><a href="#">오시는길</a></li>
              </ul>
            </div>
            <li><a href="#">리폼접수</a></li>
            <li><a href="#">커뮤니티</a>
            </li>
            <li><a href="#">가구이야기</a></li>
            <li class="hover notice"><a href="#">고객센터</a>
              <div id="lnb_wrap">
                <ul class="lnb lnb_menu2">
                  <li><a href="#">공지사항</a></li>
                  <li><a href="#" >F A Q</a></li>
                </ul>
              </div>
            </li>
          </ul>
        </nav>

      </div>

    </div>
  </header>
</template>

<script>
import $ from 'jquery';
export default {
  name: "HeaderVue",
  mounted() {
    // ----------메뉴---------------
    // 메인메뉴 gnb에 li hover시 lnb 부드럽게 나타나기
    // 커뮤니티
    $('.community').mouseenter(function(){
      $('.lnb_menu1').stop(true).slideDown(350);
    });
    $('.community').mouseleave(function(){
      $('.lnb_menu1').stop(true).slideUp(350);
    });
    // 퍼피플 소식
    $('.notice').mouseenter(function(){
      $('.lnb_menu2').stop(true).slideDown(350);
    });
    $('.notice').mouseleave(function(){
      $('.lnb_menu2').stop(true).slideUp(350);
    });

    // ----------슬라이드---------------
  }
}


</script>

<style scoped>
@import "@/assets/css/style.css";

#header {
  border-bottom: 1px solid #ebebeb;
}

#hd_wrap {
  width: 1200px;
  height: 147px;
  margin: 0 auto;
  z-index: 30;
}

#gnb_wrap {
  width: 100%;
}

.logo {
  float: left;
}

.logo img {
  width: 150px;
  height: auto;
  margin-left: -4px;
  margin-top: 40px;
}

/* 마이페이지, 로그인, 로그아웃, 회원가입 (gnb_sub)  */
.gnb_sub_wrap {
  height: 40px;
}

.gnb_sub {
  width: 1200px;
  margin: 0 auto;
}

.gnb_sub ul {
  float: right;
  padding-top: 20px;
  box-sizing: border-box;
}

.gnb_sub li {
  float: left;
  margin-left: 30px;
  font-size: 13px;
}

.gnb_sub select {
  background-color: rgba(0, 0, 0, 0);
  border: 1px solid #d9d9d9;
  padding: 1px;
  font-size: 10px;
}

.gnb_sub option {
  background-color: #ebebebcf;
}

/* 메인메뉴바(gnb) */
#menu {
  float: right;
  width: 80%;
  height: 60px;
  line-height: 50px;
  margin-top: 30px;
  z-index: 10;
  position: relative;
}

.gnb {
  float: right;
}

.gnb li {
  float: left;
  height: 60px;
  margin-left: 55px;
  font-size: 18px;
  font-weight: 400;
  font-family: 'Godo', 'Sans-serif';
  border: 0;
}
.gnb li:first-child {
  margin-left: 0;
}

.hover {
  cursor: pointer;
}
/* js에서 hover 처리함 !!
.hover:hover .lnb{
	display: block;
	transition: 2s;
} */

/* 드롭다운으로 내려오는 lnb 메뉴바 */
#lnb_wrap {
  position: absolute;
  top: 60px;
  width: 130px;
  text-align: center;
}

.lnb {
  display: none;
  width: 100%;
  text-align: center;
  background-color: #fff;
}

.lnb_menu1 {
  margin-left: -33px;
}

.lnb_menu2 {
  margin-left: -25px;
}

.lnb li {
  clear: both;
  width: 100%;
  height: 47px;
  line-height: 47px;
  margin-left: 0px;
  font-size: 15px;
  background-color: #fff;
}

.lnb li:nth-child(odd) {
  background-color: #eee;
}

.lnb li:nth-child(even) {
  background-color: #fafafa;
}

.lnb a {
  display: inline-block;
  width: 100%;
  height: 100%;
}

.lnb a:hover {
  color: #fff;
  background-color: #8842e9;
  transition: 0.3s;
}

</style>