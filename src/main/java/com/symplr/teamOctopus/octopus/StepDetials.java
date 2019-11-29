package com.symplr.teamOctopus.octopus;

public class StepDetials {

	private int stepNo;
	private String action;
	private String expectedValue;
	private String actualValue;
	private String stepType;
	private String stepStatus;
	private String stepComment;
	private String stepDefect;

	public StepDetials(int stepNo, String action, String expectedValue, String actualValue, String stepType,
			String stepStatus, String stepComment, String stepDefect) {
		super();
		this.stepNo = stepNo;
		this.action = action;
		this.expectedValue = expectedValue;
		this.actualValue = actualValue;
		this.stepType = stepType;
		this.stepStatus = stepStatus;
		this.stepComment = stepComment;
		this.stepDefect = stepDefect;
	}

	public int getStepNo() {
		return stepNo;
	}

	public void setStepNo(int stepNo) {
		this.stepNo = stepNo;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getExpectedValue() {
		return expectedValue;
	}

	public void setExpectedValue(String expectedValue) {
		this.expectedValue = expectedValue;
	}

	public String getActualValue() {
		return actualValue;
	}

	public void setActualValue(String actualValue) {
		this.actualValue = actualValue;
	}

	public String getStepType() {
		return stepType;
	}

	public void setStepType(String stepType) {
		this.stepType = stepType;
	}

	public String getStepStatus() {
		return stepStatus;
	}

	public void setStepStatus(String stepStatus) {
		this.stepStatus = stepStatus;
	}

	public String getStepComment() {
		return stepComment;
	}

	public void setStepComment(String stepComment) {
		this.stepComment = stepComment;
	}

	public String getStepDefect() {
		return stepDefect;
	}

	public void setStepDefect(String stepDefect) {
		this.stepDefect = stepDefect;
	}

}
