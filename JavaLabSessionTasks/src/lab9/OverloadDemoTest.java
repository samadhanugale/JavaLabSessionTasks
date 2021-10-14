package lab9;
class Overload {
			void m1() { 
					System.out.println ("No parameters method called" ); 
			}

			void m1 (int a, int b) { 
				System.out.println ("a :- "+a +" and b:- "+b); 
			}
			
			void m1 (double a) { 
				System.out.println ("Inside m1(double) a : "+ a); 
			}
			}

class OverloadDemoTest {
	public static void main(String args[]) {
		Overload ob = new Overload();
		ob.m1();
		ob.m1(5);  //here automatic type coversion take placed  (at the time of compilation there is no method found whoes param is int so..compiler bind that method to double type)
		ob.m1(10, 20);
		ob.m1(23, 56);
	}
}