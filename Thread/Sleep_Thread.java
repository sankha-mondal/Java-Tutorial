
public class Sleep_Thread extends Thread {
	
	public void run() {
		System.out.println("Thread 1 is running");
	}

	public static void main(String[] args) throws InterruptedException {
	
		for(int i=0;i<5;i++) {
			Sleep_Thread ts = new Sleep_Thread(); 
			
			ts.start();
			ts.sleep(2000);   	//  sleep() method
		}
		
	}
}
