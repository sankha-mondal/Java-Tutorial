
public class Name_of_Thread {
	public static void main(String[] args) {
	    
	    	Task taskRunner1 = new Task("Thread-A");
		taskRunner1.start();
		
		// taskRunner1.start();  // we can't
	    
		System.out.println("Hello there..");
		
		Task taskRunner2 = new Task("Thread-B");
		taskRunner2.start();
		
		
	}
}

class Task extends Thread {
    
    	String name;
    
    	public Task(String name) {
       	         this.name = name;
     	}
    
    	public void run() {
        	         Thread.currentThread().setName(this.name);
        	         for(int i=0;i<5;i++) {
                                  System.out.println("Number "+i+" - "+Thread.currentThread().getName());
                          }
    	}
    
}

	 /* O/p:

  	Hello there..
        Number 0 - Thread-A
	Number 0 - Thread-B
	Number 1 - Thread-B
	Number 2 - Thread-B
	Number 1 - Thread-A
	Number 3 - Thread-B
	Number 4 - Thread-B
	Number 2 - Thread-A
	Number 3 - Thread-A
	Number 4 - Thread-A

        */

