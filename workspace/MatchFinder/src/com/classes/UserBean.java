package com.classes;

import com.mysql.jdbc.Blob;

public class UserBean {

	private int id;
	private String name;
	private String password;
	private int age_of_agent;
	private int age_of_Business;
	private String email;
	private byte[] dp;
	private double lat;
	private double lan;
	private String address;
	private long contact;
	private String msg;
	private int status;
	private int update;
	public int getUpdate() {
		return update;
	}
	public void setUpdate(int update) {
		this.update = update;
	}
	public int getSub_amt() {
		return sub_amt;
	}
	public void setSub_amt(int sub_amt) {
		this.sub_amt = sub_amt;
	}
	private int sub_amt;

	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLan() {
		return lan;
	}
	public void setLan(double lan) {
		this.lan = lan;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge_of_agent() {
		return age_of_agent;
	}
	public void setAge_of_agent(int age_of_agent) {
		this.age_of_agent = age_of_agent;
	}
	public int getAge_of_Business() {
		return age_of_Business;
	}
	public void setAge_of_Business(int age_of_Business) {
		this.age_of_Business = age_of_Business;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public byte[] getDp() {
		return dp;
	}
	public void setDp(byte[] b) {
		this.dp = b;
	}
	
	
	
}