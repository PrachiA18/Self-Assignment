const getData = async()=>{
    let y = await "We are in async";
    console.log(y)
}

async function getData1(){
    let y = await "We are in await";
    console.log(y);
    return y;
}



console.log(1);
getData1();
getData();
console.log(2);