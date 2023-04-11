<template>
  <HeaderVue/>
    <img alt="Vue logo" src="../assets/img/logo.png">
  <FooterVue/>
</template>

<script>
import FooterVue from './common/FooterVue.vue'
import HeaderVue from './common/HeaderVue.vue'

export default {
  name: 'Home',
  components: {
    HeaderVue,
    FooterVue
  }
}
</script>

<style scoped>
html, body {
  margin: 0;
  padding: 0;
  width: 100%;
}
</style>