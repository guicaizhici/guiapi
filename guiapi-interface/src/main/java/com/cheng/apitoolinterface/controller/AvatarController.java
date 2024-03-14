package com.cheng.apitoolinterface.controller;

import com.cheng.apitoolclientsdk.model.AvatarParams;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @ClassName AvatarController
 * @Description TODO
 * @Author 雷电影
 */
@RestController
@RequestMapping("/avatar")
public class AvatarController {


    @GetMapping("/avatarUrl")
    public String getAvatarUrlByPost( HttpServletRequest request) throws Exception {
        //https://restapi.amap.com/v3/weather/weatherInfo?
        String avatarUrl = "https://www.loliapi.com/acg/pp/";
//        HashMap<String, Object> paramMap = new HashMap<>();
//        paramMap.put("type", "json");
//        paramMap.put("tx", "b1");
//        paramMap.put("key", "2yta7ZzxPfP6YqZZLzQi413D3B");
//        HttpRequest get = HttpUtil.createGet(avatarUrl, true);
        String redirectUrl = getRedirectUrl(avatarUrl);
        return redirectUrl;
    }


    /**
     * 获取重定向地址
     * @param path
     * @return
     * @throws Exception
     */
    private String getRedirectUrl(String path) throws Exception {
        HttpURLConnection conn = (HttpURLConnection) new URL(path)
                .openConnection();
        conn.setInstanceFollowRedirects(false);
        conn.setConnectTimeout(5000);
        String location = conn.getHeaderField("Location");
        return location;
    }

}
