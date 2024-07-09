package com.tia102test.dept.model;

public class Dept {
	private Integer xxx;
	private String dname;
	private String loc;

	public Integer getDeptno() {
		return xxx;
	}
	public void setDeptno(Integer deptno) {
		this.xxx = deptno;
	}
	
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
}
