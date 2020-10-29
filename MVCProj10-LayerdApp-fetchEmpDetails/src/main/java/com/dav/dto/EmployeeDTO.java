package com.dav.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class EmployeeDTO implements Serializable {
	
	//Service class will have the code to generate the sr.no which makes the diff with BO obj
	private int srNo;
	//all these properties are same as EmplyeeBO
	private String ename;
	private String eaddrs;
	private String edesg;
	private float esal;
	private long ephone;
	private String edept;
	private float grossSalary;
	private float netSalary;

}
