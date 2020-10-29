package com.dav.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.dav.bo.EmployeeBO;

@Repository("empDAO")
public class EmployeeDAOImpl implements IEmployeeDAO {

	@Autowired
	private JdbcTemplate jt;

	private static final String GET_EMPLOYEES = "select Ename,Eaddrs,Edesg,Esal,Ephone,Edept from Employee";

	@Override
	public List<EmployeeBO> fetchEmpDetails() {

		// create list of EmployeeBO
		List<EmployeeBO> listBO = null;
		// get the resultant EmployeeBO objects
		listBO = jt.query(GET_EMPLOYEES, new ListEmployee());
		
		/*
		 * if(listBO!=null) { System.out.println(listBO); }
		 */
		return listBO;
	}

	//INNER CLASS
	
	// we can also do the following inner class operation through Lambda Expressions
	// in jt.query() at 2nd param
	private static class ListEmployee implements ResultSetExtractor<List<EmployeeBO>> {

		// create EmployeeBO obj
		private EmployeeBO bo = null;

		@Override
		public List<EmployeeBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
			// create a list of EmployeeBO obj
			List<EmployeeBO> listBO = new ArrayList<EmployeeBO>();
			// set ResultSet data to BO obj and add/copy to listBO
			while (rs.next()) {
				bo = new EmployeeBO();
				bo.setEname(rs.getString(1));
				bo.setEaddrs(rs.getString(2));
				bo.setEdesg(rs.getString(3));
				bo.setEsal(rs.getFloat(4));
				bo.setEphone(rs.getLong(5));
				bo.setEdept(rs.getString(6));
				listBO.add(bo);
			}
			if(rs!=null)
				rs.close();
			return listBO;
		}// method

	}// inner class

}// outer class
