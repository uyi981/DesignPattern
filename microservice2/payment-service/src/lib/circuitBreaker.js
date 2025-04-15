const CircuitBreaker = require('opossum');
const timeoutPromise = require('./timeLimiter');
const limiter = require('./rateLimiter');
const axios = require('./retryAxios');

async function callInventory(productId) {
  console.log('🔌 [Breaker] -> Gọi inventory:', productId);
  return await timeoutPromise(
    limiter.schedule(() => {
      console.log('🚦 [RateLimiter] Cho phép gọi');
      return axios.get(`http://inventory-service:8082/inventory/${productId}`);
    }),
    3000
  );
}

const breaker = new CircuitBreaker(callInventory, {
  timeout: 5000,
  errorThresholdPercentage: 50,
  resetTimeout: 5000,
});

breaker.on('open', () => console.warn('🔴 Circuit breaker OPEN'));
breaker.on('halfOpen', () => console.log('🟡 Circuit breaker HALF-OPEN'));
breaker.on('close', () => console.log('🟢 Circuit breaker CLOSED'));

module.exports = breaker;
