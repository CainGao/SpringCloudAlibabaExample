package top.anydata.products.web.example.nacos_discovery_dubbo_consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 功能描述 Nacos Dubbo consumer
 *
 * @author CainGao
 * @version V_1.0
 * @date 2020/5/20 20:54
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosDubboConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosDubboConsumerApplication.class,args);
    }

}
