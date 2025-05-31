package com.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "donar_info")
public class Donar {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int donarid;
	private String donarname;
	private String donaremail;
	private String address;
	private String age;
	private String bloodgroup;
	public Donar() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Donar(int donarid, String donarname, String donaremail, String address, String age, String bloodgroup) {
		super();
		this.donarid = donarid;
		this.donarname = donarname;
		this.donaremail = donaremail;
		this.address = address;
		this.age = age;
		this.bloodgroup = bloodgroup;
	}
	public int getDonarid() {
		return donarid;
	}
	public void setDonarid(int donarid) {
		this.donarid = donarid;
	}
	public String getDonarname() {
		return donarname;
	}
	public void setDonarname(String donarname) {
		this.donarname = donarname;
	}
	public String getDonaremail() {
		return donaremail;
	}
	public void setDonaremail(String donaremail) {
		this.donaremail = donaremail;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	@Override
	public String toString() {
		return "Donar [donarid=" + donarid + ", donarname=" + donarname + ", donaremail=" + donaremail + ", address="
				+ address + ", age=" + age + ", bloodgroup=" + bloodgroup + "]";
	}
	
	
}
