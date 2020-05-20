package top.anydata.products.web.example.nacos_discovery_dubbo_provider.service;

import org.apache.dubbo.config.annotation.Service;
import top.anydata.products.web.example.nacos_discovery_dubbo_api.IHelloService;

/**
 * 功能描述 Dubbo服务提供方
 *
 * @author CainGao
 * @version V_1.0
 * @date 2020/5/6 13:51
 */
@Service
public class HelloServiceImpl implements IHelloService {

    @Override
    public String hello(String name) {
        return "Hello:"+name;
    }

}
