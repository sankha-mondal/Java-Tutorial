
        //  Function decoration:-
        //  const age1 = calcAge1(2000);  ✔✔✔
        function calcAge1(birthYear) {
            return 2022 - birthYear;
        }
        const age1 = calcAge1(2000);
        console.log(`My age is ${age1} year with respect to 2022`); 

//---------------------------------------------------------------------------

        //   Function expression:-
        //   const age2 = calcAge2(2000);  ❌❌❌
        const calcAge2 = function (birthYear) {
            return  3022 - birthYear;
        }
        const age2 = calcAge2(2000);
        console.log(`My age is ${age2} year with respect to 3022`); 

//----------------------------------------------------------------------------

        //  Arrow function:-
        //  const age3 = calcAge3(2000);    ❌❌❌
        const calcAge3 = (birthYear) => {
            return 4022 - birthYear;
        }
        const age3 = calcAge3(2000);
        console.log(`My age is ${age3} year with respect to 4022`);

//-----------------------------------------------------------------------------

        //  Function with Zero parameter   
        function zero() {     
            return `My name is Kamal Roy🧔🏻`;
        }
        console.log(zero());

//----------------------------------------------------------------------------

        //  Function with multiple parameters
        function multiple(fName, lName) {
            return `My name is ${fName} ${lName}👨🏻‍💼`;
        }
        console.log(multiple("Anil","Roy"));

//----------------------------------------------------------------------------

        //  Function calling from another function:-  
        function appleNeed(apple) {
            return 2*apple;
        }
        function mangoNeed(mango) {
            return 3*mango;
        }
        function juice(a, m) {
            var apple = appleNeed(a);
            var mango = mangoNeed(m);
            const juice = `Juice with ${apple} apples and ${mango} mangos is ready..🍻`;
            return juice;     
        } 
        const process = juice(2,3);
        console.log(process);

//--------------------------------------------------------------------------------

        // find largest using expression style 
        let findLargest1 = function(a,b){
            if(a>b){
                return "a is largest"
            }else {
                return "b is largest"
            }
        }
        document.write("<br/> Largest using expressioin style "+findLargest1(100,50));

//---------------------------------------------------------------------------------

        // find largest using arrow style  
        let findLargest2 = (a,b)=>{
            if(a>b){
                return "a is largest"
            } else {
                return "b is largest"
            }
        }
        document.write("<br/> Largest using expressioin style "+findLargest2(100,50));

//-----------------------------------------------------------------------------------

        //    Callback() function:-        
        function greeting(fname,callback){
            return "Welcome "+callback(fname);
        }
        let maleInfo = function(fname){
            return "Mr. "+fname;
        }
        let femaleInfo = (fname)=>"Miss. "+fname;

        document.write("<br/> "+greeting("Raj ",maleInfo));
        document.write("<br/> "+greeting("Seeta",femaleInfo));
        document.write("<br/> "+greeting("Ramesh",function(fname){
            return "Mr. "+fname;
        }));
        document.write("<br/> "+greeting("Meeta",(fname)=>"Miss. "+fname));

