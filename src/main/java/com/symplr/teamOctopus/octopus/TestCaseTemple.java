package com.symplr.teamOctopus.octopus;

/**
 * Hello world!
 *
 */
public class TestCaseTemple {

	private ProjectDetails projectDetails;
	private ReleaseDetails releaseDetails;
	private TestCaseDetails testCaseDetails;
	private ExecutionDetails executionDetails;
	private TestSteps testSteps;

	public TestCaseTemple(ProjectDetails projectDetails, ReleaseDetails releaseDetails, TestCaseDetails testCaseDetails,
			ExecutionDetails executionDetails, TestSteps testSteps) {
		this.projectDetails = projectDetails;
		this.releaseDetails = releaseDetails;
		this.testCaseDetails = testCaseDetails;
		this.executionDetails = executionDetails;
		this.testSteps = testSteps;
	}

	public ProjectDetails getProjectDetails() {
		return projectDetails;
	}

	public void setProjectDetails(ProjectDetails projectDetails) {
		this.projectDetails = projectDetails;
	}

	public ReleaseDetails getReleaseDetails() {
		return releaseDetails;
	}

	public void setReleaseDetails(ReleaseDetails releaseDetails) {
		this.releaseDetails = releaseDetails;
	}

	public TestCaseDetails getTestCaseDetails() {
		return testCaseDetails;
	}

	public void setTestCaseDetails(TestCaseDetails testCaseDetails) {
		this.testCaseDetails = testCaseDetails;
	}

	public ExecutionDetails getExecutionDetails() {
		return executionDetails;
	}

	public void setExecutionDetails(ExecutionDetails executionDetails) {
		this.executionDetails = executionDetails;
	}

	public TestSteps getTestStepDetails() {
		return testSteps;
	}

	public void setTestStepDetails(TestSteps testStepDetails) {
		this.testSteps = testStepDetails;
	}

}
