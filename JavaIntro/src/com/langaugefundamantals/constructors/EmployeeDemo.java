package com.langaugefundamantals.constructors;

public class EmployeeDemo {
	int employeeId;
	String employeeName;
	double employeeSalary;
	//No arg constructor
	public EmployeeDemo() {
		System.out.println("No-arg constructor called");
		employeeId = 101;
		employeeName = "shiva";
		employeeSalary = 100000;
	}

	public EmployeeDemo(int employeeId, double employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeSalary = employeeSalary;
	}

	public EmployeeDemo(int employeeId, String employeeName, double employeeSalary) {
		System.out.println("Parameterized constructor called");
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}

	void employeeInformation() {
		System.out.println("**************Displaying Employee Information********************");
		System.out.println("Employee Id :" + employeeId);
		System.out.println("Employee Name :" + employeeName);
		System.out.println("Employee Salary :" + employeeSalary);
	}
	//Instance block
	{
		System.out.println("Instance block called");
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("******************************************");
		EmployeeDemo objEmp = new EmployeeDemo();
		objEmp.employeeInformation();
		EmployeeDemo objEmp1 = new EmployeeDemo(102, "Chandrakala", 200000);
		objEmp1.employeeInformation();
		EmployeeDemo objEmp2 = new EmployeeDemo(103, 3000000);
		objEmp2.employeeInformation();
		System.out.println("main method ended");

	}

}
