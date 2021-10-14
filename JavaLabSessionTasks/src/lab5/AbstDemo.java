package lab5;

abstract class debuggable{ 
abstract void dump();
}
class X extends debuggable{ 
private int a,b,c; 

public X(int a, int b, int c) {
	super();
	this.a = a;
	this.b = b;
	this.c = c;
}

void dump() 
{ 
System.out.println( "a = " + a +"b=" +b+ "c=" +c); 
} 
} 
class Y extends debuggable{ 
private int i,j,k; 

public Y(int i, int j, int k) {
	super();
	this.i = i;
	this.j = j;
	this.k = k;
}

void dump() 
{ 
System.out.println( "i = " + i +"j=" +j+ "k=" +k); 
} 
} 
class Z extends debuggable{ 
private int p,q,r; 

public Z(int p, int q, int r) {
	super();
	this.p = p;
	this.q = q;
	this.r = r;
}

void dump() 
{ 
System.out.println( "p = " + p +"q=" +q+ "r=" +r); 
} 
} 
class AbstDemo 
{ 
public static void main(String arg[]) 
{ 
X x=new X(1,2,3); 
Y y=new Y(2,4,5); 
Z z =new Z(3,5,6);

x.dump(); 
y.dump(); 
z.dump(); 
} 
}
