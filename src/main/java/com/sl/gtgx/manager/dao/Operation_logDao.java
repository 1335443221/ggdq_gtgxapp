package com.sl.gtgx.manager.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.sl.gtgx.manager.entity.Operation_log;
import com.sl.gtgx.common.utils.PageUtil;

@Mapper
public interface Operation_logDao {
	
	
	public List<Operation_log> findPage(PageUtil<Operation_log> page);
	
	
	public List<Operation_log> findPage2(PageUtil<Operation_log> page);
	
	public void insertOperation_log(Map<String,Object> map);
	
	

	
}
