package com.sample;
//Same Package Different Class
public class Staff {  //child class
	
	private void staffId() {
		
		System.out.println("staff id 843");
	}
	private void staffName() {
		
		System.out.println("staff name jagan");
	}
	
	public static void main(String args[]) {
		
		//Object Creation- ClassName obj = new ClassName();
		//Method call - obj.methodName();
		
		//Parent Class Object
		Student stu = new Student();
		stu.studentId();
		stu.studentName();
		
		//Child Class Object
		Staff st = new Staff();
		st.staffId();
		st.staffName();
	}
}
