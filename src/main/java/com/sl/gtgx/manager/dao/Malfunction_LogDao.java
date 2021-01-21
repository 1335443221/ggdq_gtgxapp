package com.sl.gtgx.manager.dao;

import java.util.ArrayList;
import java.util.List;

import com.sl.gtgx.manager.entity.MalfunctionLogInfo;
import org.apache.ibatis.annotations.Mapper;

import com.sl.gtgx.common.utils.PageUtil;

@Mapper
public interface Malfunction_LogDao {
	
	public ArrayList<MalfunctionLogInfo> getAllMalfunction_Log(String rname);
	
	public List<MalfunctionLogInfo> findPage(PageUtil<MalfunctionLogInfo> page);
	
	public MalfunctionLogInfo getMalfunction_LogById(Integer id);
	
	public void insertMalfunction_Log(MalfunctionLogInfo MalfunctionLogInfo);
	
	public void deleteMalfunction_LogById(Integer id);
	
	public void updateMalfunction_LogById(MalfunctionLogInfo MalfunctionLogInfo);
	

	
}
