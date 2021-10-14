package lab5;

 class Shape {
	
	 void draw() {
		System.out.println("Dwaw Shape");
		
	}
	
	 void erase() {
		System.out.println("Erase Shape");
	}
	

}


   class Circle extends Shape {
	
	 void draw() {
		System.out.println("Dwaw Circle");
		
	}
	
	 void erase() {
		System.out.println("Erase Circle");
	}
	

}
   
   class Triangle extends Shape {
		
		 void draw() {
			System.out.println("Dwaw Triangle");
			
		}
		
		 void erase() {
			System.out.println("Erase Triangle");
		}
		

	}
   
   
   class Square extends Shape {
		
		 void draw() {
			System.out.println("Dwaw Square");
			
		}
		
	    void erase() {
			System.out.println("Erase Square");
		}
		

	}
   
   public class Shapes
   { 
   
   public static void main (String arg[]) 
   { 
   
    Shape obj=new Shape();
    Square obj1=new Square();
 
    Circle obj2=new Circle();

    
    Triangle obj3=new Triangle();
   
    Shape[] shapes= {obj,obj1,obj2,obj3};
    for(Shape shape:shapes) {
    	shape.draw();
    	shape.erase();
    }
   } 
  }


