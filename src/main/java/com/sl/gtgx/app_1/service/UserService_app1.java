package com.sl.gtgx.app_1.service;

import com.sl.gtgx.common.utils.Result1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface UserService_app1 {
    Map<String,Object> getUsersByIds(Map<String, Object> params);
    Map<String,Object> getUsersByIdsElcm(Map<String, Object> params);
    Set<Map<String,Object>> getStorekeepers(Map<String, Object> params);
    Result1 login(Map<String, Object> params);
    Result1 getUserByLogin(Map<String,Object> params);
    Result1 getTip(Map<String, Object> params);
}
