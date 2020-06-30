
public class Task extends Thread {
	private int upper ; 
	private int lower ;
	private Sum sumValue ; 
	
	public Task(Sum sumValue , int upper , int lower ) {	
		this.upper= upper ;
		this.lower = lower ;
		this.sumValue = sumValue ; 
	}
	
	public void run() {
		long sum = 0 ; 
		for(int i=lower ; i<=upper ; i++) {
		sum += i ; 
		}
		sumValue.setSum(sum);
	
		
		
	}
}
