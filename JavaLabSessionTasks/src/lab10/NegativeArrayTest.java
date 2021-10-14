package lab10;

public class NegativeArrayTest {
	public static void main(String a[]) {
		try {
			int a1[] = new int[-2];
			System.out.println("first element : " + a1[0]);
		} catch (NegativeArraySizeException n) {
			System.out.println("generated exception : " + n);
		}
		System.out.println("After the try block");
	}//main
}//class
