package org.hzero.todo.app.service.impl;

import java.io.IOException;
import java.util.Map;

import org.hzero.boot.imported.app.service.IDoImportService;
import org.hzero.boot.imported.infra.validator.annotation.ImportService;
import org.hzero.todo.domain.entity.User;
import org.hzero.todo.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * description 导入逻辑
 *
 * @author shuangfei.zhu@hand-china.com 2019/07/21 14:45
 */
@ImportService(templateCode = "ORA-25815-IMPORT")
public class ImportServiceImpl implements IDoImportService {

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private UserRepository userRepository;

    @Override
    public Boolean doImport(String data) {
        //        获取自定义参数
//        Map<String,Object> map = getArgs();
        User user=null;
        try {
            user = objectMapper.readValue(data, User.class);
        } catch (IOException e) {
            // 失败
            return false;
        }
        userRepository.insertSelective(user);
        // 成功
        return true;
    }
}
