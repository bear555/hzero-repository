package hzeroparent.hzeroregister;

import org.hzero.autoconfigure.register.EnableHZeroRegister;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@EnableHZeroRegister
public class HzeroRegisterApplication {

    public static void main(String[] args) {
        SpringApplication.run(HzeroRegisterApplication.class, args);
    }

}
