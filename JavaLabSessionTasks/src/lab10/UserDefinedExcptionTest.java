//Write a program for creation of user defined exception.
package lab10;

import java.util.ArrayList;
import java.util.Scanner;

public class UserDefinedExcptionTest {

	public static void main(String[] args) {
		//create list
		ArrayList<Student> students=new ArrayList<Student>();
		//create student obj and save data
		Student s1=new Student(101,"kp","java");
		Student s2=new Student(102,"sp",".net");
		Student s3=new Student(103,"mp","php");
		//add student to list
		students.add(s1);
		students.add(s2);
		students.add(s3);
		//read student number from user and show details
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student number ::- ");
		int sno=sc.nextInt();
		//search student by id
		try {
			for(Student std: students) {
				if(std.getSno()==sno) {
					System.out.println("Studnt Name :- "+std.getName());
					System.out.println("Studnt Course :- "+std.getCourse());
					break;
				}//if
				{
					throw new StudentNotFoundException("For given sid there is no Student ");
				}
			}//for
		}//try
		catch (Exception e) {
			e.printStackTrace();
		}
	}//main
}//class

class StudentNotFoundException extends Exception{
	
	//cons
	public StudentNotFoundException(String msg) {
		super(msg);
	}
}//class

//class student
class Student {
	  private int sno;
	  private String name;
	  private String course;
	  //cons param
	  public Student(int sno, String name, String course) {
			this.sno = sno;
			this.name = name;
			this.course = course;
		}
	  
	  //getters setters
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}  
}