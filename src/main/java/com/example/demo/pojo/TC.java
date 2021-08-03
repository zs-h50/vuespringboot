package com.example.demo.pojo;

public class TC {
	private Long tcId;
	private Long tId;
	private Long cId;
	
	public TC() {}
	public TC(Long tcId, Long tId, Long cId) {
		super();
		this.tcId = tcId;
		this.tId = tId;
		this.cId = cId;
	}
	public Long getTcId() {
		return tcId;
	}
	public void setTcId(Long tcId) {
		this.tcId = tcId;
	}
	public Long gettId() {
		return tId;
	}
	public void settId(Long tId) {
		this.tId = tId;
	}
	public Long getcId() {
		return cId;
	}
	public void setcId(Long cId) {
		this.cId = cId;
	}
	@Override
	public String toString() {
		return "TC [tcId=" + tcId + ", tId=" + tId + ", cId=" + cId + "]";
	}
}
