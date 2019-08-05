package org.hzero.todo.app.service.impl;

import org.hzero.boot.imported.infra.constant.HimpBootConstants;
import org.hzero.boot.imported.infra.validator.annotation.ImportValidator;
import org.hzero.boot.imported.infra.validator.annotation.ImportValidators;

import com.baidu.unbiz.fluentvalidator.ValidatorContext;
import com.baidu.unbiz.fluentvalidator.ValidatorHandler;

import java.util.Map;

/**
 * description 将导入的文件进行自定义检验
 *
 * @author shuangfei.zhu@hand-china.com 2019/08/03 14:46
 */
@ImportValidators({
        @ImportValidator(templateCode = "ORA-25815-IMPORT")
})
public class ValidateImpl extends ValidatorHandler<String> {

    @Override
    public boolean validate(ValidatorContext context, String data) {
        System.out.println("数据校验：" + data);
        // do something
        // 获取自定义参数
//        Map args = context.getAttribute(HimpBootConstants.ARGS, Map.class);


        return true;
    }
}
