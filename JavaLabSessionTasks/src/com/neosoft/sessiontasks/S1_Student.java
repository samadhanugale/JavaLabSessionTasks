package com.neosoft.sessiontasks;

import java.util.Scanner;

public class S1_Student {

	static int stid;
	static String name;
	static String course;
	static int marks;

	public S1_Student(int thestid, String thename, String thecourse, int themarks) {
		super();
		this.stid = thestid;
		this.name = thename;
		this.course = thecourse;
		this.marks = themarks;
		
	}

	public void show() {
		//System.out.println("Student Id:" + stid + "Student Name:" + name + "Course :" + course + "Marks :" + marks);
		if (S1_Student.course=="BCA"&&S1_Student.marks>60) {
		 System.out.println("Student Id:"+stid+"Student Name:"+name+"Course:" + course + "Marks :" + marks);
		}
	}

	public static void main(String[] args) {
//		Student s1=new Student(101,"Abhay", "BCA", 80);
//		 s1.show();
//		Student s2=new Student(102,"Rohan", "MCA", 50);
//		  s2.show();
//		Student s3=new Student(103,"Chitra", "BCA", 90);
//		   s3.show();
//		Student s4=new Student(104,"Samadhan", "BCA", 59);
//		  s4.show();
//		Student s5=new Student(105,"Kartike", "MCA", 55);
//	    s5.show();

		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter the number of student");
		int n, i;
		String thecourse;
		int themarks;
		n = sc1.nextInt();
		S1_Student st[] = new S1_Student[n];
		for (i = 0; i < n; i++) {
            
			System.out.println("Enter your Id:");
			int thestid = sc1.nextInt();
			System.out.println("Enter your Name:");
			String thename = sc1.next();
			System.out.println("Enter your Course:");
		 thecourse = sc1.next();
			System.out.println("Enter your Marks:");
			themarks = sc1.nextInt();
			st[i] = new S1_Student(thestid, thename, thecourse, themarks);
			// st[i].show();
		}
		for (int j = 0; j < st.length; j++) {
		     st[j].show();
		}
	}
}
