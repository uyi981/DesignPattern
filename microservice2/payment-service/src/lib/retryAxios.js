const axios = require('axios');
const axiosRetry = require('axios-retry').default;

axiosRetry(axios, {
  retries: 3,
  retryDelay: (retryCount, error) => {
    console.log(`🔁 [Retry] Thử lại lần ${retryCount}...`);
    return 3000;
  },
  retryCondition: (error) => {
    const shouldRetry =
      error.response?.status >= 500 ||
      error.code === 'ECONNABORTED' ||
      error.code === 'ENOTFOUND' ||    // ✅ Thêm dòng này!
      error.code === 'ECONNREFUSED' || // ⚠️ Optional: nếu service tắt
      !error.response; // fallback nếu lỗi không có response
    if (shouldRetry) {
      console.log(`⚠️ [Retry] Lỗi: ${error.code || error.message}`);
    }
    return shouldRetry;
  },
});

module.exports = axios;
