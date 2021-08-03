package com.example.demo.pojo;

public class Fclass {
    private Long cId;

    private String classname;

    private Integer cNumber;
    
    private Education education;

    public Fclass() {}

    
	public Fclass(Long cId, String classname, Integer cNumber, Education education) {
		super();
		this.cId = cId;
		this.classname = classname;
		this.cNumber = cNumber;
		this.education = education;
	}


	public Long getcId() {
		return cId;
	}

	public void setcId(Long cId) {
		this.cId = cId;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public Integer getcNumber() {
		return cNumber;
	}

	public void setcNumber(Integer cNumber) {
		this.cNumber = cNumber;
	}

	public Education getEducation() {
		return education;
	}

	public void setEducation(Education education) {
		this.education = education;
	}

	@Override
	public String toString() {
		return "Fclass [cId=" + cId + ", classname=" + classname + ", cNumber=" + cNumber + ", education=" + education
				+ "]";
	}
    
    
    
}