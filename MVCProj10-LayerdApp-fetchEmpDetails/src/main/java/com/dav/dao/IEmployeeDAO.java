package com.dav.dao;

import java.util.List;

import com.dav.bo.EmployeeBO;

public interface IEmployeeDAO {

	public List<EmployeeBO> fetchEmpDetails();
}
