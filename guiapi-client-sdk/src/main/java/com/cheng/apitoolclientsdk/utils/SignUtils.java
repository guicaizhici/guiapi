package com.cheng.apitoolclientsdk.utils;

import cn.hutool.crypto.SecureUtil;

/**
 * 生成签名工具
 */
public class SignUtils {
    /**
     * 生成签名
     * @param body
     * @param secretKey
     * @return
     */
    public static  String getSign(String body, String secretKey){
        //Sm3加密算法
        String content = body + "." +secretKey;
        return SecureUtil.sha1(content);
    }
}
