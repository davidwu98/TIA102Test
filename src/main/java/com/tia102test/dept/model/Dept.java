package com.tia102test.dept.model;

public class Dept {
	private Integer no;
	private String dname;
	private String loc;

	public Integer getDeptno() {
		return no;
	}
	public void setDeptno(Integer deptno) {
		this.no = deptno;
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
