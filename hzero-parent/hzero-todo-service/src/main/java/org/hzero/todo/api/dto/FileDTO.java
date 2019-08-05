package org.hzero.todo.api.dto;


import lombok.*;
import org.springframework.web.multipart.MultipartFile;


/**
 * @description:  封装文件的dto
 * @return
 * @author weixiong.chen01@hand-china.com
 * @creed: Talk is cheap,show me the code
 * @date 2019/8/3 16:15
 */
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class FileDTO {

    private Long organizationId;

    private String bucketName;

    private String directory;

    private MultipartFile multipartFile;

    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public MultipartFile getMultipartFile() {
        return multipartFile;
    }

    public void setMultipartFile(MultipartFile multipartFile) {
        this.multipartFile = multipartFile;
    }
}
