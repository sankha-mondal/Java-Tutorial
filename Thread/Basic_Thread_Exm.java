public class Basic_Thread_Exm {
	public static void main(String[] args) {
	    
	    	Task taskRunner1 = new Task();
		taskRunner1.start();
		
		// taskRunner1.start();  // we can't
	    
		System.out.println("Hello there..");
		
		Task taskRunner2 = new Task();
		taskRunner2.start();
		
		
	}
}

class Task extends Thread {
    
    	public void run() {
        	          for(int i=0;i<5;i++) {
            		System.out.println("Number "+i);
        	          }
    	}
    
}

       /* O/p:

  	Hello there..
        Number 0
	Number 0
	Number 1
	Number 2
	Number 1
	Number 3
	Number 4
	Number 2
	Number 3
	Number 4

        */
