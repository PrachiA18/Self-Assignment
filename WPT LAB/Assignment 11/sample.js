const fs = require('fs');

let content = fs.readFileSync("sample.txt", 'utf8');
console.log("Reading Synchronous File ");
console.log(content);


fs.readFile("sample.txt", 'utf8', (err, data)=>{
    if(err)
        console.log(err)
    console.log(data)
})