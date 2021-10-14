package com.neosoft.sessiontasks;

import java.util.ArrayList;
import java.util.Iterator;

public class S8_TrainersList {
public static void main(String[] args) {
		
		ArrayList<Trainee> trainer=new ArrayList<Trainee>();
		trainer.add(new Trainee(101,"abitha","java",22000));
		trainer.add(new Trainee(102,"mayank","java",10000));
		trainer.add(new Trainee(103,"samadhan","php",24000));
		trainer.add(new Trainee(104,"vinay","java",23000));
		trainer.add(new Trainee(103,"rohit","java",21000));
		
		Iterator<Trainee> itr=trainer.iterator();
		while(itr.hasNext()) {
			Trainee tr=itr.next();
			System.out.println(tr);
		}
		
		System.out.println("================");
		
		ArrayList<Trainee> newtrainer=new ArrayList<Trainee>();
		for(Trainee tr:trainer) {
			if(tr.salary > 20000) {
				if(tr.course == "java") {
					newtrainer.add(tr);
					System.out.println(tr);
				}
				
			
			}
		
		}
		
		trainer.clear();
		System.out.println("=============");
		
		Iterator<Trainee> itr1=trainer.iterator();
		while(itr1.hasNext()) {
			Trainee tr1=itr.next();
			System.out.println(tr1);
		}
	}

}

class Trainee{
	int trid;
	String name;
	String course;
	int salary;
	public Trainee(int trid, String name, String course, int salary) {
		super();
		this.trid = trid;
		this.name = name;
		this.course = course;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "trainee :  "+trid+"   Name:  "+name+"  course:  "+course+"  Salary:  "+salary;
	}

}
