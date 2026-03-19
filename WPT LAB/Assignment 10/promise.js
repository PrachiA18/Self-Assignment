console.log("This executes first");

function add(a,b){
    return a+b;
}

add(4,5);

function time(){
    setTimeout(()=>{
     console.log("Hello I am in setTimeout")
    }, 10000);
}

time();




let p = new Promise((resolve, reject)=>{
    let n =5;
    if(n % 2!=0) resolve("Number " + n + " is even number")
        reject("false")
});

p.then((message => console.log(message)))
 .catch((error => console.log(error)));