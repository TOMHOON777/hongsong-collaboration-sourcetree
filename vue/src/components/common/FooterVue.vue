<template>
  <div class=container>
    <div class="footer">
      <p class="foot_tit">홍송가구</p>
      <div class="foot_list">
        <ul class="foot_list_ul">
          <ul class="foot_list_txt01">
            <li><strong>회사소개</strong></li>
            <li>오시는길</li>
            <li>이용약관</li>
            <li>개인정보처리방침</li>
          </ul>
          <ul class="foot_list_txt02">
            <li><strong>커뮤니티</strong></li>
            <li>리폼접수</li>
            <li>리폼문의</li>
            <li>갤러리</li>
          </ul>
          <ul class="foot_list_txt03">
            <li><strong>bank info</strong></li>
            <li>신한은행</li>
            <li>110-451-460100</li>
            <li>예금주 : 노인경</li>
          </ul>
          <ul class="foot_list_txt04">
            <li><strong>상담 문의 번호</strong></li>
            <li>전국대표 02-473-1357</li>
            <li>강남,서초 010-5780-9090</li>
            <li>강동,송파 02-470-0384</li>
            <li>강북,경기 010-8006-1982</li>
          </ul>
          <ul class="foot_list_txt05">
            <li><strong>고객센터</strong></li>
            <li>공지사항</li>
            <li>자주묻는질문</li>
          </ul>
        </ul>
      </div>
      <div id="hr">
        <hr/>
      </div>
      <div>
        <ul class="foot_info">
          <li><strong>홍송가구</strong> &emsp;경기도 하남시 샘재로 74-19(천현동)</li>
          <li>대표 : 노인경 &emsp;사업자등록번호 : 632-07-00257 &emsp;통신판매업신고 : 2010-서울강동-0321호 &emsp;대표번호 : 02-473-1357 &emsp;e-mail : gagu0385@naver.com</li>
          <li>Copyright(C) 2023 HONGSONG All Rights Reserved</li>
        </ul>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "FooterVue"
}
</script>

<style scoped>
@import url('https://fonts.googleapis.com/css2?family=Gothic+A1:wght@500&display=swap');

.container {
  position: absolute;
  bottom: 0;
  left: 0;
  right: 0;
  background-color: rgba(236, 236, 236, 0.99);
  width: 1280px;
}

.footer {
  margin: 0 20px;
}

.foot_tit {
  text-align: left;
  margin: 20px 0 0 40px;
  font-family: 'Gothic A1', sans-serif;
  font-size: 20px;
  color: brown;

}

.foot_list {
}

.foot_list_ul {
  padding: 20px 20px 40px 20px;
  text-align: left;
  height: 100px;
}

.foot_list ul.foot_list_txt01 {
  float: left;
  list-style: none;
  margin-right: 100px;
  padding-left: 20px;
  font-size: 14px;
}

.foot_list ul.foot_list_txt01 strong {
  font-size: 15px;
}

.foot_list ul.foot_list_txt02 {
  float: left;
  list-style: none;
  margin-right: 100px;
  font-size: 14px;
}

.foot_list ul.foot_list_txt02 strong {
  font-size: 15px;
}

.foot_list ul.foot_list_txt03 {
  float: left;
  list-style: none;
  margin-right: 100px;
  font-size: 14px;
}

.foot_list ul.foot_list_txt03 strong {
  font-size: 15px;
}

.foot_list ul.foot_list_txt04 {
  float: left;
  list-style: none;
  margin-right: 100px;
  font-size: 14px;
}

.foot_list ul .foot_list_txt04 strong {
  font-size: 15px;
}
.foot_list ul .foot_list_txt05 {
  float: left;
  list-style: none;
  margin-right: 100px;
  font-size: 14px;
}

.foot_list ul.foot_list_txt05 strong {
  font-size: 15px;
}

.foot_list ul.foot_list_txt01 li {
  margin-bottom: 9px;
}

.foot_list ul.foot_list_txt02 li {
  margin-bottom: 9px;
}

.foot_list ul.foot_list_txt03 li {
  margin-bottom: 5px;
}
.foot_list ul.foot_list_txt03 li:nth-child(4) {
  margin-top: 8px;
}
.foot_list ul.foot_list_txt04 li {
  margin-bottom: 5px;
}
.foot_list ul.foot_list_txt05 li {
  margin-bottom: 9px;
}

#hr {
  width: 95%;
  margin: 0 auto;
}

.foot_info {
  text-align: left;
  font-size: 12px;
  color: #696969;
}

.foot_info li {
  list-style: none;
  margin-bottom: 4px;
}
</style>