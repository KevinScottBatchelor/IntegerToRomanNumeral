import axios from 'axios';

const http = axios.create({
    baseURL: "/api/"
});

export default {
    getRomanNumeralFromInteger(integer) {
        return http.get(`conversion?integer=${integer}`);
    }
}