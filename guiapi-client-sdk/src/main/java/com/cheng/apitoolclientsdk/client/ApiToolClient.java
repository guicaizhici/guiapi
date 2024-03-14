package com.cheng.apitoolclientsdk.client;

import cn.hutool.core.util.RandomUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.cheng.apitoolclientsdk.model.BaiduParams;
import com.cheng.apitoolclientsdk.model.User;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

import static com.cheng.apitoolclientsdk.utils.SignUtils.getSign;

/**
 * 调用第三方接口的客户端
 *
 * @author 雷电影
 */

public class  ApiToolClient {

    private final String accessKey;
    private final String secretKey;

    private static final String GATEWAY_HOST = "http://localhost:8091";

    public ApiToolClient(String accessKey, String secretKey) {
        this.accessKey = accessKey;
        this.secretKey = secretKey;
    }

    public String getNameByGet(String name){

        //可以单独传入http参数，这样参数会自动做URL编码，拼接在URL中
        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("name", name);

        String result = HttpUtil.get(GATEWAY_HOST + "/api/name/", paramMap);
        System.out.println(result);
        return result;
    }

    public String getNameByPost(String name){
        //可以单独传入http参数，这样参数会自动做URL编码，拼接在URL中
        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("name", name);

        String result = HttpUtil.post(GATEWAY_HOST + "/api/name/", paramMap);
        System.out.println(result);
        return result;
    }

    //新增一个map，通过请求头传给后端
    private Map<String,String > getHeadMap(String body){
        Map<String,String> hashMap = new HashMap<>();
        hashMap.put("accessKey",accessKey);
        //一定不能直接发送
//        hashMap.put("secretKey",secretKey);
        hashMap.put("nonce", RandomUtil.randomNumbers(4));
        hashMap.put("body",body);
        hashMap.put("timestamp",String.valueOf(System.currentTimeMillis()/1000));
        hashMap.put("sign",getSign(body,secretKey));
        return hashMap;
    }




    public String getUsernameByPost(User user){

        String json = JSONUtil.toJsonStr(user);
        HttpResponse httpResponse = HttpRequest.post(GATEWAY_HOST + "/api/name/user")
                .addHeaders(getHeadMap(json))
                .body(json)
                .execute();
        System.out.println(httpResponse.getStatus());
        String body = httpResponse.body();
        System.out.println(body);
        return body;
    }

    public String getAvatarUrlByPost(){

        HttpResponse httpResponse = HttpRequest.get(GATEWAY_HOST + "/api/avatar/avatarUrl")
                .addHeaders(getHeadMap(""))
                .execute();
        System.out.println(httpResponse.getStatus());
        String body = httpResponse.body();
        System.out.println(body);
        return body;
    }

    public String onlineInvoke(String parameters,String url) {
        HttpResponse httpResponse = HttpRequest.post(GATEWAY_HOST + url)
                .addHeaders(getHeadMap(parameters))
                .body(parameters)
                .execute();
        System.out.println(httpResponse.getStatus());
        String result = httpResponse.body();
        return result;
    }

    public String getBaiduInfo(BaiduParams baiduParams){
        String parameters = JSONUtil.toJsonStr(baiduParams);
        String result = onlineInvoke(parameters, "/api/baidu/baiduInfo");
        return result;
    }
}
