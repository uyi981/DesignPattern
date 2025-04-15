const express = require('express');
const dotenv = require('dotenv');
const morgan = require('morgan');

dotenv.config();
const app = express();
app.use(express.json());
app.use(morgan('dev'));

let inventory = {
    'product-1': 100,
    'product-2': 50,
};

app.get('/inventory/:productId', (req, res) => {
    const productId = req.params.productId;
    const quantity = inventory[productId] || 0;
    res.json({ productId, quantity });
});

app.post('/inventory/update', (req, res) => {
    const { productId, quantity } = req.body;
    if (inventory[productId]) {
        inventory[productId] -= quantity;
    }
    res.json({ productId, remaining: inventory[productId] || 0 });
});

const PORT = process.env.PORT || 8082;
app.listen(PORT, () => {
    console.log(`Inventory Service đang chạy ở cổng ${PORT}`);
});