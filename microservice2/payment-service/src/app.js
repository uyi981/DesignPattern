const express = require('express');
const morgan = require('morgan');

const app = express();
app.use(express.json());
app.use(morgan('dev'));

// Import từng lớp riêng
const axios = require('./lib/retryAxios');
const timeoutPromise = require('./lib/timeLimiter');
const limiter = require('./lib/rateLimiter');
const breaker = require('./lib/circuitBreaker');

const INVENTORY_URL = 'http://inventory-service:8082/inventory/product-1';
app.post('/payment-1', async (req, res) => {
    try {
      const result = await axios.get(INVENTORY_URL); // axios-retry đã được cấu hình
      res.json({ method: 'RETRY ONLY', result: result.data });
    } catch (err) {
      res.status(503).json({ error: err.message });
    }
  });
  app.post('/payment-2', async (req, res) => {
    try {
      const result = await limiter.schedule(() =>
        axios.get(INVENTORY_URL)
      );
      res.json({ method: 'RATE LIMIT ONLY', result: result.data });
    } catch (err) {
      res.status(503).json({ error: err.message });
    }
  });
  app.post('/payment-3', async (req, res) => {
    try {
      const result = await timeoutPromise(
        axios.get(INVENTORY_URL),
        3000
      );
      res.json({ method: 'TIME LIMIT ONLY', result: result.data });
    } catch (err) {
      res.status(503).json({ error: err.message });
    }
  });
  app.post('/payment-4', async (req, res) => {
    try {
      const result = await breaker.fire('product-1');
      res.json({ method: 'CIRCUIT BREAKER FULL', result: result });
    } catch (err) {
      res.status(503).json({ error: err.message });
    }
  });
  const PORT = process.env.PORT || 8081;
  app.listen(PORT, () => {
    console.log(`🚀 Payment Service chạy tại cổng ${PORT}`);
  });