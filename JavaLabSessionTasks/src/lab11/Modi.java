package lab11;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class Modi {
	public static void main(String a[]) throws ClassNotFoundException {
		Class c = Class.forName("com.neosoft.unitlab11.Lang");
		Method m[] = c.getDeclaredMethods();
		for (int i = 0; i < m.length; i++) {
			int mo = m[i].getModifiers();
			if (Modifier.isPublic(mo))
				System.out.println(m[i].getName()+"() method");
		}//for
	}//main
}//class
