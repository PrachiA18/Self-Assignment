export function check(){
    let a='12345678as';
    let sum =0;
    for (var i =0; i<a.length ; i++)
    {
        if(!isNaN (a[i]) )
            sum += parseInt(a[i]);
    }
    console.log("Addition is " + sum)
    console.log(`sum of ${a} is ${sum}`);
}

// check();