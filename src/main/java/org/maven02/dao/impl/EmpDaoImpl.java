package org.maven02.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.maven02.dao.EmpDao;
import org.maven02.pojo.Emp;
import org.springframework.stereotype.Repository;

@Repository
public class EmpDaoImpl implements EmpDao{
	
@Resource
	private SessionFactory sf;

	public List<Emp> selectAll() {
		Session session = sf.getCurrentSession();
		SQLQuery sql = session.createSQLQuery(" select * from emp ").addEntity(Emp.class);
		List el = sql.list();
		return el;
	}

	@Override
	public void deleteEmp(Integer eid) {
		Session session = sf.getCurrentSession();
		session.delete(session.get(Emp.class, eid));
		
	}

	@Override
	public void indexEmp(Emp emp) {
		Session session = sf.getCurrentSession();
		session.save(emp);
		
	}

	@Override
	public Emp selectID(Integer eid) {
		Session session = sf.getCurrentSession();
		Emp el = (Emp) session.get(Emp.class, eid);
		return el;
	}

	@Override
	public void update(Emp emp) {
		Session session = sf.getCurrentSession();
		session.update(emp);
	}
	
	
	

}
