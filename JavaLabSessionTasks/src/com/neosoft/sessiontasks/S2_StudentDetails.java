package com.neosoft.sessiontasks;




import java.util.Scanner;

public class S2_StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of Students to add : ");
		int numstd=sc.nextInt();
		Students std[];
		std=new Students[numstd];
		
		int stdid,stdmarks;
		String stdname,stdcource;
		
		int k=0;
		for(int i=0;i<numstd;i++) {
			System.out.println("Enter Student "+(++k)+" details:");
			System.out.println("Enter ID : ");
			stdid=sc.nextInt();
			System.out.println("Enter Name : ");
			stdname=sc.next();
			System.out.println("Enter Course : ");
			stdcource=sc.next();
			System.out.println("Enter Marks : ");
			stdmarks=sc.nextInt();
			std[i]=new Students(stdid,stdname,stdcource,stdmarks);
		}
		System.out.println("Students who have marks > 50:\n ");
		for(int i=0;i<numstd;i++) {
			if(std[i].marks>50 && std[i].course.equals("BTECH")) {
				System.out.println("StdId:"+std[i].stid+" ,  StdName:"+std[i].name+", Stdcource:"+std[i].course+" , stdmarks:"+std[i].marks);
			}
		}
	}

}