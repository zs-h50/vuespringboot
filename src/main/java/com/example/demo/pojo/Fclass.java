package com.example.demo.pojo;

public class Fclass {
    private Long cId;

    private String classname;

    private Integer cNumber;

    public Fclass() {}
    
    public Fclass(Long cId, String classname, Integer cNumber) {
		super();
		this.cId = cId;
		this.classname = classname;
		this.cNumber = cNumber;
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
        this.classname = classname == null ? null : classname.trim();
    }

    public Integer getcNumber() {
        return cNumber;
    }

    public void setcNumber(Integer cNumber) {
        this.cNumber = cNumber;
    }

	@Override
	public String toString() {
		return "Fclass [cId=" + cId + ", classname=" + classname + ", cNumber=" + cNumber + "]";
	}
    
    
}