package com.springwebflux.bootcamp.service.personal.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "personal")
public class Personal {


@Id
	private String id;
	private String nrodoc;
	private String name;
	private String mail;
	private String phone;
	private String status;
	private String client_type;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNrodoc() {
		return nrodoc;
	}
	public void setNrodoc(String nrodoc) {
		this.nrodoc = nrodoc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getClient_type() {
		return client_type;
	}
	public void setClient_type(String client_type) {
		this.client_type = client_type;
	}
	
	
	
 
 

	
}
