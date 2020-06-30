
public class Task3 extends Thread {

	public void run(){
	
		Thread.currentThread().setName("Thread 2 ");
		
	    for(int i=0; i<5; i++){
	    System.out.println(i);
		if (Thread.interrupted())  	 {    
	   	  System.out.println(Thread.currentThread().getName() + "interrupted");
		} 
		}			
	}

}
