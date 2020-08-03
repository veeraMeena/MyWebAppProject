package com.example.demo;


public class Employee {
	
	private int employeeId;
	private String empName;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", empName=" + empName + "]";
	}

}
