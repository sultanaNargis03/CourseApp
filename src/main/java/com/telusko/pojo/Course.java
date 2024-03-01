package com.telusko.pojo;

public class Course 
{
	private Integer cid;
	private String cname;
	private Double cprice;
	private String cDuration;
	
	public Course() 
	{
		
	}

	public Course(Integer cid, String cname, Double cprice, String cDuration) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cprice = cprice;
		this.cDuration = cDuration;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Double getCprice() {
		return cprice;
	}

	public void setCprice(Double cprice) {
		this.cprice = cprice;
	}

	public String getcDuration() {
		return cDuration;
	}

	public void setcDuration(String cDuration) {
		this.cDuration = cDuration;
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", cprice=" + cprice + ", cDuration=" + cDuration + "]";
	}
	
	
}
