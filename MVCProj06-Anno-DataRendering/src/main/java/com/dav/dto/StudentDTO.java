package com.dav.dto;

public class StudentDTO {
	
	public Integer sno; //using wrapper types is good becoz form launching integer intial values cannot be set to 0
	public String sname;
	public Float savg;
	
	public StudentDTO(Integer sno, String sname, Float savg) {
		
		this.sno = sno;
		this.sname = sname;
		this.savg = savg;
	}
	
	
	public Integer getSno() {
		return sno;
	}
	public void setSno(Integer sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Float getSavg() {
		return savg;
	}
	public void setSavg(Float savg) {
		this.savg = savg;
	}
	

}
