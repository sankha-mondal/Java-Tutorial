


class Thread1 extends Thread {
	public void run() {
		try {
			System.out.println("Thread 1 is running");
		}
		catch (Exception e) {
			System.out.println("Something went wrong: " + e);
		}
	}
}


class Thread2 implements Runnable {
	public void run() {
		try {
			System.out.println("Thread 2 is running");
		}
		catch (Exception e) {
			System.out.println("Something went wrong: " + e);
		}
	}
}


public class Behaviour_Thread {
	public static void main(String[] args) {

		
		for(int i=0;i<5;i++) {
			Thread1 t1 = new Thread1();
			t1.start();
			
			Thread t2 = new Thread(new Thread2());
			t2.start();
		}
	}
}
