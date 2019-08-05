package org.hzero.todo.app.service.impl;

import org.hzero.boot.scheduler.infra.annotation.JobHandler;
import org.hzero.boot.scheduler.infra.enums.ReturnT;
import org.hzero.boot.scheduler.infra.handler.IJobHandler;
import org.hzero.boot.scheduler.infra.tool.SchedulerTool;

import java.util.Map;

/*
* 调度服务
* */
@JobHandler("DEMO-ORA-25815")
public class JobServiceImpl implements IJobHandler {

    /**
     *  将调度任务执行的内容写进方法内。
     * */
    @Override
    public ReturnT execute(Map<String, String> map, SchedulerTool schedulerTool) {
        String name=map.get("name");
        System.out.println("hello :"+name);
        return ReturnT.SUCCESS;
    }
}
