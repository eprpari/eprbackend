package com.example.demo.model;


import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Project {
	private String projectPlace;
	private String projectDetails;
	private String projectPhotos;
	public Project(String projectPlace, String projectDetails, String projectPhotos) {
		super();
		this.projectPlace = projectPlace;
		this.projectDetails = projectDetails;
		this.projectPhotos = projectPhotos;
	}
	public String getProjectPlace() {
		return projectPlace;
	}
	public void setProjectPlace(String projectPlace) {
		this.projectPlace = projectPlace;
	}
	public String getProjectDetails() {
		return projectDetails;
	}
	public void setProjectDetails(String projectDetails) {
		this.projectDetails = projectDetails;
	}
	public String getProjectPhotos() {
		return projectPhotos;
	}
	public void setProjectPhotos(String projectPhotos) {
		this.projectPhotos = projectPhotos;
	}
	
	
	
	
	
}
