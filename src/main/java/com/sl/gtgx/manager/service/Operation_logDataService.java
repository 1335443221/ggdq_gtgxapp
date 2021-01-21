package com.sl.gtgx.manager.service;


import com.sl.gtgx.manager.entity.Operation_log;

import java.util.Map;

import com.sl.gtgx.common.utils.PageUtil;


public interface Operation_logDataService {
	public PageUtil<Operation_log> findPage(PageUtil<Operation_log> page);
	
	public PageUtil<Operation_log> findPage2(PageUtil<Operation_log> page);
	
	public void insertOperation_log(Map<String,Object> map);
	
}
