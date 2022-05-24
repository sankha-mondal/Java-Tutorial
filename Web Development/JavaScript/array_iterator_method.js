var days = [
    { day: 'Monday', time: 5},
    { day: 'Tueday', time: 7},
    { day: 'Wedday', time: 8},
    { day: 'Thuday', time: 11}
];

//  Array Inerator Methods

//  Using forEach method:-
days.forEach(val=>document.write(val.day + ": " + val.time + " hr</br>"));

document.write("--------------------------------</br>");

//  Using Filter method:-
days.filter(val=>val.time>7).forEach(val=>document.write(val.day + ": " + val.time + " hr</br>"));

document.write("--------------------------------</br>");

//days.map(val=>val.time+5).forEach(val=>document.write(val.day + ": " + val.time + " hr</br>"));

var times = [1, 2, 3, 4, 5]; 
//  Using Map method:-
times.map(val=>val+5).forEach(val=>document.write("Time rises: "+val+" hr</br>"));