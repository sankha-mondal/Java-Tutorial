// ES5 style promise object creation 

var obj1 = new Promise(function(resolved, rejected){
    resolved("successfully done the task....")
})

obj1.then(function(data){
    console.log("Then called..."+data);
}).catch(function(error){
    console.log("Catch called..."+error);
})




//ES6 style promise object creation 

var obj2 = new Promise((resolved, rejected)=>{
    rejected("Error geneated....")
})

obj2.then((data)=>console.log("Then called... "+data)).catch(error=>console.log("catch called... "+error));












    /*    Promise : Promise is a pre-defined object provide by JavaScript which is use to handle 
        asynchronous event of data. 
        Promise can be resolved and can be rejected.        */






    /*    User-defined 

        To load the data form the promise object we have to use then() and catch(). 
        Then and catch take callback function as a parameter. 
        Then will call if promise resolved and catch get call if promise rejected.      */
