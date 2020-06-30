public class Task2 extends Thread {
	
	public void run(){  
		Thread.currentThread().setName("Thread 1 ");
		try{  
		Thread.sleep(1500);  
		} catch(InterruptedException e){  
		System.out.println(Thread.currentThread().getName()+ e.getMessage());
		}  
		
		}  
}
