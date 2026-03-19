for(var i = 1; i<=100; i++){
    // console.log(i);
    if(i % 5 == 0 && i% 3==0){
        console.log("foobar");
    }
    else if (i% 5==0) {
        console.log("bar");
    } else if(i%3==0) {
        console.log("foo");   
    }
    else{
        console.log(i);
    }
}