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
        <!-- <img src="./assets/제품소개.png" alt=""> -->
        <div class="middle_inner">
           <div class="main_service_text">
            <img src="./assets/main_text.png" alt="">
          </div>
          <div class="main_service">
            <ul>
              <li>
                <img src="./assets/main_img.png"/>
              </li>
              <li>
                <img src="./assets/main_img.png"/>
              </li>
              <li>
                <img src="./assets/main_img.png"/>
              </li>
            </ul>
          </div>
          <div class="sub_service_text">
          </div>
          <div class="sub_service">
            <ul>
              <li>
                <img src="./assets/sub_image.png"/>
              </li>
              <li>
                <img src="./assets/sub_image.png"/>
              </li>
              <li>
                <img src="./assets/sub_image.png"/>
              </li>
              <li>
                <img src="./assets/sub_image.png"/>
              </li>
            </ul>
          </div>
          
          <div class="contact_service_text">
            <img src="./assets/고객센터.png" alt="">
          </div>
          <div class="contact_service">
            <ul>
              <li class="customer_phone">
                <img src="./assets/고객상담전화.png" alt="">
              </li>
              <li>
                <img src="./assets/오시는길.png" alt="">
              </li>
              <li>
                <img src="./assets/시공문의.png" alt="">
              </li>
              <li>
                <img src="./assets/블로그바로가기.png" alt="">
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

export default {
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
  /* background-image: url("./assets/제품소개.png"); */
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
  margin-top: 50px;
  margin-bottom: 50px;
}
.main_service_text img{
  margin-top: 10px;
  margin-left: 300px ;
}
.main_service{
  margin-top: 10px;
  margin-bottom: 50px;
  width:100%;
  height:250px;
  /* background:rgb(239, 138, 255); */
}
.main_service ul li{
  width:33%;
  height:250px;
  list-style: none;
  float: left;
  margin-right:0px;
}
.main_service ul li img{
  height:250px;
}
.sub_service_text{
  width:100%;
  height:90px;
  background:rgb(136, 25, 103);
  margin-top:50px;
  margin-bottom:50px;
}
.sub_service{
  width:100%;
  height:250px;
}
.sub_service ul li{
  width:23%;
  list-style: none;
  float: left;
  margin:10px;
}
.contact_service_text{
  width:100%;
  height:90px;
  margin-top:50px;
  margin-bottom:50px;
}
.contact_service_text img{
  margin-left: 30%;
  margin-top: 10px;
}
.contact_service{
  width:100%;
  height:250px;
    margin-top:50px;
  margin-bottom:50px;
}
.contact_service ul{
  width:100vw;
  margin:0 auto;
}
.contact_service ul li{
  display: inline-block;
  float: left;
  list-style: none;
}
.contact_service ul .customer_phone{
  margin-right: 15px;
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