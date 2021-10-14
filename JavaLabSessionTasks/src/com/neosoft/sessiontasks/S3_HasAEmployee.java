package com.neosoft.sessiontasks;


import java.util.Scanner;

public class S3_HasAEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of Employees :");
		int num = sc.nextInt();

		
		Project pro[];
		pro = new Project[num];
		int proid;
		String proname;
		String prolocation;
		for (int i = 0; i < num; i++) {
			System.out.println("Enter Project Datails:");
			System.out.print("project ID : ");
			proid = sc.nextInt();
			System.out.print("project Name : ");
			proname = sc.next();
			System.out.print("project Location : ");
			prolocation = sc.next();
			pro[i] = new Project(proid, proname, prolocation);
		}
		
		System.out.println("+--------------------------------------------------------+");
		Employees[] emp;
		emp = new Employees[num];
		int empid;
		String empname;
		double empsal;
		
		for (int i = 0; i < num; i++) {
			System.out.println("Enter Employee Datails:");
			System.out.print("Employee ID : ");
			empid = sc.nextInt();
			System.out.print("Employee Name : ");
			empname = sc.next();
			System.out.print("Employee Salary : ");
			empsal = sc.nextDouble();
			emp[i] = new Employees(empid, empname, empsal,pro[i]);
		}
		
		System.out.println("Employee details : \n");
		for (int j = 0; j < num; j++) {
			
			if(emp[j].esal>25000 )  {
				
				System.out.println("Employee ID : "+emp[j].eid+",  Employee Name : "+emp[j].ename+", Salary : "+emp[j].esal +",  Project Name : "+emp[j].project.pname);
			}

		}

	}

}

class Employees {
	int eid;
	String ename;
	double esal;
	Project project;

	public Employees(int eid, String ename, double esal, Project project) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.project = project;
	}

}

//relation with Author and Publisher (Has-a)
class Project {
	int pid;
	String pname;
	String plocation;

	public Project(int pid, String pname, String plocation) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.plocation = plocation;
	}

}