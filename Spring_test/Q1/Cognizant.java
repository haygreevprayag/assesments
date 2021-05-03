package com;

public class Cognizant{
private String EmploymentType;
private int year;
private int contactno;
//private Cohort cohort;
private int EmployeeId;
public Cognizant(String EmploymentType,int year,int contactno,int EmployeeId) {
	super();
	// TODO Auto-generated constructor stub
	System.out.println("Inside Cognizant class");
	this.EmploymentType=EmploymentType;
	this.year=year;
	//this.cohort=cohort;
	this.EmployeeId=EmployeeId;
}
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
public int getcontactnot() {
	return contactno;
}
public void setContactno(int contactno) {
	this.contactno = contactno;
}

void show1(){  
    System.out.println( EmploymentType+" "+ year+ EmployeeId+ contactno);
}  
}
