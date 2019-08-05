package org.hzero.todo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.Tag;
import springfox.documentation.spring.web.plugins.Docket;
/**
 * Swagger Api 描述配置
 */
@Configuration
public class SwaggerApiConfig {
    public static final String USER = "User";
    public static final String TASK = "Task";
    public static final String FILES_SERVICE="FileService";
    public static final String DEMO="Demo";


    @Autowired
    public SwaggerApiConfig(Docket docket) {
        docket.tags(
                new Tag(USER, "用户信息"),
                new Tag(TASK, "任务信息"),
//                new Tag(CODERULE,"编码规则信息"),
                new Tag(FILES_SERVICE, "文件信息"),
                new Tag(DEMO, "组件测试")
        );
    }
}
