package com.m2f2.infovis.preprocessor;

import java.util.Arrays;

public class Crime {
	private String id;
	private String month;
	private String reportedBy;
	private String fallsWithin;
	private String longitude;
	private String latitude;
	private String location;
	private String LSOAcode;
	private String LSOAname;
	private String crimetype;
	private String lastOutcomCategory;
	private String context;
	
	public Crime(String[] line) {
		this.id = line[0];
		this.month = line[1];
		this.reportedBy = line[2];
		this.fallsWithin = line[3];
		this.longitude = line[4];
		this.latitude = line[5];
		this.location = line[6];
		this.LSOAcode = line[7];
		this.LSOAname = line[8];
		this.crimetype = line[9];
		this.lastOutcomCategory = line[10];
		this.context = line[11];
		
		if (this.id.equals("")) {
			this.id = String.valueOf(Arrays.hashCode(line));
		}
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getCrimetype() {
		return crimetype;
	}
	public void setCrimetype(String crimetype) {
		this.crimetype = crimetype;
	}
	public String getLastOutcomCategory() {
		return lastOutcomCategory;
	}
	public void setLastOutcomCategory(String lastOutcomCategory) {
		this.lastOutcomCategory = lastOutcomCategory;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
}
