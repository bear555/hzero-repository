package org.hzero.todo.infra.feign.fallback;

import org.hzero.todo.api.dto.FileDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

@Component
public class UploadFeignClientFallback {

    @PostMapping(value = "/v1/{organizationId}/files/multipart",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<String> uplaodFile(FileDTO fileDTO) {
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
