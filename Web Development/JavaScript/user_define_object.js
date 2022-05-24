// literal style object creation 
var emp = {
    id : 100,
    name : "Ravi",
    salary : 25000,
    skillSet : ["C", "Java", "Python"],
    address : {
        city : "Bangalore",
        state : "Karnataka"
    },
    projects : [
        {pId:1001, pName:"Web", technology:"Angular"},
        {pId:1002, pName:"Desktop", technology:"Core Java"},
        {pId:1003, pName:"Mobile", technology:"React"}
    ]
};

//----------------------------------------------------------

document.write("<br><b><u>Object creation in literal style</u></b>");
document.write("<br>Id is: "+emp.id);
document.write("<br>Name is: "+emp.name);
document.write("</br>Salary is: "+emp.salary);
emp.age = 30;
document.write("</br>Age is: "+emp.age);
for(key in emp) {
    document.write("<br>******"+key+": "+emp[key]);
}
emp.sayHello = function() {
    document.write("<br>Hello Employee..")
}
emp.sayHello();


//----------------------------------------------------------

document.write("</br>Skill Set are: "+emp.skillSet[0]+", "+emp.skillSet[1]+", "+emp.skillSet[2]);
emp.skillSet.forEach(val=>document.write("<br>Skill set: "+val));

//----------------------------------------------------------

document.write("<br>City is: "+emp.address.city);
document.write("<br>City is: "+emp.address.state);

//----------------------------------------------------------

document.write("<br>IT technology: "+emp.projects[0].technology);
document.write("<br>IT technology: "+emp.projects[1].technology);
document.write("<br>IT technology: "+emp.projects[2].technology);
emp.projects.forEach(p=>document.write("<br>Id: "+p.pId+" Name: "+p.pName+" Technology: "+p.technology));

//==================================================================================

// Function style object creation
document.write("<br><br><b><u>Function Style Object creation</u></b>");
function Employee() {
    this.id = 101,
    this.name = "Ravi",
    this.age = 22,
    this.empInfo = function() {
        document.write("<br>Employee Object:");
        document.write("<br>Employee Id: "+this.id);
        document.write("<br>Employee Name: "+this.name);
        document.write("<br>Employee Age: "+this.age);
    }
}
//Employee();     // normal function consider
var emp1 = new Employee();      // memory created for Employee object.. 
emp1.empInfo();
alert("id is "+emp1.id+" Name is "+emp1.name+" Age is "+emp1.age);
var emp2 = new Employee();      // memory created for Employee object.. 
emp2.empInfo();
alert("id is "+emp2.id+" Name is "+emp2.name+" Age is "+emp2.age);

//--------------------------------------------------------------

//  Function style object creation with dynamic value
document.write("<br><br><b><u>Function Style Object creation with Dynamic value</u></b>");
function Employees(id, name, age) {
    this.id = id,
    this.name = name,
    this.age = age,
    this.empInfo = function() {
        document.write("<br>Employee's Object:");
        document.write("<br>Employee's Id: "+this.id);
        document.write("<br>Employee's Name: "+this.name);
        document.write("<br>Employee's Age: "+this.age);
    }
}
var emp1 = new Employees(100,"Ravi",21);     // different memory with different values. 
emp1.empInfo();
var emp2 = new Employees(101,"Ramesh",25);   // different memory with different values. 
emp2.empInfo();

//--------------------------------------------------------------

// Adding dynamic property and behaviour "Outside" of Class-object
document.write("<br><br><b><u>Adding dynamic property and behaviour Outside of Class-object</u></b>");
function Outside(id, name, age) {
    this.id = id;              // instance variable 
    this.name = name;
    this.age = age;
    this.disInfo = function() {                 // instance function or methods 
        document.write("<br/> OutSide object");
        document.write("<br/> Id is "+this.id);
        document.write("<br/> Name is "+this.name);
        document.write("<br/> Age is "+this.age);
    }
}
var emp1 = new Outside(100,"Ravi",21);     // different memory with different values.
emp1.disInfo();

document.write("<br>Emp Id "+emp1.id);
document.write("<br>Emp Id "+emp2.id);
document.write("<br>Mgr Id "+emp1.mgrId);

Outside.prototype.mgrId = 123;         // adding dynamic property for object. 
emp1.mgrId=1234
document.write("<br>Mgr Id "+emp1.mgrId);

Outside.prototype.info = function(){    // adding dynamic property for object. 
    document.write("<br>Id: "+this.id+" Name: "+this.name+" Age: "+this.age+" Mang Id: "+this.mgrId);
}
emp1.info();

//--------------------------------------------------------------




