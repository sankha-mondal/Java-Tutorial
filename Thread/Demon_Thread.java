

public class Demon_Thread extends Thread{ 
	
	 public void run(){  
	  if(Thread.currentThread().isDaemon()){	//checking for daemon thread  
	   System.out.println("daemon thread work");
	   // System.out.println(Thread.currentThread().getName());
	  }  
	  else{  
	  System.out.println("user thread work");  
	  	}  
	 }  
	 public static void main(String[] args){  
		 	Demon_Thread t1 = new Demon_Thread();		//  creating thread  
		 	Demon_Thread t2 = new Demon_Thread();  	//  creating thread 
		 	Demon_Thread t3 = new Demon_Thread();  	//  creating thread 
	  
		 t1.setDaemon(true);		//now t1 is daemon thread  
	    
		 t1.start();	//	starting threads  
		 t2.start();  	//	starting threads
		 t3.start();  	//	starting threads
	
	 }  
	} 