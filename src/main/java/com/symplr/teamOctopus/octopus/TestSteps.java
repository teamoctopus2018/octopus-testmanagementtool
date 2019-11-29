package com.symplr.teamOctopus.octopus;

import java.util.List;

public class TestSteps {
	
	private String preConditions;	
	private List<StepDetials> stepDetails;
	
	public TestSteps(String preConditions, List<StepDetials> sd) {
		this.preConditions = preConditions;
		this.stepDetails = sd;
	}
	
	public String getPreConditions() {
		return preConditions;
	}
	public void setPreConditions(String preConditions) {
		this.preConditions = preConditions;
	}
	public List<StepDetials> getStepDetails() {
		return stepDetails;
	}
	public void setStepDetails(List<StepDetials> stepDetails) {
		this.stepDetails = stepDetails;
	}
}
