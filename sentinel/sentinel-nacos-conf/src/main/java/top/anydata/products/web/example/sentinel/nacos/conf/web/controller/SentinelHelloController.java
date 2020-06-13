package top.anydata.products.web.example.sentinel.nacos.conf.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: caingao
 * @date: 2020/6/9 5:57 下午
 * @version: V1.0
 */
@RestController
@RequestMapping(value = "sentinel")
public class SentinelHelloController {
    private Logger LOG = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public String hello(){
        return "CainGao";
    }

}
