package top.anydata.products.web.example.nacos_discovery_http_provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 功能描述 NacosHttpServer
 *
 * @author CainGao
 * @version V_1.0
 * @date 2020/5/3 14:45
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosHttpProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosHttpProviderApplication.class, args);
    }

}
