package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class People {
	@Id
	private String id;
	private String peopleName;
	private String peopleSaid;
	private String peoplePhoto;
	public People(String peopleName, String peopleSaid, String peoplePhoto) {
		super();
		this.peopleName = peopleName;
		this.peopleSaid = peopleSaid;
		this.peoplePhoto = peoplePhoto;
	}
	public String getPeopleName() {
		return peopleName;
	}
	public void setPeopleName(String peopleName) {
		this.peopleName = peopleName;
	}
	public String getPeopleSaid() {
		return peopleSaid;
	}
	public void setPeopleSaid(String peopleSaid) {
		this.peopleSaid = peopleSaid;
	}
	public String getPeoplePhoto() {
		return peoplePhoto;
	}
	public void setPeoplePhoto(String peoplePhoto) {
		this.peoplePhoto = peoplePhoto;
	}
	
}
