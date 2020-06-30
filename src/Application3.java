
public class Application3 {

	public static void main(String [] args) {
		
	
	Task2 t = new Task2() ;
	Task3 t2 = new Task3() ;
	t.start();
	t2.start();

	System.out.println("Thread 1 before interrupt " + t.getState());
	System.out.println("Thread 2 before interrupt " + t2.getState());
	t.interrupt();
	t2.interrupt();
	System.out.println("Thread 1 after interrupt " + t.getState());
	System.out.println("Thread 2 after interrupt " + t2.getState());
	try 
    { 
        t.join(); 
        t2.join();
    }  
    catch (InterruptedException e) { 
        System.out.println(e.getMessage());
    } 
	
    System.out.println("Thread 1 after calling Join and finsh execution - " +  t.getState()); 
    System.out.println("Thread 2 after calling Join and finsh execution - " +  t2.getState()); 
	}
}
