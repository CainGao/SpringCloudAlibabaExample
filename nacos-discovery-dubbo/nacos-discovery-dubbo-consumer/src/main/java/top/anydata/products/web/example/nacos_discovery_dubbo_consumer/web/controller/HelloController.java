package top.anydata.products.web.example.nacos_discovery_dubbo_consumer.web.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.anydata.products.web.example.nacos_discovery_dubbo_api.IHelloService;

/**
 * 功能描述 Hello Controller
 *
 * @author CainGao
 * @version V_1.0
 * @date 2020/5/20 20:56
 */
@RestController
public class HelloController {

    @Reference
    IHelloService helloService;

    @RequestMapping(value = "hello")
    public String hello(String name){
        return helloService.hello(name);
    }

}
