package lab4;

class First{
	int a;
	int b;
	public First(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		
		System.out.println("a="+a+" b="+b);
	}
	
	
}
class Second extends First{

	int c,d,e;
	
	


public Second(int a, int b, int c, int d, int e) {
		super(a, b);
		this.c = c;
		this.d = d;
		this.e = e;
		
		System.out.println("a="+a+" b="+b+" c="+c+" d="+d+" e="+e);
	}

}


public  class SuperKeyword {

	public static void main(String[] args) {
		
		Second obj=new Second(10,20,30,40,50);
	}
		
	}


