package com.sl.gtgx.manager.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.sl.gtgx.manager.entity.PatrolInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.sl.gtgx.manager.dao.PatrolDao;
import com.sl.gtgx.manager.service.PatrolDataService;
import com.sl.gtgx.common.utils.PageUtil;

import javax.servlet.http.HttpSession;


@Service("PatrolDataImpl")
public class PatrolDataServiceImpl implements PatrolDataService {


	@Autowired
	private PatrolDao PatrolDao;

	@Override
	public ArrayList<PatrolInfo> getAllPatrol(String rname) {
		// TODO Auto-generated method stub
		return PatrolDao.getAllPatrol(rname);
	}

	public void deletePatrolById(Integer id) {
		// TODO Auto-generated method stub
		PatrolDao.deletePatrolById(id);
		
	}

	@Override
	public void insertPatrol(PatrolInfo PatrolInfo) {
		// TODO Auto-generated method stub
		PatrolDao.insertPatrol(PatrolInfo);
		
	}

	@Override
	public void updatePatrolById(PatrolInfo PatrolInfo) {
		// TODO Auto-generated method stub
		PatrolDao.updatePatrolById(PatrolInfo);
		
	}

	@Override
	public PatrolInfo getPatrolById(Integer id) {
		// TODO Auto-generated method stub
		return PatrolDao.getPatrolById(id);
	}

	@Override
	public PageUtil<Map<String,Object>> findPage(Map<String,Object> map, HttpSession session) {
		PageUtil<Map<String, Object>> pageInfo=new PageUtil<Map<String, Object>>();
		int pageindex =Integer.parseInt(String.valueOf(map.get("pageindex")));  //页码
		PageHelper.startPage(pageindex,pageInfo.getPagesize());  //分页
		List<Map<String,Object>> list=PatrolDao.findPage(map);  //分页后的数据

		List<Map<String,Object>> type_data=PatrolDao.patrol_type_list(map);  //type数据

		List<Map<String,Object>> time_data=PatrolDao.patrol_time_list(map);  //type数据

		Map<String,Object> smap= JSONObject.parseObject(String.valueOf(session.getAttribute("activeAdmin")));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");   //把时间转换成年月日
		long create_at=0;
		for(int i=0;i<list.size();i++){
		create_at=Long.parseLong(String.valueOf(list.get(i).get("create_at")))*1000;
		list.get(i).put("create_at",sdf.format(create_at));
		}

		map.put("time_data", time_data);
		map.put("type_data", type_data);
		pageInfo.setData(list);  //把数据存到page中

		pageInfo.setRecordCount(PatrolDao.findPage(map).size());  //总记录数
		pageInfo.setPageindex(pageindex);  //返回当前页
		map.put("lastpage", pageInfo.getLastPage());  //上一页
		map.put("nextpage", pageInfo.getNextpage(pageInfo.getTotalPagecount()));  //下一页
		pageInfo.setParams(map);  //返回模糊查询信息
		return pageInfo;
	}
	

}
