const express = require('express');
const morgan = require('morgan');
require('dotenv').config();

const app = express();
app.use(morgan('dev'));
app.use(express.json());

// Load proxy routes
require('./routes/proxyRoutes')(app);

const PORT = process.env.PORT || 8080;
app.listen(PORT, () => {
    console.log(`API Gateway đang chạy tại cổng ${PORT}`);
});