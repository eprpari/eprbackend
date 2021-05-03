package com.example.demo.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document


public class Peoplesaid {
	
	@Id

	private String id;
	private String companyname;
	private String peopleimg1;
	private String peopleimg2;
	private String peopleimg3;
	private String peoplename1;
	private String peoplename2;
	private String peoplename3;
	private String status1;
	private String status2;
	private String status3;
	private String description1;
	private String description2;
	private String description3;
	private String companyimg;
	public Peoplesaid(String id, String companyname, String peopleimg1, String peopleimg2, String peopleimg3,
			String peoplename1, String peoplename2, String peoplename3, String status1, String status2, String status3,
			String description1, String description2, String description3, String companyimg) {
		super();
		this.id = id;
		this.companyname = companyname;
		this.peopleimg1 = peopleimg1;
		this.peopleimg2 = peopleimg2;
		this.peopleimg3 = peopleimg3;
		this.peoplename1 = peoplename1;
		this.peoplename2 = peoplename2;
		this.peoplename3 = peoplename3;
		this.status1 = status1;
		this.status2 = status2;
		this.status3 = status3;
		this.description1 = description1;
		this.description2 = description2;
		this.description3 = description3;
		this.companyimg = companyimg;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getPeopleimg1() {
		return peopleimg1;
	}
	public void setPeopleimg1(String peopleimg1) {
		this.peopleimg1 = peopleimg1;
	}
	public String getPeopleimg2() {
		return peopleimg2;
	}
	public void setPeopleimg2(String peopleimg2) {
		this.peopleimg2 = peopleimg2;
	}
	public String getPeopleimg3() {
		return peopleimg3;
	}
	public void setPeopleimg3(String peopleimg3) {
		this.peopleimg3 = peopleimg3;
	}
	public String getPeoplename1() {
		return peoplename1;
	}
	public void setPeoplename1(String peoplename1) {
		this.peoplename1 = peoplename1;
	}
	public String getPeoplename2() {
		return peoplename2;
	}
	public void setPeoplename2(String peoplename2) {
		this.peoplename2 = peoplename2;
	}
	public String getPeoplename3() {
		return peoplename3;
	}
	public void setPeoplename3(String peoplename3) {
		this.peoplename3 = peoplename3;
	}
	public String getStatus1() {
		return status1;
	}
	public void setStatus1(String status1) {
		this.status1 = status1;
	}
	public String getStatus2() {
		return status2;
	}
	public void setStatus2(String status2) {
		this.status2 = status2;
	}
	public String getStatus3() {
		return status3;
	}
	public void setStatus3(String status3) {
		this.status3 = status3;
	}
	public String getDescription1() {
		return description1;
	}
	public void setDescription1(String description1) {
		this.description1 = description1;
	}
	public String getDescription2() {
		return description2;
	}
	public void setDescription2(String description2) {
		this.description2 = description2;
	}
	public String getDescription3() {
		return description3;
	}
	public void setDescription3(String description3) {
		this.description3 = description3;
	}
	public String getCompanyimg() {
		return companyimg;
	}
	public void setCompanyimg(String companyimg) {
		this.companyimg = companyimg;
	}
	
	
	
}