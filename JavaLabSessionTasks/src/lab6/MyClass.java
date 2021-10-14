package lab6;


interface A{
	
	void meth1();
	
	void meth2();
}
public class MyClass implements A{

	

	@Override
	public void meth1() {
		System.out.println("This is Method 1");
		
	}

	@Override
	public void meth2() {
		System.out.println("This is Method 2");
		
	}
	
   public static void main(String[] args) {
		
	   MyClass obj=new MyClass();
	   obj.meth1();
	   obj.meth2();

	}

}
