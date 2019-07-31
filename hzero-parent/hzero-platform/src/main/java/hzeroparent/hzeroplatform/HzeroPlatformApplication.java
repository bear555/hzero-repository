package hzeroparent.hzeroplatform;

import org.hzero.autoconfigure.platform.EnableHZeroPlatform;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@EnableHZeroPlatform
@SpringBootApplication
public class HzeroPlatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(HzeroPlatformApplication.class, args);
    }

}
