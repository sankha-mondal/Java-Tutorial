function get_fat() {

    fetch("https://jsonplaceholder.typicode.com/todos")
    .then(res=>res.json())
    //.then(result=>console.log(result))
    .then(result=>document.write(result[3].title)) 
    //.then(result=>console.log(result[3].title+" | "+result[2].title))
    .catch(error=>document.write(error));

}



    /*  Fetch() : it is pre-defined function which is use to send the 
        request to backend technologies for get as well as store the data. 
        Fetch method return type is promise object. 
        Then and catch  */
