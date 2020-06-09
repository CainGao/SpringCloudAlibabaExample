package top.anydata.roducts.web.example.sentinel.flow.control.web.controller;

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
public class SentinelTestController {

    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public String hello(){
        return "CainGao";
    }

}
