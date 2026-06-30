package com.javaintro;

public class Employee {
	int employeeId;
	String employeeName;
	static int orgId=91;
	static String orgName="Vitb";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome to sample program");
		Employee objEmp=new Employee();
		objEmp.employeeId=100;
		objEmp.employeeName="shiva";
		System.out.println("Emplyee Id :"+objEmp.employeeId);
		System.out.println("Employee name :"+objEmp.employeeName);
		System.out.println("Organization Id :"+Employee.orgId);
		System.out.println("Organization Name :"+Employee.orgName);

	}

}
