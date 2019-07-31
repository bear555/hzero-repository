package org.hzero.todo;

import io.choerodon.core.iam.ResourceLevel;
import io.choerodon.resource.annoation.EnableChoerodonResourceServer;
import io.choerodon.swagger.annotation.Permission;
import io.swagger.annotations.ApiOperation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient// 是否允许注册到注册中心，暂时注释掉
@RestController
@EnableChoerodonResourceServer// 是否开启猪齿鱼资源服务器，暂时注释掉，该注解开启了 Jwt_Token 的校验，本地测试不需要。
public class HzeroTodoServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HzeroTodoServiceApplication.class, args);
    }

    @GetMapping
    @Permission(level = ResourceLevel.SITE, permissionPublic = true)
    @ApiOperation(value = "demo")
    public ResponseEntity<String> hello() {
        return new ResponseEntity<String>("hello world", HttpStatus.OK);
    }

}
