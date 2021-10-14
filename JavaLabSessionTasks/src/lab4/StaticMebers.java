package lab4;

public class StaticMebers {
	
	static int a=30;
	static int b=50;
	
	
	static void m1() {
		System.out.println("This is Static Method");
	}
	
	//Static Block
	static {
		System.out.println("This is Static Block");
	}

	public static void main(String[] args) {
		m1();
		
		System.out.println("a="+a+" b="+b);
		
	}

}
