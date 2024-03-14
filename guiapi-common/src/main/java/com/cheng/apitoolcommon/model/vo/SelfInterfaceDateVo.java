package com.cheng.apitoolcommon.model.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName SelfInterfaceDateVo
 * @Description TODO
 * @Author lish
 * 
 */
@Data
public class SelfInterfaceDateVo implements Serializable {

    private String interfaceName;

    private int totalNum;

    private int leftNum;
}
