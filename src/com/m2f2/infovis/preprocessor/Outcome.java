package com.m2f2.infovis.preprocessor;

public class Outcome {
	private String crimeID;
	private String month;
	private String reportedBy;
	private String fallsWithin;
	private String longitude;
	private String latitude;
	private String location;
	private String LSOAcode;
	private String LSOAname;
	private String outcomeType;

	public Outcome(String[] line) {
		this.crimeID = line[0];
		this.month = line[1];
		this.reportedBy = line[2];
		this.fallsWithin = line[3];
		this.longitude = line[4];
		this.latitude = line[5];
		this.location = line[6];
		this.LSOAcode = line[7];
		this.LSOAname = line[8];
		this.outcomeType = line[9];
	}

	public String getCrimeID() {
		return crimeID;
	}

	public void setCrimeID(String crimeID) {
		this.crimeID = crimeID;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getReportedBy() {
		return reportedBy;
	}

	public void setReportedBy(String reportedBy) {
		this.reportedBy = reportedBy;
	}

	public String getFallsWithin() {
		return fallsWithin;
	}

	public void setFallsWithin(String fallsWithin) {
		this.fallsWithin = fallsWithin;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getLSOAcode() {
		return LSOAcode;
	}

	public void setLSOAcode(String lSOAcode) {
		LSOAcode = lSOAcode;
	}

	public String getLSOAname() {
		return LSOAname;
	}

	public void setLSOAname(String lSOAname) {
		LSOAname = lSOAname;
	}

	public String getOutcomeType() {
		return outcomeType;
	}

	public void setOutcomeType(String outcomeType) {
		this.outcomeType = outcomeType;
	}
	
	
}
