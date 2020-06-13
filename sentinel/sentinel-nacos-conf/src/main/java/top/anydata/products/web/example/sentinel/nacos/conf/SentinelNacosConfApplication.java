package top.anydata.products.web.example.sentinel.nacos.conf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description: 利用Nacos配置Sentinel 规则
 * @author: caingao
 * @date: 2020/6/10 10:37 上午
 * @version: V1.0
 */
@SpringBootApplication
public class SentinelNacosConfApplication {

    public static void main(String[] args) {
        SpringApplication.run(SentinelNacosConfApplication.class,args);
    }

}
