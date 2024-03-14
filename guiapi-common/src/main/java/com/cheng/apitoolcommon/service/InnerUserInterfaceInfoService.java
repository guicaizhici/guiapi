package com.cheng.apitoolcommon.service;

/**
 * 内部用户接口信息服务
 *
 * @author 雷电影
 * @from
 */
public interface InnerUserInterfaceInfoService {

    /**
     * 调用接口统计
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);
}
