package com.sl.gtgx.manager.service;

import java.util.ArrayList;
import java.util.Map;

import com.sl.gtgx.manager.entity.PatrolInfo;
import com.sl.gtgx.common.utils.PageUtil;

import javax.servlet.http.HttpSession;


public interface PatrolDataService {
	public ArrayList<PatrolInfo> getAllPatrol(String rname);
	
	public PageUtil<Map<String,Object>> findPage(Map<String,Object> map, HttpSession session);
	
	public PatrolInfo getPatrolById(Integer id);
	
	public void deletePatrolById(Integer id);
	
	public void insertPatrol(PatrolInfo PatrolInfo);
	
	public void updatePatrolById(PatrolInfo PatrolInfo);
	
}
