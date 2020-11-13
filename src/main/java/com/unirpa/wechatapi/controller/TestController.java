package com.unirpa.wechatapi.controller;

import com.unirpa.wechatapi.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class TestController {

    private TestService testService;

    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping(value = "/access-token")
    public Object getAccessToken() {
        return testService.getAccessToken();
    }

    @GetMapping(value = "/jsapi-ticket")
    public Object getJsApiTicket(@RequestParam String accessToken) {
        return testService.getJsApiTicket(accessToken);
    }

    @GetMapping(value = "/sign")
    public Object getSign(@RequestParam String jsApiTicket, @RequestParam String url) {
        return testService.getSign(jsApiTicket, url);
    }
}
