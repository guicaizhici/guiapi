package com.cheng.project.model.dto.interfaceInfo;

import lombok.Data;

import java.io.Serializable;

/**
 * 接口调用请求
 *
 * @@author https://github.com/guicaizhici
 * @from https://github.com/guicaizhici
 */
@Data
public class InterfaceInfoInvokeRequest implements Serializable {

    /**
     * 主键
     */
    private Long id;

    /**
     * 用户请求参数
     */
    private String userRequestParams;

    private static final long serialVersionUID = 1L;
}