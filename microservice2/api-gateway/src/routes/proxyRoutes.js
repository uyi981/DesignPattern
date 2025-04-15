const { createProxyMiddleware } = require('http-proxy-middleware');
require('dotenv').config();

module.exports = function(app) {
    app.use('/payment', createProxyMiddleware({
        target: process.env.PAYMENT_SERVICE_URL,
        changeOrigin: true,
        pathRewrite: { '^/payment': '' }
    }));

    app.use('/inventory', createProxyMiddleware({
        target: process.env.INVENTORY_SERVICE_URL,
        changeOrigin: true,
        pathRewrite: { '^/inventory': '' }
    }));

    app.use('/shipping', createProxyMiddleware({
        target: process.env.SHIPPING_SERVICE_URL,
        changeOrigin: true,
        pathRewrite: { '^/shipping': '' }
    }));
};