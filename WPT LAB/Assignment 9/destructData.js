let data={
    bookId:1,
    bookName:"Javascript"
}

console.log(data);
let{id, name} = data;
console.log(id +" "+ name);
let{bookId: id1} = data;
let{bookName : name1} = data;

console.log(id1);