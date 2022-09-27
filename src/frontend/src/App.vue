<template>
  <div id="app">
    <div id="nav"></div>
    <Conversion />
    <footer></footer>
  </div>
</template>

<script>
import Conversion from "./components/Conversion.vue";

export default {
  name: "App",
  components: {
    Conversion
  }
};
</script>

<style>
#nav {
  margin: -1% -1% 1% -1%;
  position: fixed;
  display: flex;
  flex-direction: row;
  padding: 20px;
  justify-content: space-between;
  align-items: center;
  width: 100%;
  background: #5b8291;
  box-shadow: 0px 2px 6px -1px rgba(109, 103, 103, 0.712);
  height: 10%;
}

footer {
  position: fixed;
  left: 0;
  bottom: 0;
  width: 100%;
  background: #5b8291;
  box-shadow: 0px 2px 6px -1px rgba(109, 103, 103, 0.712);
  height: 12%;
}
</style>
