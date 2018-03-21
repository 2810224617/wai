package org.maven02.dao;

import java.util.List;

import org.maven02.pojo.Emp;

public interface EmpDao {
	
	List<Emp> selectAll();

	void deleteEmp(Integer eid);

	void indexEmp(Emp emp);

	Emp selectID(Integer eid);

	void update(Emp emp);

}
