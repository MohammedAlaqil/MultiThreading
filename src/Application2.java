
public class Application2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileClass f = new FileClass () ;
	
		FileTask t = new FileTask(f , "x" );
		t.start();
		FileTask t2 = new FileTask(f , "y" );
		t2.start();
		FileTask t3 = new FileTask(f , "z" );
		t3.start();
	}

}
