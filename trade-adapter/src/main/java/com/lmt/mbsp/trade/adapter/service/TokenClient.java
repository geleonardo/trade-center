package com.lmt.mbsp.trade.adapter.service;

import com.lmt.mbsp.trade.adapter.config.FeignConfig;
import com.lmt.mbsp.user.pojo.SessionContext;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/*
 * 描述：登录信息
 * 作者：Tangsm
 * 创建时间：2018-08-28 16:35:40
 */
@FeignClient(value = "user-center-front", configuration = FeignConfig.class)
public interface TokenClient {
    @RequestMapping(value = "/token", method = RequestMethod.GET)
    SessionContext getToken(@RequestHeader("Token") String token);

    @RequestMapping(value = "/token/verify", method = RequestMethod.POST)
    boolean verify(@RequestHeader("Token") String Token, @RequestParam("token") String token);
}
