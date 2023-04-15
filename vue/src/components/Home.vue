<template>
<!--  header  -->
  <HeaderVue/>
  <!--  header  -->

  <!--  container  -->


  <!--  container  -->

  <!--  footer  -->
  <FooterVue/>
  <!--  footer  -->
</template>

<script>
import FooterVue from './common/FooterVue.vue'
import HeaderVue from './common/HeaderVue.vue'

import VueTinySlider from 'vue-tiny-slider';

export default {
  name: 'Home',
  components: {
    HeaderVue,
    FooterVue,
  },
}
</script>

<style scoped>
html, body {
  margin: 0;
  padding: 0;
}

/* header */



/* footer */


</style>