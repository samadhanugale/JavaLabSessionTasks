//Write a program to illustrate usage of try/catch with finally clause.
package lab10;

import java.util.Scanner;

public class TryCatchFinallyTest {

	public static void main(String[] args) {
		//create scanner obj
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a numbr :- ");
		int a=sc.nextInt();
		//load jdbc driver
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		}//try
		catch (ClassNotFoundException cnf) {
			System.out.println("From Catch block ");
			cnf.printStackTrace();
		} finally {
			sc.close();
			System.out.println("From finally block ");
		}//finally
	}//main
}//class
