
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long x = 100000000 ; 
		x = x*(x+1)/2 ;
		  System.out.println("The total of Sum = " + x);
		  System.out.print("Current Time in milliseconds = ");
	      System.out.println(System.currentTimeMillis());
		
	Sum object1 = new Sum () ;
	Sum object2 = new Sum () ;
	Sum object3 = new Sum () ;
	Sum object4 = new Sum () ;
	Task t = new Task(object1 , 25000000 , 0) ;
	t.start();
	Task t2 = new Task(object2 , 50000000 , 25000001) ;
	t2.start();
	Task t3 = new Task(object3 , 75000000 , 50000001 ) ;
	t3.start();
	Task t4 = new Task(object4 , 100000000 , 75000001) ;
	t4.start();
	 System.out.print("Current Time in milliseconds with multithread after start = ");
     System.out.println(System.currentTimeMillis());
	try { 
		t.join();
		t2.join();
		t3.join();
		t4.join();
		long total = object1.getSum() + object2.getSum() + object3.getSum() + object4.getSum() ;
	    System.out.println("The total of Sum = " + total);
		System.out.print("Current Time in milliseconds with multithread after join and calculate = ");
	    System.out.println(System.currentTimeMillis());
	   
	  
	    
	} catch (Exception e) {
		e.printStackTrace();
	}
	}

}
