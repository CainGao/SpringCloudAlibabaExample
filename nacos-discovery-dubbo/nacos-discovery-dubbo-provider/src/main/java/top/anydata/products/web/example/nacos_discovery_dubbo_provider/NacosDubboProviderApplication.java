package top.anydata.products.web.example.nacos_discovery_dubbo_provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 功能描述 SpringCloud alibaba -dubbo
 *
 * @author CainGao
 * @version V_1.0
 * @date 2020/5/6 14:05
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosDubboProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosDubboProviderApplication.class,args);
    }

}
