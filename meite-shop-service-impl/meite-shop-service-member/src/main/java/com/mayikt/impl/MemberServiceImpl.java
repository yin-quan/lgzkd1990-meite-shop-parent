package com.mayikt.impl;

import com.mayikt.AppEntity;
import com.mayikt.MemberService;
import com.mayikt.feign.WeiXinAppServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberServiceImpl implements MemberService {
    @Autowired
    private WeiXinAppServiceFeign weiXinAppServiceFeign;

    public AppEntity memberInvokeWeixin() {
        return weiXinAppServiceFeign.getApp();
    }

}