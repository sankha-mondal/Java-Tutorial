function add(a,b){              // data type any consider. but number of parameter must be match 
    console.log("called...")
}

add(1,2);
add(10.10,20.20);
add("Ravi","Kumar");
//add(2);
//add();

//------------------------------------------------------------------------------------------------------------------

function empInfo(id:number, name:string, age:number){ // number of parameter as well as data-type of parameter must be match
    console.log(id+" "+name+" "+age)
}

empInfo(1,"Ravi",21);
empInfo(1,"Ramu",22);

//--------------------------------------------------------------------------------------------------------------------

function dis1() : string {
     return "Welcome";
}

function dis2() : number {
    return 100;
}

function dis3() : boolean {
    return true;
}

function dis4() : void {
    // return 100;  Error ❌❌❌
}

function dis6() : any {
    return 100;
    //return "Welcome"  or
}

function dis5() {       // by default any type consider so you can return or may not be return. 

}

//-------------------------------------------------------------------------------------------------------------------------

// optional parameter 
function stdInfo1(id:number, name?:string, age?:number): void {
        console.log(id+" "+name+" "+age)
}
stdInfo1(1,"Ravi");
stdInfo1(2,"Ramesh",21);
stdInfo1(3);

//--------------------------------------------------------------------------------------------------------------------------

// default initialization 
function stdInfo2(id:number=0, name:string="Unkown", age:number=18): void {
    console.log(id+" "+name+" "+age)
}
stdInfo2(1,"Ravi");
stdInfo2(2,"Ramesh",21);
stdInfo2(3);

//-----------------------------------------------------------------------------------------------------------------------------

function stdInfo3(id:number, name:string, age:number, skillset?:string[]): void {

}
let skillset:string[]=[];
stdInfo3(1,"Ravi",21,skillset);
stdInfo3(2,"Ramesh",24);

//-------------------------------------------------------------------------------------------------------------------------------

function stdInfo4(id:number, name:string, age:number, ...skillset:string[]): void {
        
}

let skillset1:string[]=["HTML","CSS","JavaScript","ReactJS"];

stdInfo4(1,"Ravi",21);                   //zero 
stdInfo4(2,"Ramesh",24,"C");             // 1
stdInfo4(3,"Rajesh",24,"C","C++","C#");      
stdInfo4(4,"Lokesh",24,"Java","Python","Angular");       // many
stdInfo4(5,"Mahesh",35,skillset1[0],skillset1[1],skillset1[2],skillset1[3]); 
stdInfo4(6,"Raju",32,...skillset1);      // spread operator : it is uses to pass value tor rest operator. 