package com.symplr.teamOctopus.octopus;

import java.util.Date;

public class ReleaseDetails {
	
	private String releaseVersion;	
	private Date releaseDate;
	
	public ReleaseDetails(String releaseVersion, Date releaseDate) {
		this.releaseVersion = releaseVersion;
		this.releaseDate = releaseDate;
	}
	
	public String getReleaseVersion() {
		return releaseVersion;
	}
	public void setReleaseVersion(String releaseVersion) {
		this.releaseVersion = releaseVersion;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
}
