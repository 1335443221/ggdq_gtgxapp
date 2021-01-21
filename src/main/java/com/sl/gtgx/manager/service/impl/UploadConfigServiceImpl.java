package com.sl.gtgx.manager.service.impl;

import com.sl.gtgx.common.config.UrlConfig;
import com.sl.gtgx.common.utils.Jipush;
import com.sl.gtgx.common.utils.UploadConfigUtil;
import com.sl.gtgx.manager.dao.UploadConfigDao;
import com.sl.gtgx.manager.service.UploadConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UploadConfigServiceImpl implements UploadConfigService {

    @Autowired
    private UploadConfigDao uploadConfigDao;
    @Autowired
    private UrlConfig urlConfig;

    //获取当前设置的文件上传方式
    @Override
    public Map<String, Object> getActiveUploadConfig() {
        return uploadConfigDao.getActiveUploadConfig();
    }

    //修改文件上传方式
    @Transactional
    @Override
    public int updateUploadConfig(Integer active_id) {
        //更新内存中的文件上传配置
        UploadConfigUtil.setActiveId(active_id);
        //极光推送
        List<String> tagList = new ArrayList<>();
        Map<String,String> extras = new HashMap<>();
        extras.put("type","uploadConfig");
        extras.put("activeId",String.valueOf(active_id));
        extras.put("qiniuUrl", UrlConfig.QiniuUrl);
        tagList.add(urlConfig.ENV_TEST);
        Jipush.sendToTagListMessage(tagList,"文件上传配置已修改！","",extras,"");
        return uploadConfigDao.updateUploadConfig(active_id);
    }
}
