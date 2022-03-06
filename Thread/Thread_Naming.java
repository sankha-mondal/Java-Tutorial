	//  Naming of Thread - Thread.currentThread().getName()


public class Thread_Naming extends Thread{ 
		
		public static void main(String[] args){  
				Demon_Thread t1 = new Demon_Thread();		//  creating thread  
				Demon_Thread t2 = new Demon_Thread();  		//  creating thread 
				Demon_Thread t3 = new Demon_Thread();  		//  creating thread 
			  
				Thread.currentThread().setName("Thread1");
				System.out.println(Thread.currentThread().getName());
				System.out.println(t1.currentThread().getName());
				System.out.println(t2.currentThread().getName());
				
				Thread.currentThread().setName("Thread2");
				System.out.println(Thread.currentThread().getName());
				System.out.println(t1.currentThread().getName());
				System.out.println(t2.currentThread().getName());
			
			  
			
	}
}
