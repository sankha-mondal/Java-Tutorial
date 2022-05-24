let num = [10,20,30,40,50,60];
document.write("<b><u>Type of loop</u></b><br/>");

//  Using Normal for loop
document.write("<br/>A) <u>Using Normal loop</u>")
for(let i=0; i<num.length; i++){
    document.write("<br/> Value is "+num[i])
}

document.write("<br>----------------------------------------------------------------");

//  Using for-in loop
document.write("<br/>B) <u>Using for in loop</u>")
for(let i in num) {          // it will give index position 
    document.write("<br/> index is  "+i+" Value is "+num[i])
}

document.write("<br>----------------------------------------------------------------");

//  Using for-of loop
document.write("<br/>C) <u>using for of loop</u>");
for(let n of num) {         // it will give value directly 
    document.write("<br/> Value is  "+n)
}

document.write("<br>=================================================================");

//  Array Iteratior methods:-

//  Using for-each loop  
document.write("<br/>D) <u>Using for each function</u>");
num.forEach(v=>document.write("<br/> Value is "+v));

document.write("<br>----------------------------------------------------------------");

//  Using map+forEach
document.write("<br/>E) <u>Display the element with intermediate element map</u>");
num.map(v=>v+100).forEach(v=>document.write("<br/> Value is "+v));

document.write("<br>----------------------------------------------------------------");

//  Using filter
document.write("<br/>F) <u>Intermediate function as filter</u>");
num.filter(v=>v%2==0).forEach(v=>document.write("<br/> Value is "+v));


