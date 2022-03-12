
class TotalCount extends Thread {
	int total = 0;
	
	public void run() {
		
	synchronized (this) {
		for(int i=1;i<=10;i++) {
			total = total + 100;
			}
		}
	}
}


public class Wait_Notify_Thread {

	public static void main(String[] args) throws InterruptedException {
		
		TotalCount tc = new TotalCount();
		tc.start();
		// System.out.println("Total Ammount: " + tc.total);   //  0
		
		synchronized (tc) {
			tc.wait();
			System.out.println("Total Ammount: " + tc.total);	//  1000
		}
	}
}
