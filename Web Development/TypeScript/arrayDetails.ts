let obj1:number[]=[];   // literal style array declaration 
let obj2:Array<number>=[];  // generic style array declaration

//---------------------------------------------------------------------

let obj3:number[]=[10,20,30,40,50];
console.log(obj3);
let names:Array<string>=["Ravi","Ramesh","Rajesh","Ajay"];
names.forEach(v=>console.log(v));

//---------------------------------------------------------------------

let info:Array<any>=[100,true,"Ravi",10.10];
let stdNames:Array<string>=["Balaji","Vijay","Ramesh","Raju","Ajay","Mahesh"];
console.log(stdNames)

//---------------------------------------------------------------------

//stdNames.sort((s1,s2)=>s2.localeCompare(s1))
stdNames.sort((s1,s2)=>s1.localeCompare(s2))
console.log(stdNames)

let num1:Array<number>=[10,20,30,40];
let num2 = num1.slice()        // copy value in another array  shallow copy 
let num3 = num1;               // same memory like a reference or pointer Deep copy  
console.log(num1)
console.log(num2)
console.log(num3);
num1.push(100);
console.log(num1)
console.log(num2)
console.log(num3);
