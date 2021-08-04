package com.example.demo.pojo;

import java.util.Date;

public class Student {
    private Long sId;	//学生标识

    private String sNo;	 //学生学号

    private String sName;	//姓名

    private Integer gender;		//性别

    private String sPhone;		//电话号码

    private String email;		//邮箱

    private Date birthday;		//生日

    private String idCard;		//身份证号码

    private String contact;		//联系人

    private String contactphone;  //联系人电话

    private String address;		//住址

    private String postcode;	//邮编

    private String father;		//父亲名字

    private String fatherphone;		//父亲电话

    private String mather;		//母亲名字
    
    private String matherphone;	//母亲电话

    private Integer fettle;		//状态（在读，退学，休学）

    private String remark;	//备注

    private Long cId;	//班级标识 

    private String situation; 	//家庭状况
    
    private Fclass fclass;
    
    private HouseHold houseHold;

    
    public Student() {}


	public Student(Long sId, String sNo, String sName, Integer gender, String sPhone, String email, Date birthday,
			String idCard, String contact, String contactphone, String address, String postcode, String father,
			String fatherphone, String mather, String matherphone, Integer fettle, String remark, Long cId,
			String situation, Fclass fclass, HouseHold houseHold) {
		super();
		this.sId = sId;
		this.sNo = sNo;
		this.sName = sName;
		this.gender = gender;
		this.sPhone = sPhone;
		this.email = email;
		this.birthday = birthday;
		this.idCard = idCard;
		this.contact = contact;
		this.contactphone = contactphone;
		this.address = address;
		this.postcode = postcode;
		this.father = father;
		this.fatherphone = fatherphone;
		this.mather = mather;
		this.matherphone = matherphone;
		this.fettle = fettle;
		this.remark = remark;
		this.cId = cId;
		this.situation = situation;
		this.fclass = fclass;
		this.houseHold = houseHold;
	}


	public Long getsId() {
		return sId;
	}


	public void setsId(Long sId) {
		this.sId = sId;
	}


	public String getsNo() {
		return sNo;
	}


	public void setsNo(String sNo) {
		this.sNo = sNo;
	}


	public String getsName() {
		return sName;
	}


	public void setsName(String sName) {
		this.sName = sName;
	}


	public Integer getGender() {
		return gender;
	}


	public void setGender(Integer gender) {
		this.gender = gender;
	}


	public String getsPhone() {
		return sPhone;
	}


	public void setsPhone(String sPhone) {
		this.sPhone = sPhone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Date getBirthday() {
		return birthday;
	}


	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}


	public String getIdCard() {
		return idCard;
	}


	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}


	public String getContact() {
		return contact;
	}


	public void setContact(String contact) {
		this.contact = contact;
	}


	public String getContactphone() {
		return contactphone;
	}


	public void setContactphone(String contactphone) {
		this.contactphone = contactphone;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPostcode() {
		return postcode;
	}


	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}


	public String getFather() {
		return father;
	}


	public void setFather(String father) {
		this.father = father;
	}


	public String getFatherphone() {
		return fatherphone;
	}


	public void setFatherphone(String fatherphone) {
		this.fatherphone = fatherphone;
	}


	public String getMather() {
		return mather;
	}


	public void setMather(String mather) {
		this.mather = mather;
	}


	public String getMatherphone() {
		return matherphone;
	}


	public void setMatherphone(String matherphone) {
		this.matherphone = matherphone;
	}


	public Integer getFettle() {
		return fettle;
	}


	public void setFettle(Integer fettle) {
		this.fettle = fettle;
	}


	public String getRemark() {
		return remark;
	}


	public void setRemark(String remark) {
		this.remark = remark;
	}


	public Long getcId() {
		return cId;
	}


	public void setcId(Long cId) {
		this.cId = cId;
	}


	public String getSituation() {
		return situation;
	}


	public void setSituation(String situation) {
		this.situation = situation;
	}


	public Fclass getFclass() {
		return fclass;
	}


	public void setFclass(Fclass fclass) {
		this.fclass = fclass;
	}


	public HouseHold getHouseHold() {
		return houseHold;
	}


	public void setHouseHold(HouseHold houseHold) {
		this.houseHold = houseHold;
	}


	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sNo=" + sNo + ", sName=" + sName + ", gender=" + gender + ", sPhone=" + sPhone
				+ ", email=" + email + ", birthday=" + birthday + ", idCard=" + idCard + ", contact=" + contact
				+ ", contactphone=" + contactphone + ", address=" + address + ", postcode=" + postcode + ", father="
				+ father + ", fatherphone=" + fatherphone + ", mather=" + mather + ", matherphone=" + matherphone
				+ ", fettle=" + fettle + ", remark=" + remark + ", cId=" + cId + ", situation=" + situation
				+ ", fclass=" + fclass + ", houseHold=" + houseHold + "]";
	}

    

	
    
    
}