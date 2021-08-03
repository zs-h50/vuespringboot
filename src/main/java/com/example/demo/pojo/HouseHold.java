package com.example.demo.pojo;

import java.util.Date;

public class HouseHold {
    private Long hId;	//家庭标识

    private Long sId;	//学生标识

    private Integer genre;	//成员类型

    private String hName;	//姓名

    private Integer hGender;	//性别

    private String hPhone;	//电话号码

    private Date hBirthday;	 //出生日期

    private String hCard;	//身份信息

    private Integer hFettle;	//状态(烈士家庭，离异家庭，正常)

    private String hRemark; //备注
    
    private Student student;

	public Long gethId() {
		return hId;
	}

	public void sethId(Long hId) {
		this.hId = hId;
	}

	public Long getsId() {
		return sId;
	}

	public void setsId(Long sId) {
		this.sId = sId;
	}

	public Integer getGenre() {
		return genre;
	}

	public void setGenre(Integer genre) {
		this.genre = genre;
	}

	public String gethName() {
		return hName;
	}

	public void sethName(String hName) {
		this.hName = hName;
	}

	public Integer gethGender() {
		return hGender;
	}

	public void sethGender(Integer hGender) {
		this.hGender = hGender;
	}

	public String gethPhone() {
		return hPhone;
	}

	public void sethPhone(String hPhone) {
		this.hPhone = hPhone;
	}

	public Date gethBirthday() {
		return hBirthday;
	}

	public void sethBirthday(Date hBirthday) {
		this.hBirthday = hBirthday;
	}

	public String gethCard() {
		return hCard;
	}

	public void sethCard(String hCard) {
		this.hCard = hCard;
	}

	public Integer gethFettle() {
		return hFettle;
	}

	public void sethFettle(Integer hFettle) {
		this.hFettle = hFettle;
	}

	public String gethRemark() {
		return hRemark;
	}

	public void sethRemark(String hRemark) {
		this.hRemark = hRemark;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "HouseHold [hId=" + hId + ", sId=" + sId + ", genre=" + genre + ", hName=" + hName + ", hGender="
				+ hGender + ", hPhone=" + hPhone + ", hBirthday=" + hBirthday + ", hCard=" + hCard + ", hFettle="
				+ hFettle + ", hRemark=" + hRemark + ", student=" + student + "]";
	}

	public HouseHold(Long hId, Long sId, Integer genre, String hName, Integer hGender, String hPhone, Date hBirthday,
			String hCard, Integer hFettle, String hRemark, Student student) {
		super();
		this.hId = hId;
		this.sId = sId;
		this.genre = genre;
		this.hName = hName;
		this.hGender = hGender;
		this.hPhone = hPhone;
		this.hBirthday = hBirthday;
		this.hCard = hCard;
		this.hFettle = hFettle;
		this.hRemark = hRemark;
		this.student = student;
	}

	public HouseHold() {}
}