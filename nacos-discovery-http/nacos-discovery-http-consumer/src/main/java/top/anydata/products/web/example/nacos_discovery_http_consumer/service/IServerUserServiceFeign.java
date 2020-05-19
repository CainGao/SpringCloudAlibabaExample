package top.anydata.products.web.example.nacos_discovery_http_consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 功能描述 TODO
 *
 * @author CainGao
 * @version V_1.0
 * @date 2020/5/3 15:12
 */
@FeignClient(value = "nacos-discovery-http-provider")
public interface IServerUserServiceFeign {

    @RequestMapping(value = "selectOne",method = RequestMethod.GET)
    String selectOne(@RequestParam("id")String id);

}
