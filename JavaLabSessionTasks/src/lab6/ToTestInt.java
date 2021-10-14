package lab6;

 interface Test 
{ 
 public int square(int a); 
 } 

class arithmetic implements Test 
 { 
 int s = 0; 
 public int square(int b) 
 { 
System.out.println("Inside arithmetic class – implemented method square"); 
 System.out.println("Square of " + " is "+s); 
 return s; 
 } 
 void armeth() 
 {
	 System.out.println("Inside method of class Arithmetic"); 
 } 
 } 
  
 // use the object 
 class ToTestInt 
  { 
  public static void main(String []args) 
  { 
  System.out.println("calling from ToTestInt class main method");
  
  Test t = new arithmetic(); 
  System.out.println("=============================="); 
  
  System.out.println("This object cannot call armeth method of Arithmetic class");
  
  System.out.println("================================="); 
  t.square(10); 
  System.out.println("================================="); 
  } 
 } 
 
