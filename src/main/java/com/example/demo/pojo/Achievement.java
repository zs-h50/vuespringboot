package com.example.demo.pojo;

public class Achievement {
    private Long aId;

    private Long sId;

    private Long cId;

    private Integer aYears;

    private Integer aSemester;

    private Integer aScore;

    private String aRemark;
    
    private Student student;
    
    private Teacher teacher;
    
    private Course course;
    
    private Fclass fclass;

	public Achievement() {
		super();
	}

	public Achievement(Long aId, Long sId, Long cId, Integer aYears, Integer aSemester, Integer aScore, String aRemark,
			Student student, Teacher teacher, Course course, Fclass fclass) {
		super();
		this.aId = aId;
		this.sId = sId;
		this.cId = cId;
		this.aYears = aYears;
		this.aSemester = aSemester;
		this.aScore = aScore;
		this.aRemark = aRemark;
		this.student = student;
		this.teacher = teacher;
		this.course = course;
		this.fclass = fclass;
	}

	public Long getaId() {
		return aId;
	}

	public void setaId(Long aId) {
		this.aId = aId;
	}

	public Long getsId() {
		return sId;
	}

	public void setsId(Long sId) {
		this.sId = sId;
	}

	public Long getcId() {
		return cId;
	}

	public void setcId(Long cId) {
		this.cId = cId;
	}

	public Integer getaYears() {
		return aYears;
	}

	public void setaYears(Integer aYears) {
		this.aYears = aYears;
	}

	public Integer getaSemester() {
		return aSemester;
	}

	public void setaSemester(Integer aSemester) {
		this.aSemester = aSemester;
	}

	public Integer getaScore() {
		return aScore;
	}

	public void setaScore(Integer aScore) {
		this.aScore = aScore;
	}

	public String getaRemark() {
		return aRemark;
	}

	public void setaRemark(String aRemark) {
		this.aRemark = aRemark;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Fclass getFclass() {
		return fclass;
	}

	public void setFclass(Fclass fclass) {
		this.fclass = fclass;
	}

	@Override
	public String toString() {
		return "Achievement [aId=" + aId + ", sId=" + sId + ", cId=" + cId + ", aYears=" + aYears + ", aSemester="
				+ aSemester + ", aScore=" + aScore + ", aRemark=" + aRemark + ", student=" + student + ", teacher="
				+ teacher + ", course=" + course + ", fclass=" + fclass + "]";
	}

	
	
    
}