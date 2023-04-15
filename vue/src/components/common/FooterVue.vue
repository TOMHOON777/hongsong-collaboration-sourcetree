<template>
  <footer id="footer">
    <div class="ft_wrap">
      <div class="ft_top">
        <p>퍼피플 © Copyright 2021. All Rights Reserved</p>
        <p>사업자등록번호 000-00-00000</p>
        <p>(우)61928 광주광역시 서구 경열로 3(농성동) 201호 </p>
        <p>고객센터 062-362-7797 (평일 9:00 ~ 18:00)</p>
      </div>
      <div class="ft_bottom">
        <ul>
          <li><a>개인정보취급방침</a></li>
          <li><a>이메일무단수집거부</a></li>
          <li><a>서비스이용약관</a></li>
          <li class="last"><a>홈페이지개선의견</a></li>
        </ul>
      </div>
    </div>
  </footer>
</template>

<script>
export default {
  name: "FooterVue"
}
</script>

<style scoped>
#footer {
  position: relative;
  background-color: #2c2c2c;
  width: 100%;
  height: 235px;
  font-weight: 400;
  font-size: 13px;
  text-align: center;
}
#footer ul{
  width: fit-content;
  margin: 0 auto;
}
#footer a{
  color: #fff;
}

.ft_wrap {
  width: 1200px;
  margin: 0 auto;
  color: #fff;
}

.ft_top {
  clear: both;
  padding-top: 20px;
}

.ft_top p {
  display: block;
  padding-top: 20px;
}

.ft_bottom {
  width: 420px;
  margin: 0 auto;
  font-size: 11px;
  padding-top: 35px;
}

.ft_bottom li {
  float: left;
}

.ft_bottom li:after {
  content: "|";
  padding-left: 15px;
  padding-right: 15px;
}

.ft_bottom .last:after {
  content: none;
  padding-left: 0px;
  padding-right: 0px;
}
</style>