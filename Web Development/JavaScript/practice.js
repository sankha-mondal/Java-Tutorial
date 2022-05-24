// let exam =  {
//     "TimeTable": [ {
//                 "id": 1,
//                 "Period": 1,
//                 "Day": "Monday",
//                 "Subject" : "Maths"
//             }],
//     "Activities": [{
//                 "id": 1,
//                 "activity": "Create Project File",
//                 "subject": "Maths"
//             }],
//     "Extra_Activity": [{
//                 "id":1,
//                 "date":"12/12/2021",
//                 "activity":"Learned Chapter 12",
//                 "Subject":"Science"
//             }]
// };

// // console.log(exam);
// // exam.TimeTable.forEach(val=>document.write("<br>"+val.id));
// // console.log(exam.TimeTable[0].Day);

// function TimeTable_Id() {
//    alert("TimeTable Id is: "+exam.TimeTable[0].id); 
// }
// function TimeTable_Period() {
//     alert("TimeTable Period is: "+exam.TimeTable[0].Period); 
// }
// function TimeTable_Day() {
//     alert("TimeTable Day is: "+exam.TimeTable[0].Day); 
// }
// function TimeTable_Subject() {
//     alert("TimeTable Subject is: "+exam.TimeTable[0].Subject); 
// }

// const Activities_Id = function() {
//     alert("Activities Id is: "+exam.Activities[0].id);
// }
// const Activities_Activity = function() {
//     alert("Activities Activity is: "+exam.Activities[0].activity);
// }
// const Activities_Subject = function() {
//     alert("Activities Subject is: "+exam.Activities[0].subject);
// }

// const Extra_Activity_id = () => alert("Extra Activity Id: "+exam.Extra_Activity[0].id);
// const Extra_Activity_date = () => alert("Extra Activity Date: "+exam.Extra_Activity[0].date); 
// const Extra_Activity_activity = () => alert("Extra Activity Activity: "+exam.Extra_Activity[0].activity); 
// const Extra_Activity_subject = () => alert("Extra Activity Subject: "+exam.Extra_Activity[0].Subject); 

// function time() {
//     document.getElementById("time").innerHTML = Date();
// }

function oper() {
    name = prompt("Enter your name:");
    let ptag = document.createElement("p");
    let ptagCon = document.createTextNode(`Welcome to ${name}`);

    ptag.appendChild(ptagCon);
     document.getElementById("menu").appendChild(ptag);
}