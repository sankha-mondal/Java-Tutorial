class MyClass {
    private a :number=10;
    public b:number =20;
    protected c:number =30;
    d:number =40;
}

class AnotherClass extends MyClass {

    displayInfo(): void {
                //console.log("a "+this.a);     can't access 
        console.log(" b "+this.b);      // public can access 
                 console.log("c "+this.c);       // protected we can access within a sub class. 
        console.log("d "+this.d);          // can access 
    }
}



let obj1 = new MyClass();
//console.log(obj1.a) // private within a same class 
console.log(obj1.b);   // public we can access outside a class 
//console.log(obj1.c);    // protected can't access outside a class with object also 
console.log(obj1.d);        // default can access like public 

//private can access only within a same class protected can be access within same class 
// as well as sub class also. 