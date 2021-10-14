package lab3;

public class CallByValue { 
	
	
	void callIt(int data) {
		System.out.println("Your Data is :"+data);
	}

	public static void main(String[] args) {
		CallByValue cb=new CallByValue();
		cb.callIt(500);

	}

}
