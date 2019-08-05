package org.hzero.todo.infra.feign;


import feign.Headers;
import org.hzero.todo.api.dto.FileDTO;
import org.hzero.todo.infra.feign.fallback.UploadFeignClientFallback;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "hzero-file",fallback = UploadFeignClientFallback.class)
public interface UploadFileClient {

    /**
     * @description: 根据租户id，进行文件上传
     * @author weixiong.chen01@hand-china.com
     * @creed: Talk is cheap,show me the code
     * @date 2019/8/3 16:09
     */
    @PostMapping(value = "/v1/{organizationId}/files/multipart",
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE,
            consumes = "application/json")
    @Headers({"Content-Type:multipart/form-data","Accept:text/plain"})
    String uplaodFile(@RequestBody FileDTO fileDTO);



}
