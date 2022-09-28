<template>
  <div id="container">
    <h1>Integer to Roman Numeral Converter</h1>
    <div id="form-container">
      <form onsubmit="return false">
        <label for="integer">Enter Desired Integer:</label>
        <input id="integer-input" type="number" v-model="integer" />
        <div id="error-message" v-if="outOfRange === true">{{ errorMessage }}</div>
        <button type="submit" value="Convert" v-on:click="getResultFromConversion">Convert</button>
      </form>
      <p id="result" v-if="outOfRange === false">{{ result }}</p>
    </div>
  </div>
</template> 

<script>
import ConversionService from "../services/ConversionService";

export default {
  name: 'Conversion',
  data() {
    return {
          integer: "",
          result: "",
          outOfRange: false,
          errorMessage: ""      
        }
  },
  methods: {
    delay(time) {
        return new Promise(resolve => setTimeout(resolve, time));
    },
    reset() {
        Object.assign(this.$data, this.$options.data.apply(this));
    },
    getResultFromConversion() {
      let result = this.result;
      if (this.integer < 0 || this.integer > 3999) {
        this.outOfRange = true;
        this.errorMessage = "Please enter a number from 0 - 3,999.";
        this.delay(2000).then(() => this.reset());
      } else
        ConversionService.getRomanNumeralFromInteger(this.integer).then(
          response => {
            this.result = response.data;
            return result;
          }
        );
    }
  }
};
</script>

<style>
* {
  font-family: Tahoma, Verdana, Segoe, sans-serif;
}

html {
  background-color: #eaebed;
}

#container {
  display: grid;
  padding-top: 15%;
  height: 75vh;
  grid-template-columns: 1fr 1fr 1fr 1fr 1fr;
  grid-template-areas:
    "title title title title title"
    ". form form . ."
    ". . . . ."
    ". result result . ."
    ". . . . ."
    ". . . . .";
}

h1 {
  grid-area: title;
  text-align: center;
  color: #2c3333;
  text-transform: uppercase;
}

#form-container {
  margin: auto;
  width: 600px;
  height: 200px;
  grid-area: form;
  border-radius: 10px;
  align-items: center;
  justify-content: center;
}

form {
  margin-left: 6%;
  padding-left: 15%;
}

input {
  font-size: 16px;
  text-transform: uppercase;
  padding: 10px 10px 10px 10px;
  margin: 15px 10px 5px 25px;
  height: 40px;
  border-radius: 12px;
  background: #fff;
  box-sizing: border-box;
  transition: all 0.3s linear;
  color: rgb(48, 48, 48);
  font-weight: 400;
  grid-area: input;
}

label {
  grid-area: label;
  padding: 2%;
  font-size: 18px;
  font-weight: 600;
}

button {
  width: auto;
  min-width: 50px;
  border-radius: 12px;
  text-align: center;
  margin-top: 10px;
  margin-right: 5px;
  margin-left: 10px;
  padding: 5px 20px;
  color: rgb(80, 80, 80);
  background-color: rgba(135, 122, 88, 0.45);
  font-size: 18px;
  font-weight: 600;
  box-shadow: 0px 2px 4px -1px rgba(109, 103, 103, 0.712);
  border: none;
  grid-area: button;
}

button:active {
  background-color: rgb(128, 128, 128);
  border: 4px solid rgb(53, 53, 53);
  transition: 0.1s;
}

button:hover {
  background-color: rgb(60, 60, 60);
  color: rgb(217, 217, 217);
  transition: 0.6s;
}

#result {
  width: 650px;
  font-weight: 600;
  text-align: center;
  padding-top: 50px;
  padding-left: 80px;
  font-size: 18px;
}

#error-message {
  padding-top: 50px;
  padding-bottom: 50px;
  padding-left: 10px;
  width: 700px;
  color: rgb(186, 81, 81);
}
</style>