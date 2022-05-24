
        //  Data Stracture creation
        const JohnsArray = [
            'Jonas',
            'Schmedtmann',
            2037-1991,
            'teacher',
            ['Mihael','Peter','Steven']
        ];

        //  Object creation
        const jonas = {
            firstName: 'Jonas',
            lastName: 'Schmedtmann',
            age: 2037-1991,
            job: 'teacher',
            friend: ['Mihael','Peter','Steven']
        }
        console.log(jonas);

        //  Dit Vs. Bracket Notation:-
        console.log(`First name: ${jonas.firstName}`);
        console.log(`Last name: ${jonas.lastName}`);

        console.log(`First name: ${jonas['firstName']}`);
        console.log(`Last name: ${jonas['lastName']}`);

        const interestedIn = prompt('What do you want to know about Jonas? Choose between firstName, lastName, age, job and friend');
        // console.log(`Result: ${jonas.interestedIn}`); Dot operator fails ❌❌❌
        console.log(`Result: ${jonas[interestedIn]}`);   // Advantage of Bracket operator.
        
        //  Add property
        jonas.location = 'Kolkata';
        console.log(`Jones location: ${jonas.location}`)

        //  Retrieve array element of object
        console.log(`Jones best friend: ${jonas.friend[0]}`);


