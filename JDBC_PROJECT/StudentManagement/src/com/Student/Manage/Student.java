package com.Student.Manage;

public class Student {
	private int stdentid;
	private String studentname;
	private String studentphone;
	private String studentcity;
	
	public Student(int stdentid, String studentname, String studentphone, String studentcity) 
	{
		super();
		this.stdentid = stdentid;
		this.studentname = studentname;
		this.studentphone = studentphone;
		this.studentcity = studentcity;
	}
	
	

	public Student(String studentname, String studentphone, String studentcity) {
		super();
		this.studentname = studentname;
		this.studentphone = studentphone;
		this.studentcity = studentcity;
	}



	public Student() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStdentid() {
		return stdentid;
	}

	public void setStdentid(int stdentid) {
		this.stdentid = stdentid;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getStudentphone() {
		return studentphone;
	}

	public void setStudentphone(String studentphone) {
		this.studentphone = studentphone;
	}

	public String getStudentcity() {
		return studentcity;
	}

	public void setStudentcity(String studentcity) {
		this.studentcity = studentcity;
	}

	@Override
	public String toString() {
		return "Student [stdentid=" + stdentid + ", studentname=" + studentname + ", studentphone=" + studentphone
				+ ", studentcity=" + studentcity + "]";
	}
	
	
	
	
	
}
