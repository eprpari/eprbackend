package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Mat {
	@Id
	private String id;
	private String matName;
	private String matType;
	private String number;
	private String data;
	private String price;
	private String matImg;
	public Mat(String id, String matName, String matType, String number, String data, String price, String matImg) {
		super();
		this.id = id;
		this.matName = matName;
		this.matType = matType;
		this.number = number;
		this.data = data;
		this.price = price;
		this.matImg = matImg;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMatName() {
		return matName;
	}
	public void setMatName(String matName) {
		this.matName = matName;
	}
	public String getMatType() {
		return matType;
	}
	public void setMatType(String matType) {
		this.matType = matType;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getMatImg() {
		return matImg;
	}
	public void setMatImg(String matImg) {
		this.matImg = matImg;
	}
	
}