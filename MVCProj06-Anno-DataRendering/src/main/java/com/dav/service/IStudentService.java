package com.dav.service;

import java.util.List;
import java.util.Map;

import com.dav.dto.StudentDTO;

public interface IStudentService {

	public List<StudentDTO>	getStudent();
	public int intData();
	public String stringData();
	public int[] integerArrayData();
	public Map mapData();
	
}
