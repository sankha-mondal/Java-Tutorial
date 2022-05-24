//  Displaying data in Console:
function get_fetch1() {

    fetch("http://localhost:3000/employees")
    .then(res=>res.json())
    .then(result=>console.log(result))          
    .catch(error=>console.log(error));

}







//  Displaying data in Browser: ES6 style
function get_fetch2() {

    fetch("http://localhost:3000/employees",{method:"GET"})
    .then(res=>res.json())
    .then(result=>{
        //  document.getElementById("data").innerHTML = result;    //  gives only object. 
        let empData = result.map(e=>"Id: "+e.id+" Name: "+e.name+" Age:"+e.age+"<br>");
        document.getElementById("data").innerHTML = empData;
        //  map takes one-one object as input & give the outout
    })
    .catch(error=>console.log(error));
}






//  Displaying data in Browser: ES7 style
//  await is used to replacement of then & catch of ES6 style.
//  await converts from asynk to synk format. 
async function get_fetch3() {

        try{
        let response = await fetch("http://localhost:3000/employees",{method:"GET"});
        let result = await response.json();
        let empInfo = result.map(e=>"Id: "+e.id+" Name: "+e.name+" Age:"+e.age+"<br>");
        document.getElementById("data").innerHTML=empInfo;
        
        }catch(ex){
            console.log(ex)
        }
}








//  Adding data Dynamically:
function addData() {

        let idVal = document.getElementById("id").value;
        let nameVal = document.getElementById("name").value;
        let ageVal = document.getElementById("age").value;

        fetch("http://localhost:3000/employees",{         //   here fetch takes 3 parameter       
            method:"POST",
            body:JSON.stringify({
                id:idVal,
                name:nameVal,
                age:ageVal
            }),
            headers:{
                "content-type":"application/json"
            }
        })
        .then(result=>alert("New data added"))          
        .catch(error=>console.log(error));

        document.getElementById("id").value="";
        document.getElementById("name").value="";
        document.getElementById("age").value="";
}


















    /*  Fetch() : it is pre-defined function which is use to send the 
        request to backend technologies for get as well as store the data. 
        Fetch method return type is promise object. 
        Then and catch  */
