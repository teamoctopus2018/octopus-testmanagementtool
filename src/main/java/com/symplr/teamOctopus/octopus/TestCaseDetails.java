package com.symplr.teamOctopus.octopus;

import java.util.Date;

public class TestCaseDetails {
	
	private String testNo;	
	private String testName;
	private String testDescription;
	private String Automation;
	private String RequirementIDs;
	private Date createdDate;
	private String createdBy;
	private Date reveiwedDate;
	private String reviewedBy;
	
	public TestCaseDetails(String testNo, String testName, String testDescription, String automation,
			String requirementIDs, Date createdDate, String createdBy, Date reveiwedDate, String reviewedBy) {
		this.testNo = testNo;
		this.testName = testName;
		this.testDescription = testDescription;
		Automation = automation;
		RequirementIDs = requirementIDs;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.reveiwedDate = reveiwedDate;
		this.reviewedBy = reviewedBy;
	}
	
	public String getTestNo() {
		return testNo;
	}
	public void setTestNo(String testNo) {
		this.testNo = testNo;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public String getTestDescription() {
		return testDescription;
	}
	public void setTestDescription(String testDescription) {
		this.testDescription = testDescription;
	}
	public String getAutomation() {
		return Automation;
	}
	public void setAutomation(String automation) {
		Automation = automation;
	}
	public String getRequirementIDs() {
		return RequirementIDs;
	}
	public void setRequirementIDs(String requirementIDs) {
		RequirementIDs = requirementIDs;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getReveiwedDate() {
		return reveiwedDate;
	}
	public void setReveiwedDate(Date reveiwedDate) {
		this.reveiwedDate = reveiwedDate;
	}
	public String getReviewedBy() {
		return reviewedBy;
	}
	public void setReviewedBy(String reviewedBy) {
		this.reviewedBy = reviewedBy;
	}

}
