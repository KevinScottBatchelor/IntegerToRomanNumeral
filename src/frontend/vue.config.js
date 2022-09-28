// vue.config.js
module.exports = {
    // https://cli.vuejs.org/config/#devserver-proxy
    devServer: {
        port: 3000,
        proxy: {
            '/api': {
                target: 'http://https://integer-to-roman-numeral.herokuapp.com',
                ws: true,
                changeOrigin: true
            }
        }
    }
}