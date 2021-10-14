//Write a program to illustrate sub class exception precedence over base  class.
package lab10;

import java.io.FileInputStream;

public class BaseClassException {

	public static void main(String[] args) {
		try {
		//load jdbc driver
		Class.forName("oracle.jdbc.driver.OracleDriver");  //throw runtime exception ClassNotFoundException
		//load file
		FileInputStream fis=new FileInputStream("abc/application.txt");  //FileNotFoundException
		//atithmatic
		int a=10/0;   //AtithmaticException
		}catch (Exception e) {
			e.printStackTrace();  //handling all exception by using parent/base class tyep
		}  
	}//main
}//class
