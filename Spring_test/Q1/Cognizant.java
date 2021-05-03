package com;

public class Cognizant<Cohort> {
public Cognizant() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Inside Cognizant class");
	}
private String EmploymentType;
private int year;
private Cohort cohort;
private int EmployeeId;
public int getEmployeeId() {
	return EmployeeId;
}
public void setEmployeeId(int employeeId) {
	EmployeeId = employeeId;
}
public String getEmploymentType() {
	return EmploymentType;
}
public void setEmploymentType(String employmentType) {
	EmploymentType = employmentType;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public Cohort getCohort() {
	return cohort;
}
public void setCohort(Cohort cohort) {
	this.cohort = cohort;
}

}
