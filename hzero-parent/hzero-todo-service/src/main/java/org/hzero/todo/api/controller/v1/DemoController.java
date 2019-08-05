package org.hzero.todo.api.controller.v1;

import io.choerodon.core.iam.ResourceLevel;
import io.choerodon.swagger.annotation.Permission;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Authorization;
import org.hzero.boot.file.FileClient;
import org.hzero.boot.message.MessageClient;
import org.hzero.boot.message.entity.Receiver;
import org.hzero.core.base.BaseController;
import org.hzero.core.util.Results;
import org.hzero.todo.config.SwaggerApiConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 测试接口
 */
@Api(tags = SwaggerApiConfig.DEMO)
@RestController("demoController.v1")
@RequestMapping("/v1/{organizationId}/demo")
@SuppressWarnings("all")
public class DemoController extends BaseController {

    @Autowired
    private MessageClient messageClient;

    @Autowired
    private FileClient fileClient;

    @ApiOperation("站内消息发送")
    @Permission(permissionPublic = true)
    @GetMapping("/send-web")
    public ResponseEntity sendWeb() {
        Long tenantId = 0L;
        String messageTemplateCode = "ORA-25815";
        String lang = "zh_CN";
        Receiver receiver = new Receiver().setUserId(226L).setTargetUserTenantId(0L);
        List<Receiver> receiverList = new ArrayList<>();
        receiverList.add(receiver);
        Map<String, String> args = new HashMap<>(4);
        args.put("user", "ORA-25815");
        messageClient.sendWebMessage(tenantId, messageTemplateCode, lang, receiverList, args);
        return Results.success();
    }


    @Permission(level = ResourceLevel.ORGANIZATION)
    @ApiOperation(value = "文件客户端测试接口")
    @PostMapping
    public ResponseEntity<String> uploadFile(
            @ApiParam(value="租户ID",required = true)@PathVariable Long organizationId,
            @ApiParam(value = "bucketName", required = true) @RequestParam("bucketName") String bucketName,
            @ApiParam(value = "上传目录") @RequestParam(value = "directory", required = false) String directory,
            @ApiParam(value = "上传文件") @RequestParam("file") MultipartFile multipartFile){
        return Results.success(fileClient.uploadFile(organizationId,bucketName,directory,multipartFile));
    }


    @ApiOperation("邮件发送")
    @Permission(permissionPublic = true)
    @GetMapping("/send-email")
    public ResponseEntity sendEmail(){
        Long tenantId=0L;
        String serverCode="HZERO";
        String messageTemplateCode="ORA-25815";
        Receiver receiver=new Receiver().setEmail("13060561567@163.com");
        List<Receiver> receivers=new ArrayList<>();
        receivers.add(receiver);
        Map<String,String> args=new HashMap<>();
        args.put("name","ora-25815");
        messageClient.sendEmail(tenantId,serverCode,messageTemplateCode,receivers,args);
        return Results.success();
    }


}
