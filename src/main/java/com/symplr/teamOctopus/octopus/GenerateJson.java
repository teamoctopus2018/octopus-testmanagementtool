package com.symplr.teamOctopus.octopus;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.jayway.jsonpath.JsonPath;

public class GenerateJson {
	Gson gson = new Gson();
	public static void main(String[] args) throws Throwable
	{
		GenerateJson gj = new GenerateJson();
		gj.fetchAllFiles("C:/ShiftSelect/Announcement/");
		
	}
	public void fetchAllFiles(String fpath) throws Throwable {
		File FPath = new File(fpath);
		File flist[] =FPath.listFiles();
		for(File fl:flist) {
			if(fl.isDirectory()) {
				System.out.println("****************** Folder"+fl.getName());
				System.out.println(fpath+fl.getName());
				fetchAllFiles(fpath+fl.getName()+"/");				
			}else {
				if(fl.isFile()) {
					if(fl.getName().contains(".xlsx") && !fl.getName().contains("~")) {
						System.out.println(fpath+fl.getName());
						readTCFromExcel(fpath+fl.getName());
					}					
				}				
			}			
		}
	}
	
	public void readTCFromExcel(String fName) throws Throwable {
		String fileName = fName;
		//"C:/ShiftSelect/Announcement/F4339_Flex Removal Announcement events in Centralized Notifications/US31162_TC10_Verify announcement popup when staff clicks on all announcements link.xlsx";
		//String fileName ="C:/ShiftSelect/Announcement/F3528_Flex Removal Announcement Handling with acknowledgments/Executed/US26999_TC13_Verify Announcement popup when we open application in login page.xlsx";
		ExceltoJson ej = new ExceltoJson();
		String json = gson.toJson(ej.readExcel(fileName));		
		injectToDataBase(json);
	}
	public void injectToDataBase(String json) {
		
		String release = JsonPath.read(json, "$.releaseDetails.releaseVersion");
		String featureNo = JsonPath.read(json, "$.projectDetails.featureNo");
		String featureName = JsonPath.read(json, "$.projectDetails.featureName");
		String userStoryNo = JsonPath.read(json, "$.projectDetails.userStoryNo");
		String userStoryName = JsonPath.read(json, "$.projectDetails.userStoryName");
		String testCaseNo = JsonPath.read(json, "$.testCaseDetails.testNo");
		String testCaseName = JsonPath.read(json, "$.testCaseDetails.testName");
		
		System.out.println(release);
		System.out.println("----"+featureNo+"-"+featureName);
		System.out.println("--------"+userStoryNo+"-"+userStoryName);
		System.out.println("------------"+testCaseNo+"-"+testCaseName);
		System.out.println("----------------"+json);
	}
}
