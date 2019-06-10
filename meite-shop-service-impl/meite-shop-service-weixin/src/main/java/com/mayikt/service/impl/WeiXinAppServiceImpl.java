package  com.mayikt.service.impl;

import com.mayikt.AppEntity;
import com.mayikt.WeiXinAppService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeiXinAppServiceImpl implements WeiXinAppService {

    @Value("${mayikt.weixin.name}")
    private String name;
    public AppEntity getApp() {
        return new AppEntity("644064779", name);
    }

}