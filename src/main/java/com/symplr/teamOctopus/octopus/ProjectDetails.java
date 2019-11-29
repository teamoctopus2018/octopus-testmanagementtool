package com.symplr.teamOctopus.octopus;

public class ProjectDetails {
	
	private String projectName;	
	private String featureNo;
	private String featureName;
	private String userStoryNo;
	private String userStoryName;
	private String defectNo;
	private String defectName;
	private String module;
	private String testType;
	
	public ProjectDetails(String projectName, String featureNo, String featureName, String userStoryNo,
			String userStoryName, String defectNo, String defectName, String module, String testType) {
		this.projectName = projectName;
		this.featureNo = featureNo;
		this.featureName = featureName;
		this.userStoryNo = userStoryNo;
		this.userStoryName = userStoryName;
		this.defectNo = defectNo;
		this.defectName = defectName;
		this.module = module;
		this.testType = testType;
	}
	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getFeatureNo() {
		return featureNo;
	}

	public void setFeatureNo(String featureNo) {
		this.featureNo = featureNo;
	}

	public String getFeatureName() {
		return featureName;
	}

	public void setFeatureName(String featureName) {
		this.featureName = featureName;
	}

	public String getUserStoryNo() {
		return userStoryNo;
	}

	public void setUserStoryNo(String userStoryNo) {
		this.userStoryNo = userStoryNo;
	}

	public String getUserStoryName() {
		return userStoryName;
	}

	public void setUserStoryName(String userStoryName) {
		this.userStoryName = userStoryName;
	}

	public String getDefectNo() {
		return defectNo;
	}

	public void setDefectNo(String defectNo) {
		this.defectNo = defectNo;
	}

	public String getDefectName() {
		return defectName;
	}

	public void setDefectName(String defectName) {
		this.defectName = defectName;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public String getTestType() {
		return testType;
	}

	public void setTestType(String testType) {
		this.testType = testType;
	}

	

}
