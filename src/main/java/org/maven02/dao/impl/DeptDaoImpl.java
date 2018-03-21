package org.maven02.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.maven02.dao.DeptDao;
import org.maven02.pojo.Dept;
import org.springframework.stereotype.Repository;

@Repository
public class DeptDaoImpl implements DeptDao{

	@Resource
	private SessionFactory sf;
	
	public List<Dept> selectDept() {
		Session session = sf.getCurrentSession();
		SQLQuery sql = session.createSQLQuery(" select * from dept").addEntity(Dept.class);
		List dl = sql.list();
		return dl;
	}

}
