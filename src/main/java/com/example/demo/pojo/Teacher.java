package com.example.demo.pojo;

import java.util.Date;

public class Teacher {
    private Long tId;

    private String tNo;

    private String tName;

    private Integer tGender;

    private String tPhone;

    private String tEmail;

    private Date tBirthday;

    private String tCard;

    private String tSchool;

    private Integer tYear;

    private Integer tEducation;

    private Integer tDegree;

    private String tMajor;

    private Integer tFettle;

    private String tRemark;

    public Long gettId() {
        return tId;
    }

    public void settId(Long tId) {
        this.tId = tId;
    }

    public String gettNo() {
        return tNo;
    }

    public void settNo(String tNo) {
        this.tNo = tNo == null ? null : tNo.trim();
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName == null ? null : tName.trim();
    }

    public Integer gettGender() {
        return tGender;
    }

    public void settGender(Integer tGender) {
        this.tGender = tGender;
    }

    public String gettPhone() {
        return tPhone;
    }

    public void settPhone(String tPhone) {
        this.tPhone = tPhone == null ? null : tPhone.trim();
    }

    public String gettEmail() {
        return tEmail;
    }

    public void settEmail(String tEmail) {
        this.tEmail = tEmail == null ? null : tEmail.trim();
    }

    public Date gettBirthday() {
        return tBirthday;
    }

    public void settBirthday(Date tBirthday) {
        this.tBirthday = tBirthday;
    }

    public String gettCard() {
        return tCard;
    }

    public void settCard(String tCard) {
        this.tCard = tCard == null ? null : tCard.trim();
    }

    public String gettSchool() {
        return tSchool;
    }

    public void settSchool(String tSchool) {
        this.tSchool = tSchool == null ? null : tSchool.trim();
    }

    public Integer gettYear() {
        return tYear;
    }

    public void settYear(Integer tYear) {
        this.tYear = tYear;
    }

    public Integer gettEducation() {
        return tEducation;
    }

    public void settEducation(Integer tEducation) {
        this.tEducation = tEducation;
    }

    public Integer gettDegree() {
        return tDegree;
    }

    public void settDegree(Integer tDegree) {
        this.tDegree = tDegree;
    }

    public String gettMajor() {
        return tMajor;
    }

    public void settMajor(String tMajor) {
        this.tMajor = tMajor == null ? null : tMajor.trim();
    }

    public Integer gettFettle() {
        return tFettle;
    }

    public void settFettle(Integer tFettle) {
        this.tFettle = tFettle;
    }

    public String gettRemark() {
        return tRemark;
    }

    public void settRemark(String tRemark) {
        this.tRemark = tRemark == null ? null : tRemark.trim();
    }
}