package org.maven02.service;

import java.util.List;

import org.maven02.pojo.Dept;
import org.maven02.pojo.Emp;

public interface empService {
	
List<Emp> selectAll(Emp emp);

List<Dept> selectDept();

void deleteEmp(Integer eid);

void indexEmp(Emp emp);

Emp selectId(Integer eid);

void update(Emp emp);







}
