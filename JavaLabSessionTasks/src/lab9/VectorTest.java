package lab9;
import java.util.*;

class VectorTest {
	public static void main(String ar[]) {
		//store values in String obj
		String s = "Delhi";
		String ss = "Chennai";
		//create vector obj having its default value
		Vector v = new Vector();
		//add element to vector
		v.addElement(s);
		v.addElement(ss);
		//print the size of vector
		System.out.println("Size is " + v.size());
	}
}