package top.anydata.products.web.ali_sp_example.nacos_config.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述 配置测试
 *
 * @author CainGao
 * @version V_1.0
 * @date 2020/5/6 18:48
 */
@RefreshScope
@RestController
@RequestMapping("/config")
public class ConfigController {
    @Value("${useLocalCache:false}")
    private boolean useLocalCache;

    @Value("${name}")
    private String name;

    @RequestMapping("/get")
    public boolean get() {
        return useLocalCache;
    }

    @RequestMapping("/name")
    public String name(){
        return name;
    }
}
