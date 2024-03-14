package com.cheng.apitoolcommon.service;


import com.cheng.apitoolcommon.model.entity.User;

/**
 * 内部用户服务
 *
 * @author 雷电影
 * @from
 */
public interface InnerUserService {

    /**
     * 数据库中查是否已分配给用户秘钥（accessKey）
     * @param accessKey
     * @return
     */
    User getInvokeUser(String accessKey);
}
