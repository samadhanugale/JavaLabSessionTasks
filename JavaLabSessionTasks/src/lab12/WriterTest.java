package lab12;



import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
class WriterTest
{
 public static void main(String[] args) throws IOException
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a String ");
     // Accept a string 
     String str = sc.nextLine();

     // attach a file to FileWriter 
     FileWriter fw=new FileWriter("c://java//output.txt");
     // read character wise from string and write 
     // into FileWriter 
     for (int i = 0; i < str.length(); i++)
         fw.write(str.charAt(i));
     System.out.println("Writing successful");
     //close the file 
     fw.close();
 }//main
}//class