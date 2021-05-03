package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Company {
	@Id
	private String id;
	private String companyName;
	private String companyLogo;
	private String weAre1;
	private String weAre2;
	private String weAre3;
	private String service1;
	private String service2;
	private String service3;
	private String service4;
	private String serviceData1;
	private String serviceData2;
	private String serviceData3;
	private String serviceData4;
	private List<Project> projects = new ArrayList<Project> () ;
	private String team1;
	private String teamPhotos1;
	private String team2;
	private String teamPhotos2;
	private String companyRegNumber;
	private String companyGrading;
	private String phoneNumber;
	private String emailAddress;
	private String address;
	private String socialMediaAddress;
	private String webAddress;
	private String numberOfProject;
	public Company(String id, String companyName, String companyLogo, String weAre1, String weAre2, String weAre3,
			String service1, String service2, String service3, String service4, String serviceData1,
			String serviceData2, String serviceData3, String serviceData4, List<Project> projects, String team1,
			String teamPhotos1, String team2, String teamPhotos2, String companyRegNumber, String companyGrading,
			String phoneNumber, String emailAddress, String address, String socialMediaAddress, String webAddress,
			String numberOfProject) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.companyLogo = companyLogo;
		this.weAre1 = weAre1;
		this.weAre2 = weAre2;
		this.weAre3 = weAre3;
		this.service1 = service1;
		this.service2 = service2;
		this.service3 = service3;
		this.service4 = service4;
		this.serviceData1 = serviceData1;
		this.serviceData2 = serviceData2;
		this.serviceData3 = serviceData3;
		this.serviceData4 = serviceData4;
		this.projects = projects;
		this.team1 = team1;
		this.teamPhotos1 = teamPhotos1;
		this.team2 = team2;
		this.teamPhotos2 = teamPhotos2;
		this.companyRegNumber = companyRegNumber;
		this.companyGrading = companyGrading;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
		this.address = address;
		this.socialMediaAddress = socialMediaAddress;
		this.webAddress = webAddress;
		this.numberOfProject = numberOfProject;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyLogo() {
		return companyLogo;
	}
	public void setCompanyLogo(String companyLogo) {
		this.companyLogo = companyLogo;
	}
	public String getWeAre1() {
		return weAre1;
	}
	public void setWeAre1(String weAre1) {
		this.weAre1 = weAre1;
	}
	public String getWeAre2() {
		return weAre2;
	}
	public void setWeAre2(String weAre2) {
		this.weAre2 = weAre2;
	}
	public String getWeAre3() {
		return weAre3;
	}
	public void setWeAre3(String weAre3) {
		this.weAre3 = weAre3;
	}
	public String getService1() {
		return service1;
	}
	public void setService1(String service1) {
		this.service1 = service1;
	}
	public String getService2() {
		return service2;
	}
	public void setService2(String service2) {
		this.service2 = service2;
	}
	public String getService3() {
		return service3;
	}
	public void setService3(String service3) {
		this.service3 = service3;
	}
	public String getService4() {
		return service4;
	}
	public void setService4(String service4) {
		this.service4 = service4;
	}
	public String getServiceData1() {
		return serviceData1;
	}
	public void setServiceData1(String serviceData1) {
		this.serviceData1 = serviceData1;
	}
	public String getServiceData2() {
		return serviceData2;
	}
	public void setServiceData2(String serviceData2) {
		this.serviceData2 = serviceData2;
	}
	public String getServiceData3() {
		return serviceData3;
	}
	public void setServiceData3(String serviceData3) {
		this.serviceData3 = serviceData3;
	}
	public String getServiceData4() {
		return serviceData4;
	}
	public void setServiceData4(String serviceData4) {
		this.serviceData4 = serviceData4;
	}
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	public String getTeam1() {
		return team1;
	}
	public void setTeam1(String team1) {
		this.team1 = team1;
	}
	public String getTeamPhotos1() {
		return teamPhotos1;
	}
	public void setTeamPhotos1(String teamPhotos1) {
		this.teamPhotos1 = teamPhotos1;
	}
	public String getTeam2() {
		return team2;
	}
	public void setTeam2(String team2) {
		this.team2 = team2;
	}
	public String getTeamPhotos2() {
		return teamPhotos2;
	}
	public void setTeamPhotos2(String teamPhotos2) {
		this.teamPhotos2 = teamPhotos2;
	}
	public String getCompanyRegNumber() {
		return companyRegNumber;
	}
	public void setCompanyRegNumber(String companyRegNumber) {
		this.companyRegNumber = companyRegNumber;
	}
	public String getCompanyGrading() {
		return companyGrading;
	}
	public void setCompanyGrading(String companyGrading) {
		this.companyGrading = companyGrading;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSocialMediaAddress() {
		return socialMediaAddress;
	}
	public void setSocialMediaAddress(String socialMediaAddress) {
		this.socialMediaAddress = socialMediaAddress;
	}
	public String getWebAddress() {
		return webAddress;
	}
	public void setWebAddress(String webAddress) {
		this.webAddress = webAddress;
	}
	public String getNumberOfProject() {
		return numberOfProject;
	}
	public void setNumberOfProject(String numberOfProject) {
		this.numberOfProject = numberOfProject;
	}
	
	
	
}
