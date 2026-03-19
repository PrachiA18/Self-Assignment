let ele = [21, 24, 53, 97,34, 67, 34, 70, 98,10];

console.log(ele);

let newArr = ele.filter((num)=>num % 2==0);
console.log(newArr);

newArr = ele.filter((num)=>num % 2 !=0);
console.log(newArr);

console.log(ele);
newArr = ele.sort((n1,n2)=>n1-n2);
console.log(newArr)