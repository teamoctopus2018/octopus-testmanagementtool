package com.symplr.teamOctopus.octopus;

import java.util.Date;

public class ExecutionDetails {
	
	private Date executedDate;	
	private String executedBy;
	private String executedIn;
	private String executionStatus;
	private String browsers;
	private String executedEnvironment;
	private String shsBuildName;
	private int shsBuildNo;
	private String refgFEName;
	private int refgFENo;
	private String refgBEName;
	private int refgBENo;
	
	public ExecutionDetails(Date executedDate, String executedBy, String executedIn, String executionStatus,
			String browsers, String executedEnvironment, String shsBuildName, int shsBuildNo, String refgFEName,
			int refgFENo, String refgBEName, int refgBENo) {
		this.executedDate = executedDate;
		this.executedBy = executedBy;
		this.executedIn = executedIn;
		this.executionStatus = executionStatus;
		this.browsers = browsers;
		this.executedEnvironment = executedEnvironment;
		this.shsBuildName = shsBuildName;
		this.shsBuildNo = shsBuildNo;
		this.refgFEName = refgFEName;
		this.refgFENo = refgFENo;
		this.refgBEName = refgBEName;
		this.refgBENo = refgBENo;
	}
	
	public Date getExecutedDate() {
		return executedDate;
	}
	public void setExecutedDate(Date executedDate) {
		this.executedDate = executedDate;
	}
	public String getExecutedBy() {
		return executedBy;
	}
	public void setExecutedBy(String executedBy) {
		this.executedBy = executedBy;
	}
	public String getExecutedIn() {
		return executedIn;
	}
	public void setExecutedIn(String executedIn) {
		this.executedIn = executedIn;
	}
	public String getExecutionStatus() {
		return executionStatus;
	}
	public void setExecutionStatus(String executionStatus) {
		this.executionStatus = executionStatus;
	}
	public String getBrowsers() {
		return browsers;
	}
	public void setBrowsers(String browsers) {
		this.browsers = browsers;
	}
	public String getExecutedEnvironment() {
		return executedEnvironment;
	}
	public void setExecutedEnvironment(String executedEnvironment) {
		this.executedEnvironment = executedEnvironment;
	}
	public String getShsBuildName() {
		return shsBuildName;
	}
	public void setShsBuildName(String shsBuildName) {
		this.shsBuildName = shsBuildName;
	}
	public int getShsBuildNo() {
		return shsBuildNo;
	}
	public void setShsBuildNo(int shsBuildNo) {
		this.shsBuildNo = shsBuildNo;
	}
	public String getRefgFEName() {
		return refgFEName;
	}
	public void setRefgFEName(String refgFEName) {
		this.refgFEName = refgFEName;
	}
	public int getRefgFENo() {
		return refgFENo;
	}
	public void setRefgFENo(int refgFENo) {
		this.refgFENo = refgFENo;
	}
	public String getRefgBEName() {
		return refgBEName;
	}
	public void setRefgBEName(String refgBEName) {
		this.refgBEName = refgBEName;
	}
	public int getRefgBENo() {
		return refgBENo;
	}
	public void setRefgBENo(int refgBENo) {
		this.refgBENo = refgBENo;
	}
	

}
