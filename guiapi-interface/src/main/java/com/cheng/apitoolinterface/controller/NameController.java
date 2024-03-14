package com.cheng.apitoolinterface.controller;

import com.cheng.apitoolclientsdk.model.User;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletRequest;

/**
 * 名称api
 *
 * @author 雷电影
 */
@RestController
@RequestMapping("/name")
public class NameController {

    @PostMapping("/user")
    public String getUsernameByPost(@RequestBody User user, HttpServletRequest request){
//        String accessKey = request.getHeader("accessKey");
//        String nonce = request.getHeader("nonce");
//        String timestamp = request.getHeader("timestamp");
//        String sign = request.getHeader("sign");
//        String body = request.getHeader("body");
//
//        // todo 实际情况是去数据库查是否已分配的用户，这里直接模拟数据
//        if (!accessKey.equals("lsclsc")){
//            throw new RuntimeException("无权限");
//        }
//        // todo 校验随机数 检验当前时间不超过5分钟
//
//        // todo 实际情况的secretKey是查数据库查出来的
//        String serverSign = SignUtils.getSign(body, "abcdefgh");
//        if (!serverSign.equals(sign)){
//            throw new RuntimeException("无权限");
//        }
        return "{\"username\": \"" + user.getUsername() + "\"}";
    }

}
