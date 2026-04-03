const express = require('express');
const app = express();


app.use(express.json());

app.get('/', (req, res) => {
    res.send("Welcome to My Express App");
});

   
app.get('/about', (req, res) => {
    res.send("This is About Page");
});


app.get('/user/:id', (req, res) => {
    let userId = req.params.id;
    res.send("User ID is: " + userId);
});

app.post('/addUser', (req, res) => {
    let user = req.body;
    res.send("User added: " + JSON.stringify(user));
});


app.put('/updateUser/:id', (req, res) => {
    let userId = req.params.id;
    let updatedData = req.body;
    res.send(`User ${userId} updated with data: ${JSON.stringify(updatedData)}`);
});

app.delete('/deleteUser/:id', (req, res) => {
    let userId = req.params.id;
    res.send(`User ${userId} deleted`);
});


app.listen(3000, () => {
    console.log("Server running on http://localhost:3000");
});