const express = require("express");
const mongoose = require("mongoose");

const app = express();
app.use(express.json());

mongoose
    .connect("mongodb://mongo:27017/mydatabase", {
        useNewUrlParser: true,
        useUnifiedTopology: true,
    })
    .then(() => console.log("Connected to MongoDB"))
    .catch((err) => console.log(err));

const UserSchema = new mongoose.Schema({ name: String });
const User = mongoose.model("User", UserSchema);

app.post("/users", async(req, res) => {
    const user = new User({ name: req.body.name });
    await user.save();
    res.send(user);
});

app.get("/users", async(req, res) => {
    const users = await User.find();
    res.send(users);
});

app.listen(3000, () => console.log("Server running on port 3000"));