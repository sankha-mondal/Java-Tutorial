import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_Operations {
	public static void main(String[] args) {

		/**
		 * Stream Intermediate Operations:-
		 * 
		 * 		Distinct
		 * 		Map
		 * 		Filter
		 * 		Sorted
		 * 		Limit
		 * 
		 * Stream Terminal Operations:-
		 * 
		 * 		Count
		 * 		Collect
		 * 		forEach
		 */

/* ********************************************************  -:Stream Intermediate Operations:-  ************************************************************ */
		
		
		//  Distinct Operation -->
		
		/**
		List<String> name = new ArrayList<>();
		name.add("Rahul");
		name.add("Lorry");
		name.add("Rahul");
		name.add("Vijoy");
		name.add("Rahul");
		
		Stream<String> nameStream = name.stream();			//  Converting into Stream 
		Stream<String> nameDistinct = nameStream.distinct();		//  Stream-> Distinct Operation
		
		nameDistinct.forEach( (n) -> System.out.print(n + " ")); 	//  O/p: Rahul Lorry Vijoy  
		 */
		 
//____________________________________________________________________________________________________________________________________________________________		
		
		//	Map Operation -->
		
		/**
		Stream<Integer> number = Stream.of(1,2,3,4,5);
		Stream<Integer> sqNumber = number.map(num -> num*num);		//  Stream-> Map Operation
		
		sqNumber.forEach( (num) -> System.out.print(num + " ")); 	//  O/p: 1 4 9 16 25  
		 */
		
//____________________________________________________________________________________________________________________________________________________________		
		
		//	Filter Operation -->
		
		/**
		Stream<Integer> number = Stream.of(1,2,3,4,5,6,7,8,9);
		Stream<Integer> evenNumber = number.filter(num -> num%2==0);		//  Stream-> Filter Operation
		
		evenNumber.forEach( (num) -> System.out.print(num + " "));		//  O/p: 2 4 6 8 
		*/
		
//____________________________________________________________________________________________________________________________________________________________		
		
		//	Sorted Operation -->
		
		/**
		List<String> name = new ArrayList<>();
		name.add("Rahul");
		name.add("Lorry");
		name.add("Rahul");
		name.add("Vijoy");
		name.add("Anita");
		
		Stream<String> nameStream = name.stream();				//  Converting into Stream 
		Stream<String> nameSorted = nameStream.sorted();			//  Stream-> Sorted Operation
		
		nameSorted.forEach( (n) -> System.out.print(n + " ")); 			//  O/p: Anita Lorry Rahul Rahul Vijoy
		*/
		
//____________________________________________________________________________________________________________________________________________________________		
		
		//	Limit Operation -->
		
		/**
		Stream<Integer> number = Stream.of(10,40,30,70,80,20,50,70);
		Stream<Integer> limitNumber = number.limit(5);				//  Stream-> Limit Operation
		
		limitNumber.forEach( (num) -> System.out.print(num + " "));		//  O/p: 10 40 30 70 80 
		*/
		
/* ********************************************************  -:Stream Terminal Operations:-  **************************************************************** */
		
		//	Count Operation -->
		
		/**
		Stream<Integer> number = Stream.of(10,40,30,70,80,20,50,70);
		System.out.println(number.count());   				//  Stream-> Count Operation,  O/p: 8
		*/
		
//____________________________________________________________________________________________________________________________________________________________		
		
		//	Collect Operation -->	
		
		/**
		Stream<Integer> number = Stream.of(10,40,80,20,50,70);
		//  Convert the above Stream of number into List of number
		
		List<Integer> list = number.collect(Collectors.toList());	//  Stream-> Collect Operation
		System.out.println(list);					//  O/p: [10, 40, 80, 20, 50, 70]
		*/

//____________________________________________________________________________________________________________________________________________________________
		
		//	forEach Operation -->
		
		/*
		Stream<Integer> number = Stream.of(10,40,20,50);
		number.forEach( (num) -> System.out.print(num + " "));  //  Stream-> forEach Operation,  O/p: 10 40 20 50 
		*/
		
		
	}
}


