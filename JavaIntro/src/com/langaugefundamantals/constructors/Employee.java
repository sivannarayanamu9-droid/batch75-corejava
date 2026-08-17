package com.langaugefundamantals.constructors;

public class Employee {
	int empId;
	String empName;
	double sal;
	Employee()
	{
		System.out.println("No argument constructor called");
	}
	Employee(int empId,String empName,double sal)
	{
		this.empId=empId;
		this.empName=empName;
		this.sal=sal;
	}
	Employee(Employee e)
	{
		this.empId=e.empId;
		this.empName=e.empName;
		this.sal=e.sal;
	}
	void displayEmployeeDetails()
	{
		System.out.println("*************** Employee Details ***************");
		System.out.println("Employee Id:"+empId);
		System.out.println("Employee Name :"+empName);
		System.out.println("Employee Salary :"+sal);
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		Employee obj = new Employee();
		obj.displayEmployeeDetails();
		
		Employee emp1 = new Employee(101,"chandra kala",50000);
		emp1.displayEmployeeDetails();
		
		Employee emp2=new Employee(emp1);
		emp2.empName="shiva";
		emp2.sal=emp1.sal+10000;
		emp2.displayEmployeeDetails();
		System.out.println("main method ended");

	}

}
