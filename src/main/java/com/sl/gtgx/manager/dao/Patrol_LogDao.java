package com.sl.gtgx.manager.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sl.gtgx.manager.entity.Patrol_Log;
import com.sl.gtgx.common.utils.PageUtil;

@Mapper
public interface Patrol_LogDao {
	
	public ArrayList<Patrol_Log> getAllPatrol_Log(String Stg);
	
	public List<Patrol_Log> findPage(PageUtil<Patrol_Log> page);
	
	public Patrol_Log getPatrol_LogById(Integer id);
	
	public void insertPatrol_Log(Patrol_Log Patrol_Log);
	
	public void deletePatrol_LogById(Integer id);
	
	public void updatePatrol_LogById(Patrol_Log Patrol_Log);
	
}
