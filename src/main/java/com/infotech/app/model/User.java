package com.infotech.app.model;

public class User {
	private Integer organizationId;
	private String name;
	private String password;
	private String email;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone_number() {
		return email;
	}
	public void setPhone_number(String phone_number) {
		this.email = phone_number;
	}
	public Integer getOrganizationId() {
		return organizationId;
	}
	public void setOrganizationId(Integer organizationId) {
		this.organizationId = organizationId;
	}
	public String getFirstName() {
		return name;
	}
	public void setFirstName(String firstName) {
		this.name = firstName;
	}
	@Override
	public String toString() {
		return "User [organizationId=" + organizationId + ", firstName=" + name + ", password=" + password
				+ ", phone_number=" + email + "]";
	}
	
	
	

}
