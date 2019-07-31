package hzeroparent.hzeroiam;

import org.hzero.autoconfigure.iam.EnableHZeroIam;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableHZeroIam
public class HzeroIamApplication {

    public static void main(String[] args) {
        SpringApplication.run(HzeroIamApplication.class, args);
    }

}
