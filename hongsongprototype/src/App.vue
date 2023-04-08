<template>
  <!-- <the-form></the-form> -->
    <div class="entire">
      <div class="top">
        <div class="top_area">
          <div class="btn_group">
            <a>홈으로</a>
            <a>관리자</a>
            <a>Blog</a>
          </div>
        </div>
        <div class="top_nav">
          <ul>
            <li class="logo">
              <img src="./assets/춘천인테리어필름.png" alt=""/>
            </li>
            <li>
              <a href="">회사소개</a>
            </li>
            <li>
              <a href="">인테리어필름</a>
            </li>
            <li>
              <a href="">제품소개</a>
            </li>
            <li>
              <a href="">주거공간</a>
            </li>
            <li>
              <a href="">시공갤러리</a>
            </li>
            <li>
              <a href="">시공문의</a>
            </li>
          </ul>
        </div>
          TOP
      </div>
      <div class="middle">
        <div class="middle_inner">
           <div class="main_service_text">
            <img src="./assets/main_text.png" alt="">
          </div>
          <div class="main_service">
            <ul>
              <li>
                <img src="./assets/logo.png"/>
              </li>
              <li>
                <img src="./assets/logo.png"/>
              </li>
              <li>
                <img src="./assets/logo.png"/>
              </li>
            </ul>
          </div>
          <div class="sub_service_text">
            sub_service_text
          </div>

          <div class="sub_service">
            <ul>
              <li>
                <img src="./assets/logo.png"/>
              </li>
              <li>
                <img src="./assets/logo.png"/>
              </li>
              <li>
                <img src="./assets/logo.png"/>
              </li>
            </ul>
          </div>
          
          <div class="contact_service_text">
            contact_service_text
          </div>
          <div class="contact_service">
            <ul>
              <li>
                <img src="./assets/logo.png"/>
              </li>
              <li>
                <img src="./assets/logo.png"/>
              </li>
              <li>
                <img src="./assets/logo.png"/>
              </li>
            </ul>
          </div>
        </div>
       
      </div>
      <div class="footer">
        FOOTER
      </div>
    </div>
</template>

<script>
import TheForm from './components/TheForm.vue';

export default {
  components: {
    TheForm
  }  
}
</script>

<style>
* {
  box-sizing: border-box;
}

html {
  font-family: sans-serif;
}

body {
  margin: 0;
  background:white;
}
.entire{
  width:100%;
  height:100vh;
}
.top{
  width:100%;
  height:784px;
  background-image: url("./assets/visual2.png");
}

.middle{
  width:100%;
  height:1380px;
  background: yellow;
}
.middle_inner{
  margin: 0 auto;
  width:1080px;
  height:100vh;
}
.footer{
  width:100%;
  height:119px;
  background: blue;
}
.top_area{
  width: 100%;
  height:37px;
  background-color:#6a6a6a;
}
.top_nav{
  width: 100%;
  height:75px;
  background:rgb(70, 77, 73);
  opacity: 0.9;
}
.main_service_text{
  width:100%;
  height:90px;
  
}
.main_service_text img{
  margin: 0 auto;
}
.main_service{
  width:100%;
  height:250px;
  background:rgb(239, 138, 255);
}
.main_service ul li{
  width:calc(100vh / 4);
  list-style: none;
  float: left;
  background:rgb(239, 138, 255);
  margin:10px;
}
.sub_service_text{
  width:100%;
  height:90px;
  background:rgb(136, 25, 103);
}
.sub_service{
  width:100%;
  height:250px;
  background:rgb(31, 112, 15);
}
.sub_service ul li{
  width:calc(100vh / 4);
  list-style: none;
  float: left;
  margin:10px;
}
.contact_service_text{
  width:100%;
  height:90px;
  background:rgb(136, 25, 103);
}
.contact_service{
  width:100%;
  height:250px;
  background:rgb(31, 112, 15);
}
.contact_service ul li{
  width:calc(100vh / 4);
  list-style: none;
  float: left;
  margin:10px;
}
.btn_group{
  margin-left:80%;
}
.btn_group a{
  color:white;
  margin:10px 10px;
  border: none;
  text-decoration: none;
}
.top_nav ul{
  width:1080px;
  height:87px;
  list-style: none;
  /* background:black; */
  margin: 0 auto;
  /* opacity: 0.5; */
}
.top_nav ul li{
  float: left;
  display:inline-block;
  padding:20px;
  margin-top:5px;
}
.top_nav ul li a{
  text-decoration: none;
  color: white;
}
.top_nav ul .logo{
  padding:15px;
  margin-right:150px;
}
</style>