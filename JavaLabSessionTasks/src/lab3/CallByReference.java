package lab3;

public class CallByReference {
	  static int a;
	static int b;
	
	

	public CallByReference(int a,int b) {
		super();
		this.a = a;
		this.b = b;
	}

	

	static void callIt(CallByReference a2) {
		System.out.println("Show :"+a+"  "+b);
	}

	public static void main(String[] args) {
		CallByReference a=new CallByReference(10,20);
		
	callIt(a);
	}



	

	

}
