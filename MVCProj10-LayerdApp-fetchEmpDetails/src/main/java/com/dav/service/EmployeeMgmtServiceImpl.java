package com.dav.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dav.bo.EmployeeBO;
import com.dav.dao.IEmployeeDAO;
import com.dav.dto.EmployeeDTO;

@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
	
	@Autowired
	public IEmployeeDAO dao;
	
	

	@Override
	public List<EmployeeDTO> getAllEmployees() {
		
		//create empty List of BO Objects
		List<EmployeeBO> listBO = null;
		 List<EmployeeDTO> listDTO=new ArrayList<EmployeeDTO>();
		//get all the employee details from DAO
		listBO = dao.fetchEmpDetails();
		//copy all properties of BO to DTO
		//BeanUtils.copyProperties(listBO, listDTO);
		if(listBO!=null) {
			System.out.println(listBO);
		}
		//Add additional properties of DTO
		listBO.forEach(bo->{
			EmployeeDTO dto = new EmployeeDTO();
			//System.out.println("BO Object :: "+bo);
			BeanUtils.copyProperties(bo, dto);
			System.out.println(dto);
			dto.setGrossSalary((float)(dto.getEsal()+dto.getEsal()*0.07));
			dto.setNetSalary((float)(dto.getEsal()-dto.getEsal()*0.05));
			dto.setEsal(Math.round(dto.getEsal()));
			listDTO.add(dto);
		});
		//return the List of DTO's
		return listDTO;
	}

}
