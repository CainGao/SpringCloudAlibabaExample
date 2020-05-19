package top.anydata.products.web.example.nacos_discovery_http_consumer.web.controller;

import top.anydata.products.web.example.nacos_discovery_http_consumer.service.IServerUserServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述 ClientUser
 *
 * @author CainGao
 * @version V_1.0
 * @date 2020/5/3 15:10
 */
@RestController
public class ClientUserController {
    @Autowired
    IServerUserServiceFeign serverUserServiceFeign;

    @RequestMapping(value = "selectOne",method = RequestMethod.GET)
    public String selectOne(String id){

        return serverUserServiceFeign.selectOne(id);
    }

}
