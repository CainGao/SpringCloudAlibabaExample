package top.anydata.products.web.example.nacos_discovery_http_consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 功能描述 NacosHttpClient
 *
 * @author CainGao
 * @version V_1.0
 * @date 2020/5/3 14:54
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("top.anydata.products.web.example.nacos_discovery_http_consumer.service")
public class NacosHttpConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosHttpConsumerApplication.class,args);
    }
}
