package org.maven02.service.impl;
import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.maven02.dao.DeptDao;
import org.maven02.dao.EmpDao;
import org.maven02.pojo.Dept;
import org.maven02.pojo.Emp;
import org.maven02.service.empService;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EmpServiceImpl implements empService{
		
@Resource
	private EmpDao ed;
@Resource
private DeptDao dd;

	public List<Emp> selectAll(Emp emp) {
		List<Emp> el = ed.selectAll();
		return el;
	}
	

	@Override
	public List<Dept> selectDept() {
		List<Dept> dl=dd.selectDept();
		return dl;
	}


	@Override
	public void deleteEmp(Integer eid) {
		ed.deleteEmp(eid);
		
	}


	@Override
	public void indexEmp(Emp emp) {
		ed.indexEmp(emp);
		
	}


	@Override
	public Emp selectId(Integer eid) {
		Emp el = ed.selectID(eid);
		return el;
	}


	@Override
	public void update(Emp emp) {
		 ed.update(emp);
	}
}
