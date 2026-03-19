let b = {
	"id":"100",
	"name":"abc",
	"Email":"abc@gmail.com"
}


let arr=[];

for (const key in  b) {
    if (!Object.hasOwn(b, key)) continue;
    
    const element = b[key];
    console.log(key + "   " + element);
    
    
}