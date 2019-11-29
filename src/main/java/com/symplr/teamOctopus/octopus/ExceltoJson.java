package com.symplr.teamOctopus.octopus;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExceltoJson {
	private String projectName;
	private String featureNo;
	private String featureName;
	private String userStoryNo;
	private String userStoryName;
	private String defectNo;
	private String defectName;
	private String module;
	private String testType;

	private String releaseVersion;
	private String releaseDate;

	private String testNo;
	private String testName;
	private String testDescription;
	private String Automation;
	private String RequirementIDs;
	private int createdDate;
	private String createdBy;
	private int reveiwedDate;
	private String reviewedBy;

	private int executedDate;
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

	private String preConditions;
	private List<StepDetials> stepDetails;

	private int stepNo;
	private String action;
	private String expectedValue;
	private String actualValue;
	private String stepType;
	private String stepStatus;
	private String stepComment;
	private String stepDefect;

	public TestCaseTemple readExcel(String fileName) throws IOException {
		Workbook wb = WorkbookFactory.create(new File(fileName));
		Sheet sh = wb.getSheetAt(0);
		projectName = getcellStringValueByIndex(sh, 1, 1);
		featureNo = getcellStringValueByIndex(sh, 2, 1);
		featureName = getcellStringValueByIndex(sh, 2, 4);
		userStoryNo = getcellStringValueByIndex(sh, 3, 1);
		userStoryName = getcellStringValueByIndex(sh, 3, 4);
		defectNo = "";
		defectName = "";
		module = getcellStringValueByIndex(sh, 4, 1);
		testType = getcellStringValueByIndex(sh, 4, 4);
		ProjectDetails projectDetails = new ProjectDetails(projectName, featureNo, featureName, userStoryNo,
				userStoryName, defectNo, defectName, module, testType);

		releaseVersion = "2019.4";
		releaseDate = "10/20/2019";
		ReleaseDetails releaseDetails = new ReleaseDetails(releaseVersion, new Date(releaseDate));

		testNo = getcellStringValueByIndex(sh, 6, 1);
		testName = getcellStringValueByIndex(sh, 6, 4);
		testDescription = getcellStringValueByIndex(sh, 7, 1);
		Automation = getcellStringValueByIndex(sh, 8, 1);
		RequirementIDs = getcellStringValueByIndex(sh, 8, 4);
		createdDate = getcellNumaricValueByIndex(sh, 9, 1);
		createdBy = getcellStringValueByIndex(sh, 9, 4);
		reveiwedDate = getcellNumaricValueByIndex(sh, 10, 1);
		reviewedBy = getcellStringValueByIndex(sh, 10, 4);
		TestCaseDetails testCaseDetails = new TestCaseDetails(testNo, testName, testDescription, Automation,
				RequirementIDs, new Date(createdDate), createdBy, new Date(reveiwedDate), reviewedBy);

		executedDate = getcellNumaricValueByIndex(sh, 12, 1);
		executedBy = getcellStringValueByIndex(sh, 12, 4);
		executedIn = getcellStringValueByIndex(sh, 13, 1);
		executionStatus = getcellStringValueByIndex(sh, 13, 4);
		browsers = getcellStringValueByIndex(sh, 14, 1);
		executedEnvironment = getcellStringValueByIndex(sh, 14, 4);
		shsBuildName = getcellStringValueByIndex(sh, 15, 1);
		shsBuildNo = getcellNumaricValueByIndex(sh, 15, 4);
		refgFEName = getcellStringValueByIndex(sh, 16, 1);
		refgFENo = getcellNumaricValueByIndex(sh, 16, 4);
		refgBEName = getcellStringValueByIndex(sh, 17, 1);
		refgBENo = getcellNumaricValueByIndex(sh, 17, 4);

		ExecutionDetails executionDetails = new ExecutionDetails(new Date(executedDate), executedBy, executedIn,
				executionStatus, browsers, executedEnvironment, shsBuildName, shsBuildNo, refgFEName, refgFENo,
				refgBEName, refgBENo);
		List<StepDetials> sd = new ArrayList<StepDetials>();

		for (int i = 20; i < sh.getPhysicalNumberOfRows(); i++) {
			StepDetials stepDetails = null;
			stepNo = getcellNumaricValueByIndex(sh, i, 0);
			if (stepNo == -1 || stepNo == 0) {
				break;
			}
			action = getcellStringValueByIndex(sh, i, 1);
			expectedValue = getcellStringValueByIndex(sh, i, 3);
			actualValue = getcellStringValueByIndex(sh, i, 4);
			stepType = getcellStringValueByIndex(sh, i, 5);
			stepStatus = getcellStringValueByIndex(sh, i, 6);
			stepComment = getcellStringValueByIndex(sh, i, 7);
			stepDefect = getcellStringValueByIndex(sh, i, 8);
			stepDetails = new StepDetials(stepNo, action, expectedValue, actualValue, stepType, stepStatus, stepComment,
					stepDefect);
			sd.add(stepDetails);
		}

		preConditions = getcellStringValueByIndex(sh, 18, 1);
		TestSteps testStepDetails = new TestSteps(preConditions, sd);
		TestCaseTemple testCaseTemple = new TestCaseTemple(projectDetails, releaseDetails, testCaseDetails,
				executionDetails, testStepDetails);
		wb.close();
		return testCaseTemple;
	}

	public String getcellStringValueByIndex(Sheet sh, int i, int j) {

		Cell ce = sh.getRow(i).getCell(j);
		try {
			if (ce.getCellType() != ce.getCellTypeEnum().BLANK)
				return ce.getStringCellValue();
			else
				return null;
		} catch (Exception e) {
			System.out.println("i :" + i + "j :" + j);
			System.out.println(ce.getCellType());
			return null;
		}
	}

	public int getcellNumaricValueByIndex(Sheet sh, int i, int j) {

		Cell ce = sh.getRow(i).getCell(j);
		try {
			if (ce.getCellType() != ce.getCellTypeEnum().BLANK)
				return (int) ce.getNumericCellValue();
			else
				return 0;
		} catch (Exception e) {
			// System.out.println("i :"+i+"j :"+j);
			// System.out.println(ce.getCellType());
			return -1;
		}
	}

}
