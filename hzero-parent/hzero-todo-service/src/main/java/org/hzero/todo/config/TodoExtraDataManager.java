package org.hzero.todo.config;

import io.choerodon.core.swagger.ChoerodonRouteData;
import io.choerodon.swagger.annotation.ChoerodonExtraData;
import io.choerodon.swagger.swagger.extra.ExtraData;
import io.choerodon.swagger.swagger.extra.ExtraDataManager;

/**
 * 服务路由配置
 */
@ChoerodonExtraData
public class TodoExtraDataManager implements ExtraDataManager {

    /**
     * @Description
     * @Author  ChenWeixong
     * @Date   2019/7/31 15:15
     * @Param
     * @Return
     * @Exception
     * */
    @Override
    public ExtraData getData() {
        ChoerodonRouteData choerodonRouteData = new ChoerodonRouteData();
        choerodonRouteData.setName("todo25815");
        choerodonRouteData.setPath("/todo25815/**");
        choerodonRouteData.setServiceId("hzero-todo-service");
        extraData.put(ExtraData.ZUUL_ROUTE_DATA, choerodonRouteData);
        return extraData;
    }
}
