package com.sl.gtgx.manager.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.sl.gtgx.manager.entity.PatrolPointInfo;
import org.apache.ibatis.annotations.Mapper;
import com.sl.gtgx.common.utils.PageUtil;

@Mapper
public interface Patrol_PointDao {
	
	public ArrayList<PatrolPointInfo> getAllPatrol_Point(String ppname);
	
	public List<PatrolPointInfo> findPage(PageUtil<PatrolPointInfo> page);
	
	public PatrolPointInfo getPatrol_PointById(Integer id);
	
	public int insertPatrol_Point(Map<String, Object> map);
	
	public void deletePatrol_PointById(Integer id);
	
	public int updatePatrol_PointById(Map<String, Object> map);
	
}
