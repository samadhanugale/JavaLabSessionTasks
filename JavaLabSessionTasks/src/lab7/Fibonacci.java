package lab7;
public class Fibonacci 
{ 
 long fibo (int n) 
 { 
 if (n <= 1) return 1; 
 else 
 return (fibo(n -1) + fibo (n -2) ); 
 } 
public static void main (String []arg) 
{ 
 Fibonacci f; 
 long l; 
 f = new Fibonacci ( ); 
 l = f.fibo (5); 
 System.out.println ("5th Fibonacci number is : "+l); 
 
 } 
}
