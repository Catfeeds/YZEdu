﻿package com.fstech.yzedudbs.dao;
import java.util.List;

import org.apache.ibatis.annotations.Param;
public interface BaseDao<T> {
	
	public int add(T t);
	
	public int delete(T t);
	
	public int update(T t);
	
	public T findOne(T t);
	
	public List<T> findAll();
	
	public List<T> findAllByCondition(T t);
	
	//测试可用
	public List<T> findAllByToGether(T...t);
	
	

}
