package lab9;

class Box {
	// property
	private int length;
	private int breadth;

	// cons
	public Box() {
		length = 0;
		breadth = 0;
	}// cons
		// param cons

	public Box(int x, int y) {
		length = x;
		breadth = y;
	}// cons
	
		// set values to both x and y
	public void setval(int x, int y) {
		length = x;
		breadth = y;
	}// setVal
       
	public int area() {
		return (length * breadth);
	}// area
}// class

class Box3d extends Box {
	private int height;
       //cons
	public Box3d() {
		super();
		height = 0;
	}
      // param  cons 
	public Box3d(int x, int y, int z) {
		super(x, y);
		height = z;
	}
      //setter
	public void setval(int x, int y, int z) {
		super.setval(x, y);
		height = z;
	}
       //Setters 
	public int volume() {
		return (super.area() * height);
	}
	public static void main(String arga [ ]) { 
	 Box b1 = new Box ( ); 
	 Box3d b2 = new Box3d(12,34,18); 
	 b1.setval (25,30); 
	//Lab Solutions 
	//Centre for Information Technology and Engineering, Manonmaniam Sundaranar University 37
	 System.out.println ("The area of b1 is : " + b1.area( ) ); 
	 System.out.println ("The volume of b2 is : "+ b2.volume ( )); 
	 }
	}