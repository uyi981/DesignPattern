const express = require('express');
const dotenv = require('dotenv');
const morgan = require('morgan');

dotenv.config();
const app = express();
app.use(express.json());
app.use(morgan('dev'));

let shipments = {};

app.post('/ship', (req, res) => {
    const { orderId } = req.body;
    shipments[orderId] = 'shipping';
    res.json({ orderId, status: 'shipping' });
});

app.get('/ship/:orderId', (req, res) => {
    const orderId = req.params.orderId;
    const status = shipments[orderId] || 'not found';
    res.json({ orderId, status });
});

const PORT = process.env.PORT || 8083;
app.listen(PORT, () => {
    console.log(`Shipping Service đang chạy ở cổng ${PORT}`);
});