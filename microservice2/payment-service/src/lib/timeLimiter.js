module.exports = function timeoutPromise(promise, ms = 3000) {
    return new Promise((resolve, reject) => {
      const timeout = setTimeout(() => reject(new Error('⏰ Timeout')), ms);
      promise.then((res) => {
        clearTimeout(timeout);
        resolve(res);
      }).catch((err) => {
        clearTimeout(timeout);
        reject(err);
      });
    });
  };
  