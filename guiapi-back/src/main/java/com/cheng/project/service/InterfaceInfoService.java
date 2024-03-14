package com.cheng.project.service;

import com.cheng.apitoolcommon.model.entity.InterfaceInfo;

import com.baomidou.mybatisplus.extension.service.IService;
public interface InterfaceInfoService extends IService<InterfaceInfo>{

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
