package com.sl.gtgx.manager.service;

import java.util.ArrayList;
import java.util.Map;

import com.sl.gtgx.manager.entity.TipInfo;
import com.sl.gtgx.common.utils.PageUtil;


public interface TipDataService {
	public ArrayList<TipInfo> getAllTip(String Stg);
	
	public PageUtil<TipInfo> findPage(PageUtil<TipInfo> page);
	
	public TipInfo getTipById(Integer id);
	
	public void deleteTipById(Integer id);
	
	public int insertTip(String json);
	
	public int updateTipById(String json);
	public int getMaxIdTip();
	
}
