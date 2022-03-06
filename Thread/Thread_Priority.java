
public class Thread_Priority extends Thread {

	public static void main(String[] args) {
		Thread_Priority th1 = new Thread_Priority();
		Thread_Priority th2 = new Thread_Priority();
		Thread_Priority th3 = new Thread_Priority();
		
		// We did not mention the priority of the thread.  
		// Therefore, the priorities of the thread is 5, the default value  
		  
		// 1st Thread  
		// Displaying the priority of the thread  
		// using the getPriority() method  
		System.out.println("Priority of the thread th1 is : " + th1.getPriority());  
		
		// 2nd Thread   
		// Display the priority of the thread  
		System.out.println("Priority of the thread th2 is : " + th2.getPriority());  
		  
		// 3rd Thread   
		// // Display the priority of the thread  
		System.out.println("Priority of the thread th2 is : " + th2.getPriority()); 
		
		// Setting priorities of above threads by  
		// passing integer arguments  
		th1.setPriority(6);  
		th2.setPriority(3);  
		th3.setPriority(9); 
		
		//  New Thread priority 
		System.out.println("New Thread priority:");
		System.out.println("Priority of the thread th1 is : " + th1.getPriority());  
		System.out.println("Priority of the thread th1 is : " + th2.getPriority());  
		System.out.println("Priority of the thread th1 is : " + th3.getPriority());  
	}
		
	
}
