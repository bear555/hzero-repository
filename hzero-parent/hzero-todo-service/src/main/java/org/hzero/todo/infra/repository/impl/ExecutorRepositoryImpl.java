package org.hzero.todo.infra.repository.impl;

import org.hzero.mybatis.base.impl.BaseRepositoryImpl;
import org.hzero.todo.domain.entity.Executor;
import org.hzero.todo.domain.repository.ExecutorRepository;
import org.springframework.stereotype.Component;

/**
 * 资源库实现
 *
 * @author shuangfei.zhu@hand-china.com 2019-01-09 14:45:13
 */
@Component
public class ExecutorRepositoryImpl extends BaseRepositoryImpl<Executor> implements ExecutorRepository {

}
