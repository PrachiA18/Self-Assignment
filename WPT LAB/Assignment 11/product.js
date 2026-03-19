const fs = require('fs')

fs.writeFileSync("product.txt" , "product1");
fs.writeFileSync("product.txt", "product2");
// fs.appendFile("product.txt", "product3");

let data = "Hello Prachi!!!";
fs.writeFile('product.txt', data, 'utf8', (err)=>{
    if(err){
        console.log('error in file', err);
        return;
    }
    console.log('File written successfully!');
});

