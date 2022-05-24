
        //  var - dataType
        var a=10;   //int a=10;
        a=20;       // re-assign        a=20;
        var a =20;  // re-declare       // int a=50;, float a=50;
        document.write("<br/>Value of a "+a);

        for(var i=0;i<1000;i++){

        }
        document.write("<br/> i is "+i);


//-----------------------------------------------------------------------


        //  let - dataType
        let b=10;
        b =20;      // re-assign
        //let b=30;     Error ❌❌❌
        document.write("<br/> The value of b is "+b);
       
        for(let j=0;j<1000;j++){

        }
        //document.write("<br/> j value is "+j);    Error ❌❌❌

//------------------------------------------------------------------------

        const c = 1000;
        //c=2000;       Error ❌❌❌
        

//-----------------------------------------------------------------------


        function display() {
            var m=10;
            let n=20;
            k=30;
        }
        display();
        //document.write("<br/>Value of m is "+m)   Error ❌❌❌
        //document.write("<br/>Value of n is "+n)   Error ❌❌❌
        document.write("<br/> Value of k is "+k)
        


        
