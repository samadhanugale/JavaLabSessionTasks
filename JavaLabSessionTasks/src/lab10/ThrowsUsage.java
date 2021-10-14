package lab10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsUsage {
        public static void main(String[] args) {
        	//create obj of that class
        	FileRead read=new FileRead();
        	//now call that class method (handle exception here is mandatory)
        	try {
        		read.readFile();
        	}catch (Exception e) {
			e.printStackTrace();
			}	
		}//main
}//class
 
//class which uses throws
class FileRead{
	public void readFile()throws FileNotFoundException {
		//load file
		FileInputStream fis=new FileInputStream("abc.text");  //checked exception FileNotFound
	}//loadfile
}//class