package com.example.SpringBoot.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="institute")
public class Academy {
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int instituteid;
	private String institutename;
	private String institutedescription;
	private String instituteaddress;
	private String mobile;
	private String email;
	private String instituteimage;
	
	public int getInstituteid() {
		return instituteid;
	}
	public void setInstituteid(int instituteid) {
		this.instituteid = instituteid;
	}
	public String getInstitutename() {
		return institutename;
	}
	public void setInstitutename(String institutename) {
		this.institutename = institutename;
	}
	public String getInstitutedescription() {
		return institutedescription;
	}
	public void setInstitutedescription(String institutedescription) {
		this.institutedescription = institutedescription;
	}
	public String getInstituteaddress() {
		return instituteaddress;
	}
	public void setInstituteaddress(String instituteaddress) {
		this.instituteaddress = instituteaddress;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getInstituteimage() {
		return instituteimage;
	}
	public void setInstituteimage(String instituteimage) {
		this.instituteimage = instituteimage;
	}
	public Academy() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Academy(int instituteid, String institutename, String institutedescription, String instituteaddress,
			String mobile, String email, String instituteimage) {
		super();
		this.instituteid = instituteid;
		this.institutename = institutename;
		this.institutedescription = institutedescription;
		this.instituteaddress = instituteaddress;
		this.mobile = mobile;
		this.email = email;
		this.instituteimage = instituteimage;
	}
	
		

}
