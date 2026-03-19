Object.prototype.print = function(...s){
    console.log("prototype "+ s);
}

Object.prototype.display = function(){
    console.log("display fucntion");
}

let a= {
    i:100,
    print1(){
        console.log(" a print ");
    }
}
a.print();
a.print1();
a.display();
let data = {
	d: 458,
	print1() {
		console.log(" data  print ");
	}
}

data.print();


let b = {
	i1: 100,
}

console.log(b);
b.print(b.i1, 2, 3);