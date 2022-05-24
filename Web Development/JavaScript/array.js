
         // Typy-1 using []
        const friends = ['Michael','John','Peter','Duke'];
        let obj1 = [10,20,30,40,50];
        console.log(friends);
        console.log(friends[1]);
        console.log(friends[friends.length-1]);
        for(i=0; i<friends.length; i++) {
            console.log(friends[i]);
        }

//----------------------------------------------------------------------------------        

        //  Type-2 using Array object
        const years = new Array(2000, 2002, 2004, 2006);
        years[2] = 2010;  //  Update array element
        console.log(years);

//----------------------------------------------------------------------------------

        //  Type-3 Storing different dataTypes elements
        const content = ["Ram","Sita",102,true,50.55];
        console.log(content);

//----------------------------------------------------------------------------------        

        //  Add elements
        const friend = ['John','Duke','Michel'];
        friend.push('Jonson');      // add the element from last
        console.log(`After push(): ${friend}`);
    //----------------------------------------------------------------------------------
        friend.unshift("Rohit");    // add the element from begining 
        console.log(`After unshift(): ${friend}`);

//----------------------------------------------------------------------------------        

        //  Remove elements
        friend.pop();   // remove from last
        console.log(`After pop(): ${friend}`);
    //----------------------------------------------------------------------------------
        friend.shift();   // remove from begining
        console.log(`After shifty(): ${friend}`);

//----------------------------------------------------------------------------------

        // splice : this method is use to add,remove and replace the element in middle,

        obj1.splice(2,1);   //1st parameter index position and 2nd parameter number of elements to remove;

        obj1.splice(1,2);   // from 1 index position remove 2 elements. 

        obj1.splice(2,0,100);   // 1st index position, 2nd number of elements, 3rd add the elements.
                                

        obj1.splice(2,1,100);   // replace 2 position element by 100

        obj1.splice(2,0,1111,2222,3333);    // 3rd to n parameter add elemenet in index position provided in first parameter. 

        document.write("<br/>"+obj1); 

//----------------------------------------------------------------------------------

        //  Others
        console.log(`Index of Duke: ${friend.indexOf('Duke')}`);
        console.log(`Duke present: ${friend.includes('Duke')}`);

//----------------------------------------------------------------------------------

        //  Searching:-
        document.write("<br><b>Searching:-</b><br>");

        //1st Way
        let result1 = obj1.find(search);
        function search(v){
            if(v==10){
                return v;
            } else {
                return undefined;
            }
        }
        document.write("<br/> Search element "+result1);

        //-----------------------------------------------------------------------

        // 2nd way 
        let result2 = obj1.find(function(v){
            if(v==1000){
                return v;
            } else {
                return undefined;
            }
        });
        document.write("<br/> Search element "+result2);

        //--------------------------------------------------------------------------

        //  3rd way 
        let result3 = obj1.find(v=>v==103); // if element present it return that element else it return undefined. 
        document.write("<br/> Search element "+result3);

        //--------------------------------------------------------------------------

        //  4th way
        let result4 = obj1.findIndex(v=>v==1000);    // if element present it return index position of that elemenet else it return -1
        document.write("<br/> index position "+result4);


        
