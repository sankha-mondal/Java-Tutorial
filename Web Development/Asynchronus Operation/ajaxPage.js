let obj;

function loadObject() {
   obj = new XMLHttpRequest();  // pre-defined object, use to make it asynchronnous 
      
      obj.onreadystatechange=callback; // this property keep the track about the reqeust. |  0

      //obj.open("Get","demo.txt");   // method get to get the data and page is static    |  1
      obj.open("get","https://jsonplaceholder.typicode.com/todos");

      obj.send();    // send the request     |   2
     // alert(obj.responseText);
}


function callback() {
   // alert(obj.readyState); 

    if(obj.readyState == 4){
        alert(obj.responseText);          //  give data from the static page i.e demo.txt
        console.log(obj.responseText);    //  date shows in String format in consol  |  Op : 1

            //   let data = JSON.parse(obj.responseText);   //  converting String to json.  |  Op : 2
            //   console.log(data)
            //   data.forEach(d=>console.log(" id is "+d.id+" title is "+d.title));

     }  else {
         alert(obj.readyState); 
     } 
}



         /*    AJAX : (Asynchronous JavaScript and XML)

         Using XMLHttpRequest. It is a pre-defined object. which help to make the request as Asynchronous. 	

         obj.readyState
         readyState --> 
            0 : not initialize yet 
            1 : ready to send the request to page or resource 
            2 : request sent. 
            3 : request processing in servier side.
            4 : means ready to give the response 
         */
