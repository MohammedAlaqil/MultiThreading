import java.io.*;

public class FileClass {
  //Synchronize 
	synchronized public void fileWriting(String n) throws IOException {
	
    String str = "Thread " + n + " started writing \n";
    String str2 = "Thread " + n + " currently writing\n";
    String str3 = "Thread " + n + " finished writing\n";
    File file = new File("Sharable.txt");
    FileOutputStream outputStream = new FileOutputStream(file , true);
    byte[] strToBytes = str.getBytes();
    byte[] strToBytes2 = str2.getBytes();
    byte[] strToBytes3 = str3.getBytes();
    outputStream.write(strToBytes);
    outputStream.write(strToBytes2);
    outputStream.write(strToBytes3);
    
    outputStream.close();
	}
	
}
