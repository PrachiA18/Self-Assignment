function add(a,b){
    return" addition is " + (a+b);
}
function subtraction(a,b){
    return" subtraction is " + (a-b);
}
function Multiplication(a,b){
    return" Multiplication is " + (a*b);
}
function Divide(a,b){
    return" Division  is " + (a/b);
}


function result(a, b, callback) {
    return callback(a, b);//add()
}



console.log(result(2, 3, add)) ;
console.log(result(2, 3, subtraction));
console.log(result(2, 3, Multiplication));
console.log(result(2, 3, Divide));