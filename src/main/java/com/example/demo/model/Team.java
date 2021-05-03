package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document
public class Team {
	@Id
	private String id;
	private String mebName;
	private String mebPhotos;
	private String mabData;
	public Team(String id, String mebName, String mebPhotos, String mabData) {
		super();
		this.id = id;
		this.mebName = mebName;
		this.mebPhotos = mebPhotos;
		this.mabData = mabData;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMebName() {
		return mebName;
	}
	public void setMebName(String mebName) {
		this.mebName = mebName;
	}
	public String getMebPhotos() {
		return mebPhotos;
	}
	public void setMebPhotos(String mebPhotos) {
		this.mebPhotos = mebPhotos;
	}
	public String getMabData() {
		return mabData;
	}
	public void setMabData(String mabData) {
		this.mabData = mabData;
	}
	
 
}
