package com.ishift.newb.vo;

import org.apache.ibatis.type.Alias;

@Alias("custvo")
public class CustomerVO {

	private String name;
	private String gender;
	private int female;
	private int male;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getFemale() {
		return female;
	}

	public void setFemale(int female) {
		this.female = female;
	}

	public int getMale() {
		return male;
	}

	public void setMale(int male) {
		this.male = male;
	}

	@Override
	public String toString() {
		return "CustomerVO [female=" + female + ", male=" + male + "]";
	}

//	@Builder
//	public CustomerVO(String customerName, String customerAddress, String female, String male) 
//	{
//		this.customerName = customerName;
//		this.customerAddress = customerAddress;
//		this.female = female;
//		this.male = male;
//	}
}
