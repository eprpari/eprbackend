package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "devices")
public class Devices {
@Id
	private String id;
private String title;
private String price;
private String description;
private String avatarUrl;
private String imageUrl01;
private String imageUrl02;
private String imageUrl03;
private String imageUrl04;
private String leDescrip01;
private String leDescrip02;
private String leDescrip03;
private String riDescrip04;
public Devices(String id, String title, String price, String description, String avatarUrl, String imageUrl01,
		String imageUrl02, String imageUrl03, String imageUrl04, String leDescrip01, String leDescrip02,
		String leDescrip03, String riDescrip04) {
	super();
	this.id = id;
	this.title = title;
	this.price = price;
	this.description = description;
	this.avatarUrl = avatarUrl;
	this.imageUrl01 = imageUrl01;
	this.imageUrl02 = imageUrl02;
	this.imageUrl03 = imageUrl03;
	this.imageUrl04 = imageUrl04;
	this.leDescrip01 = leDescrip01;
	this.leDescrip02 = leDescrip02;
	this.leDescrip03 = leDescrip03;
	this.riDescrip04 = riDescrip04;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getAvatarUrl() {
	return avatarUrl;
}
public void setAvatarUrl(String avatarUrl) {
	this.avatarUrl = avatarUrl;
}
public String getImageUrl01() {
	return imageUrl01;
}
public void setImageUrl01(String imageUrl01) {
	this.imageUrl01 = imageUrl01;
}
public String getImageUrl02() {
	return imageUrl02;
}
public void setImageUrl02(String imageUrl02) {
	this.imageUrl02 = imageUrl02;
}
public String getImageUrl03() {
	return imageUrl03;
}
public void setImageUrl03(String imageUrl03) {
	this.imageUrl03 = imageUrl03;
}
public String getImageUrl04() {
	return imageUrl04;
}
public void setImageUrl04(String imageUrl04) {
	this.imageUrl04 = imageUrl04;
}
public String getLeDescrip01() {
	return leDescrip01;
}
public void setLeDescrip01(String leDescrip01) {
	this.leDescrip01 = leDescrip01;
}
public String getLeDescrip02() {
	return leDescrip02;
}
public void setLeDescrip02(String leDescrip02) {
	this.leDescrip02 = leDescrip02;
}
public String getLeDescrip03() {
	return leDescrip03;
}
public void setLeDescrip03(String leDescrip03) {
	this.leDescrip03 = leDescrip03;
}
public String getRiDescrip04() {
	return riDescrip04;
}
public void setRiDescrip04(String riDescrip04) {
	this.riDescrip04 = riDescrip04;
}

	
	
		
	
	}
