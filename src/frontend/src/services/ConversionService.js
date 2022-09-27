import axios from 'axios';

const http = axios.create({
    baseURL: "http://localhost:8080/api/"
});

export default {
    getRomanNumeralFromInteger(integer) {
        return http.get(`conversion?integer=${integer}`);
    }
}