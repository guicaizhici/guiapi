package com.cheng.project.service;

import com.cheng.apitoolcommon.model.entity.UserInterfaceInfo;
import com.baomidou.mybatisplus.extension.service.IService;
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo>{

    void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add);

    /**
     * 调用接口统计
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);
}
