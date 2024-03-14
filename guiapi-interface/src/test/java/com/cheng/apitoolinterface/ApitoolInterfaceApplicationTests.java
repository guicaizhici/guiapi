package com.cheng.apitoolinterface;


import com.cheng.apitoolclientsdk.client.ApiToolClient;
import com.cheng.apitoolclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class ApitoolInterfaceApplicationTests {

    @Resource
    private ApiToolClient apiToolClient;

    @Test
    void contextLoads() {

        String lsclsc = apiToolClient.getNameByGet("lsclsc");


        User user = new User();
        user.setUsername("lsclsc11");
        String usernameByPost = apiToolClient.getUsernameByPost(user);


        System.out.println(lsclsc);
        System.out.println(usernameByPost);
    }

}
