package lab4;


class A{
	void m1() {
		System.out.println("First Method");
	}
	
	void m2() {
		System.out.println("Second Method");
	}
	
	void m3() {
		System.out.println("Third Method");
	}
}

class B extends A{
	
	void m4() {
		System.out.println("Fourth Method");
	}
	
	void m5() {
		System.out.println("Fifth Method");
	}
}


public class InheritClass {
	
	public static void main(String[] args) {
		
		B obj=new B();
		obj.m4();
		
		obj.m1();
		
	}

}
