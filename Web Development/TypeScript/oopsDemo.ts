// ES5 function style :-
function Customer() {
    this.cid = 100;
    this.cname = "Ravi";
    
    this.disCustInfo = function() {
        console.log("Customer function")
        console.log("Id is "+this.cid);
        console.log("name is "+this.cname);
    }
}
var cust1  = new Customer();
cust1.disCustInfo();

console.log("==============================================================================");

//ES6 class style :-
class Employee {
    eid:number = 100;
    ename:string ="Ravi";

    disEmpInfo() : void {
        console.log("Employee function")
        console.log("id is "+this.eid);
        console.log("name is "+this.ename);
    }
}

let emp = new Employee();
emp.disEmpInfo();

console.log("==============================================================================");

// constructor concept 
class Employee1 {
    eid:number = 100;
    ename:string ="Ravi";

    constructor() {
        console.log("constructor | object created....");
    }
    disEmpInfo() : void {
        console.log("Employee function")
        console.log("id is "+this.eid);
        console.log("name is "+this.ename);
    }
}

let emp1 = new Employee1();
emp1.disEmpInfo();

console.log("==============================================================================");

// Parameterized | Default value constructor :-  
class Employee2 {
    private eid:number;
    private ename:string;
    constructor(eid:number=0, ename:string="Unknown") {
        this.eid = eid;
        this.ename=ename;
    }
    disEmpInfo() : void {
        console.log("Employee function")
        console.log("Id is: "+this.eid);
        console.log("Name is: "+this.ename);
    }
}

let emp2 = new Employee2(1,"Ravi");
emp2.disEmpInfo();
let emp3 = new Employee2(2)
emp3.disEmpInfo();
let emp4 = new Employee2();
emp4.disEmpInfo();

console.log("==============================================================================");

// Contructor short cut initialization:-   
class Employee3 {
    //private eid:number;
    //private ename:string;
    constructor(private eid:number=0,public ename:string="Unknown") {
        //this.eid = eid;
        //this.ename=ename;
    }
    disEmpInfo() : void {
        console.log("Employee function")
        console.log("Id is: "+this.eid);
        console.log("Name is: "+this.ename);
    }
}
let emp5 = new Employee3(1,"Ravi");
emp5.disEmpInfo();
let emp6 = new Employee3(2)
emp6.disEmpInfo();
let emp7 = new Employee3();
emp7.disEmpInfo();

console.log("==============================================================================");

// contructor short cut initialization   
class Employee4 {
    constructor(private eid:number=0,private ename:string="Unknown") {
    }
    disEmpInfo() : void {
        console.log("Employee function")
        console.log("Id is: "+this.eid);
        console.log("Name is: "+this.ename);
    }
}
let emp8 = new Employee4(1,"Raju");
emp8.disEmpInfo();
let emp9 = new Employee4(2)
emp9.disEmpInfo();
let emp10 = new Employee4();
emp10.disEmpInfo();

console.log("==============================================================================");

//  Access specifire
class MyClass {
    private a:number = 100;
    protected b:number = 200;
    public c:number = 300;
    d:number = 400;
}

let obj = new MyClass;
   // console.log(obj.a);       //  private:- can't be access outside of same class
   // console.log(obj.b);       //  protected:- access only inside the child class
    console.log(obj.c);         //  public:- access every where
    console.log(obj.d);         //  default:- default act as public

console.log("==============================================================================");

interface MyInterface {
    id:number;
    name:string;

    demo():void;
    demo1():string;
}