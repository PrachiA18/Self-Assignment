

function call() {
    console.log("start");

    setTimeout(() => {
        console.log("in setTimeout");
    }, 2000)

    setInterval(() => {
        console.log("in setInterval");
    }, 5000);


    let id = setInterval(call1, 2000);
    let cnt = 1;

    function call1() {
        console.log("call1");
        cnt++;

        console.log(cnt);

        if (cnt == 5) {
            clearInterval(id);
        }
    }
    console.log("end");



}

call();