package lab4;


class Aclass{
	void m1() {
		System.out.println("class A method 1");
	}
	
	void m2() {
		System.out.println("class A method 2");
	}
}

class Bclass extends Aclass{
	void m1() {
		System.out.println("class B method 1");
	}
	
	void m2() {
		System.out.println("class B method 2");
	}
}



public class MethodOverriding {

	public static void main(String[] args) {
		
		Aclass obj=new Bclass();
		obj.m1();
		
	}

}
