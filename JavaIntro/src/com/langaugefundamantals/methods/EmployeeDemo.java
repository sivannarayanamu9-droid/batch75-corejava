package com.langaugefundamantals.methods;

public class EmployeeDemo {
	int eid;
	String name;
	int sal;
	String loc;

	EmployeeDemo getEmployeeData() {
		EmployeeDemo objEmp = new EmployeeDemo();
		objEmp.eid = 101;
		objEmp.name = "shiva";
		objEmp.sal = 100000;
		objEmp.loc = "Hyderabad";
		return objEmp;
	}

	void displayEmployeeInfo() {
		EmployeeDemo emp = getEmployeeData();
		System.out.println("Employee Id :" + emp.eid);
		System.out.println("Employee Name :" + emp.name);
		System.out.println("Employee salary :" + emp.sal);
		System.out.println("Employee Location :" + emp.loc);
	}

	void main() {
		System.out.println("main method started");
		displayEmployeeInfo();
		System.out.println("main method ended");
	}

}
