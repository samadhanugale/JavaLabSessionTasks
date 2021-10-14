package com.neosoft.sessiontasks;

class Employee11 {
	int eid;
	String ename;
	long esal;
	String project;

	public Employee11(int eid, String ename, long esal, String project) {
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.project = project;
	}

}

class T3Project{

	int pid;
	String pname;
	String plocation;
	Employee11 e;

	
	public T3Project(int pid, String pname, String plocation) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.plocation = plocation;
	}
	void display(Employee11 e) {
		if(e.project=="Web App" & e.esal>25000) {
		 System.out.println("Eid :"+e.eid+" ename :"+e.ename+" esal :"+e.esal+" pid :"+pid+" pname :"+pname+" plocation :"+plocation);
	 }
	}
	 public static void main(String args[]) {
          Employee11 e1=new Employee11(101, "Samadhan", 30000, "Mobile App");
          Employee11 e2=new Employee11(102, "Harjyot", 24000, "Mobile App");
          Employee11 e3=new Employee11(101, "Tariq", 53000, "Web App");
          Employee11 e4=new Employee11(101, "Shubham", 67000, "Web App");
          
          
          T3Project p1=new T3Project(1001,"Mobile App","Mumbai");
          p1.display(e1);
          T3Project p2=new T3Project(1002,"Mobile App","Pune");
          p2.display(e2);
          T3Project p3=new T3Project(1003,"Web App","Mumbai");
          p3.display(e3);
          T3Project p4=new T3Project(1004,"Web App","Pune");
          p4.display(e4);
          
	 }
}