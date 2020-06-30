
public class FileTask extends Thread {

	FileClass fileC ; 
	String name ; 
	
	FileTask(FileClass fileC , String name){
		this.fileC = fileC ; 
		this.name = name ;
	}
	
	public void run() {
		try {
		fileC.fileWriting(name);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
