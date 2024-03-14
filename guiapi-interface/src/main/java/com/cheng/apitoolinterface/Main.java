package com.cheng.apitoolinterface;


import com.cheng.apitoolclientsdk.client.ApiToolClient;
import com.cheng.apitoolclientsdk.model.User;

public class Main {
    public static void main(String[] args) {

        String accessKey = "lsclsc";
        String secretKey = "abcdefgh";

        ApiToolClient apiToolClient = new ApiToolClient(accessKey,secretKey);

        User user = new User();
        user.setUsername("lsclsc");
        String usernameByPost = apiToolClient.getUsernameByPost(user);
        System.out.println(usernameByPost);
    }
}
