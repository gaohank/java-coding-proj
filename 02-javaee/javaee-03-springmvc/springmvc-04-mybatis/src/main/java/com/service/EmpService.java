package com.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.TEmpDao;
import com.domain.TEmp;

@Service
public class EmpService {

	@Resource
	private TEmpDao tEmpDao;//×¢ÈëTEmpDao
	
	public Map<String, List<TEmp>> findAll() {
		List<TEmp> list = tEmpDao.findAll();
		Map<String,List<TEmp>> data = new HashMap<String,List<TEmp>>();
		data.put("empList", list);
		return data;
	}

	public void addEmp(TEmp emp) {
		tEmpDao.insertSelective(emp);	
	}

	public void deleteEmp(Integer empno) {
		tEmpDao.deleteByPrimaryKey(empno);
	}

	public TEmp selectedById(Integer empno) {
		return tEmpDao.selectByPrimaryKey(empno);
	}

	public void updateEmp(TEmp emp) {
		tEmpDao.updateByPrimaryKeySelective(emp);
	}


}
