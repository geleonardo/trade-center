package com.lmt.mbsp.trade.adapter.service;

import com.lmt.framework.support.model.message.ResponseMessage;
import com.lmt.mbsp.trade.adapter.config.FeignConfig;
import com.lmt.mbsp.user.pojo.SessionContext;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 管理后台登录信息
 */
@FeignClient(value = "user-center-backend", configuration = FeignConfig.class)
public interface AdminContextClient {
    @RequestMapping(value = "/token/{token}", method = RequestMethod.GET)
    ResponseMessage<SessionContext> getLoginContext(@RequestParam("token") String token);
}
