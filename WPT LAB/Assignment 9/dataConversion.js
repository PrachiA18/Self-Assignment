let data={
    id:1,
    name:"abc",
    marks:125
}

console.log(data);

let d = JSON.stringify(data);
console.log(d);

let d1 = JSON.parse(d);
console.log(d1);