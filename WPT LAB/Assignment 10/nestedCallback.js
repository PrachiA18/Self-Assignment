console.log("In file");

function step1(callback){
    setTimeout(()=>{
        console.log("step 1 completed");
        callback()
    },5000);
}

function step2(callback){
    setTimeout(()=>{
        console.log("step 2 completed");
        callback()
    },1000);
}

function step3(callback){
    setTimeout(()=>{
        console.log("step 3 completed");
        callback()
    },2000);
}


step1(()=>{
    step2(()=>{
        step3(()=>{
            console.log("Inside callback")
        });
    });
});