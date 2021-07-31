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

    private String situation;

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
        this.sNo = sNo == null ? null : sNo.trim();
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
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
        this.sPhone = sPhone == null ? null : sPhone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
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
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getContactphone() {
        return contactphone;
    }

    public void setContactphone(String contactphone) {
        this.contactphone = contactphone == null ? null : contactphone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father == null ? null : father.trim();
    }

    public String getFatherphone() {
        return fatherphone;
    }

    public void setFatherphone(String fatherphone) {
        this.fatherphone = fatherphone == null ? null : fatherphone.trim();
    }

    public String getMather() {
        return mather;
    }

    public void setMather(String mather) {
        this.mather = mather == null ? null : mather.trim();
    }

    public String getMatherphone() {
        return matherphone;
    }

    public void setMatherphone(String matherphone) {
        this.matherphone = matherphone == null ? null : matherphone.trim();
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
        this.remark = remark == null ? null : remark.trim();
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
        this.situation = situation == null ? null : situation.trim();
    }

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sNo=" + sNo + ", sName=" + sName + ", gender=" + gender + ", sPhone=" + sPhone
				+ ", email=" + email + ", birthday=" + birthday + ", idCard=" + idCard + ", contact=" + contact
				+ ", contactphone=" + contactphone + ", address=" + address + ", postcode=" + postcode + ", father="
				+ father + ", fatherphone=" + fatherphone + ", mather=" + mather + ", matherphone=" + matherphone
				+ ", fettle=" + fettle + ", remark=" + remark + ", cId=" + cId + ", situation=" + situation + "]";
	}
    
}