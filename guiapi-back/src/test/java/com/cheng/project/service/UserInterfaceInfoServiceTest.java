package com.cheng.project.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * 用户接口信息服务测试
 *
 * @@author https://github.com/guicaizhici
 * @from https://github.com/guicaizhici
 */
@SpringBootTest
public class UserInterfaceInfoServiceTest {

    @Resource
    private UserInterfaceInfoService userInterfaceInfoService;

    @Test
    public void invokeCount() {
        boolean b = userInterfaceInfoService.invokeCount(1L, 1L);
        Assertions.assertTrue(b);
    }
}