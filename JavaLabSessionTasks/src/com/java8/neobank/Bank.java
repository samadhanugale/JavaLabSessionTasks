package com.java8.neobank;
public class Bank {
	

	private static final long serialVersionUID = 1L;
	 private String name;
	 private String add;
	 private String cno;
	 private String uname;
	 private String pwd;
	 private double dep;
    
    
    
	public Bank(String name, String add, String cno, String uname, String pwd, double dep) {
		
		this.name = name;
		this.add = add;
		this.cno = cno;
		this.uname = uname;
		this.pwd = pwd;
		this.dep = dep;
		
	}
	
	

	public void debit(double amt) {
		dep +=dep;
	}	

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAdd() {
		return add;
	}


	public void setAdd(String add) {
		this.add = add;
	}


	public String getCno() {
		return cno;
	}


	public void setCno(String cno) {
		this.cno = cno;
	}


	public String getUname() {
		return uname;
	}


	public void setUname(String uname) {
		this.uname = uname;
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	public double getDep() {
		return dep;
	}


	public void setDep(double dep) {
		this.dep = dep;
	}


	@Override
	public String toString() {
		return "Bank User :  Name : " + name + ", Address : " + add + ", Contact No : " + cno + ", Username : " + uname + ", Password : " + pwd + ", Amount : "
				+ dep ;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	
}
	
    
	
	
	
    