import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//example of java synchronized method  
class Table1 {  
	
	Lock locker = new ReentrantLock();
	
	void printTable(int n)	{
		try {
		locker.lock();			//  Thread lock  
		 
		for(int i=1;i<=5;i++){  
			System.out.println(n*i);  
			try  {  
				Thread.sleep(400);  
			}  catch(Exception e)  {
				System.out.println(e);}  
			}  
		}
		finally {
			locker.unlock();		//  Thread Un-lock  
		}
	}  
}  

class NewThread1 extends Thread {  	//   Thread NewThread1 class
	Table1 t;  
	NewThread1(Table1 t)  {  
		this.t=t;  
	}  
	public void run(){  
		t.printTable(5);  
	}  
}  

class NewThread2 extends Thread{  	//   Thread NewThread2 class
	Table1 t;  
	NewThread2(Table1 t){  
		this.t=t;  
	}  
	public void run(){  
		t.printTable(100);  
	}  
}  

public class Lock_Thread {  
	public static void main(String args[]){  
		
		Table1 obj = new Table1(); //only one object 
		
		NewThread1 t1=new NewThread1(obj);  
		NewThread2 t2=new NewThread2(obj);  
		
		t1.start();  
		t2.start();  
}  
}  