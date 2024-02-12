package com.sample2;
//Different Package Different Class
import com.sample1.Employee;

public class Company {   //child class
	
	private void companyId() {
		
		System.out.println("company id 893");
	}
	
	public static void main(String args[]) {
		
		//Create Object for Parent Class
		Employee emp = new Employee();
		emp.empId();
		
		//Create object for child class
		Company c = new Company();
		c.companyId();
	}

}
