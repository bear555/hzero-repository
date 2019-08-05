package org.hzero.todo;

import io.choerodon.core.iam.ResourceLevel;
import io.choerodon.resource.annoation.EnableChoerodonResourceServer;
import io.choerodon.swagger.annotation.Permission;
import io.swagger.annotations.ApiOperation;
import org.hzero.core.jackson.annotation.EnableObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@ComponentScan(value = {
        "org.hzero.todo.api",
        "org.hzero.todo.app",
        "org.hzero.todo.config",
        "org.hzero.todo.domain",
        "org.hzero.todo.infra",
})
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@EnableObjectMapper
@SpringBootApplication
@EnableDiscoveryClient// 是否允许注册到注册中心，暂时注释掉
@RestController
@EnableFeignClients
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
