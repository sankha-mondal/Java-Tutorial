


class Thread1 extends Thread {   // Type: 1 - Using extends Thread
	public void run() {
		try {
			for(int i=0;i<5;i++) {
			    Thread.sleep(1000);
			    System.out.println("Thread-1 is running");
			}
		}
		catch (Exception e) {
			System.out.println("Something went wrong: " + e);
		}
	}
}


class Thread2 implements Runnable {   // Type: 2 - Using implements Runnable
	public void run() {
		try {
			for(int i=0;i<5;i++) {
			    Thread.sleep(500);
			    System.out.println("Thread-2 is running");
			}
		}
		catch (Exception e) {
			System.out.println("Something went wrong: " + e);
		}
	}
}


public class Behaviour_Thread {
	public static void main(String[] args) {

			Thread1 t1 = new Thread1();  // Type: 1 - Using extends Thread
			t1.start();
			
			Thread t2 = new Thread(new Thread2());   // Type: 2 - Using implements Runnable
			t2.start();
			
			Thread t3 = new Thread(new Runnable() {   // Type: 3 - Using Anonymous class 
			    
			    @Override
			    public void run() {
			           try {
			                for(int i=0;i<5;i++) {
			               Thread.sleep(400);
			                       System.out.println("Thread-3 is running");
			                }
			           }
		                   catch (Exception e) {
			                System.out.println("Something went wrong: " + e);
		                   }
			     }
			});
			t3.start();
		
	}
}