package com.dav.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.dav.dto.StudentDTO;

@Service
public class StudentServiceImpl implements IStudentService{
	
	public int intData() {
		return 7;
	}
	
	public String stringData() {
		return "This is String Data";
	}
	
	public int[] integerArrayData() {
		return new int[] {10,45,63,24,5};
	}
	
	public Map<String,String> mapData() {
		
		Map<String,String> map = new HashMap<String,String>();
		map.put("uniform","regular");
		map.put("books","notebooks");
		map.put("bus","school BUS");
		
		return map;
	}
	
	
	@Override
	public List<StudentDTO> getStudent() {
		
		List<StudentDTO> list = new ArrayList<StudentDTO>();
			//add few studentDTO obj to list
		list.add(new StudentDTO(123,"joseph",65.4f));
		list.add(new StudentDTO(321,"Joshua",72.3f));
		list.add(new StudentDTO(456,"Elijah",89.9f));
		
		return list;
	}
	
	

}
