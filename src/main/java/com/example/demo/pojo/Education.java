package com.example.demo.pojo;

public class Education {
    private Long eId;

    private Long cId;

    private Long tId;

    private Integer eYear;

    private Integer eSemester;

    private Integer eFettle;

    private String eRemark;

    private Integer courseId;
    
    private Course course;
    
    
    public Education() {}
    
	public Education(Long eId, Long cId, Long tId, Integer eYear, Integer eSemester, Integer eFettle, String eRemark,
			Integer courseId, Course course) {
		super();
		this.eId = eId;
		this.cId = cId;
		this.tId = tId;
		this.eYear = eYear;
		this.eSemester = eSemester;
		this.eFettle = eFettle;
		this.eRemark = eRemark;
		this.courseId = courseId;
		this.course = course;
	}
	public Long geteId() {
		return eId;
	}
	public void seteId(Long eId) {
		this.eId = eId;
	}
	public Long getcId() {
		return cId;
	}
	public void setcId(Long cId) {
		this.cId = cId;
	}
	public Long gettId() {
		return tId;
	}
	public void settId(Long tId) {
		this.tId = tId;
	}
	public Integer geteYear() {
		return eYear;
	}
	public void seteYear(Integer eYear) {
		this.eYear = eYear;
	}
	public Integer geteSemester() {
		return eSemester;
	}
	public void seteSemester(Integer eSemester) {
		this.eSemester = eSemester;
	}
	public Integer geteFettle() {
		return eFettle;
	}
	public void seteFettle(Integer eFettle) {
		this.eFettle = eFettle;
	}
	public String geteRemark() {
		return eRemark;
	}
	public void seteRemark(String eRemark) {
		this.eRemark = eRemark;
	}
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Education [eId=" + eId + ", cId=" + cId + ", tId=" + tId + ", eYear=" + eYear + ", eSemester="
				+ eSemester + ", eFettle=" + eFettle + ", eRemark=" + eRemark + ", courseId=" + courseId + ", course="
				+ course + "]";
	}

   
}