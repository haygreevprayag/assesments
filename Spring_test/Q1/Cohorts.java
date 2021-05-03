package com;

public class Cohorts {
	private int CohortId;
	private String CohortName;
	private String emailId;
	private long contactNo;
	public Cohorts(int CohortId,String CohortName,String emailId,long contactNo) {
		super();
		System.out.println("Inside cohort class");
		this.CohortId=CohortId;
		this.CohortName=CohortName;
		this.emailId=emailId;
		this.contactNo=contactNo;
		
		// TODO Auto-generated constructor stub
	}
	void show(){  
	    System.out.println(CohortId +" "+CohortName+" "+emailId+" "+contactNo);  
	}  
	
	public int getCohortId() {
		return CohortId;
	}
	public void setCohortId(int cohortId) {
		CohortId = cohortId;
	}
	public String getCohortName() {
		return CohortName;
	}
	public void setCohortName(String cohortName) {
		CohortName = cohortName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}


	
}
