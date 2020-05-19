package top.anydata.products.web.example.nacos_discovery_http_provider.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述 用户查询接口
 *
 * @author CainGao
 * @version V_1.0
 * @date 2020/5/3 14:52
 */
@RestController
public class UserController {

    @RequestMapping(value = "selectOne",method = RequestMethod.GET)
    public String selectOne(@RequestParam String id){
        return "Hello:"+id;
    }

}
