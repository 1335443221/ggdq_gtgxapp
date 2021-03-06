package com.sl.gtgx.manager.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.sl.gtgx.manager.entity.PatrolInfo;
import org.apache.ibatis.annotations.Mapper;

import com.sl.gtgx.common.utils.PageUtil;

@Mapper
public interface PatrolDao {
	
	public ArrayList<PatrolInfo> getAllPatrol(String rname);
	
	public List<Map<String,Object>> findPage(Map<String,Object> page);

	public List<Map<String,Object>> patrol_type_list(Map<String,Object> page);

	public List<Map<String,Object>> patrol_time_list(Map<String,Object> page);

	public PatrolInfo getPatrolById(Integer id);
	
	public void insertPatrol(PatrolInfo PatrolInfo);
	
	public void deletePatrolById(Integer id);
	
	public void deletePatrolByPId(Integer id);
	
	public void updatePatrolById(PatrolInfo PatrolInfo);
	

	
}
