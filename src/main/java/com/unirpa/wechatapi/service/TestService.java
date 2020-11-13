package com.unirpa.wechatapi.service;

public interface TestService {
    Object getAccessToken();

    Object getJsApiTicket(String accessToken);

    Object getSign(String jsApiTicket, String url);
}
