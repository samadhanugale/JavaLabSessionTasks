package lab6;

class Outer {
	String so = "This is Outer Class";

	void display() {
		System.out.println(so);
	}

	void test() {
		Inner inner = new Inner();
		inner.display();
	}

	class Inner {
		String si = "This is inner Class";

		void display() {
			System.out.println(si);
		}
	}
}

class InnerClassDemo {
	public static void main(String args[]) {
		Outer outer = new Outer();
		outer.display();
		outer.test();
	}
}