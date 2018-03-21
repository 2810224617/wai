package org.maven02.dao;

import java.util.List;

public interface BaseDao<T> {
	
	List<T> selectAll(String hql);
	
	void delete(T t);
	
	void addOne(T t);
	
	void update(T t);

	//条件查询
	List<T> selsctAllBySql(String sql,T t);
}
