package com.hy.ureport.service.impl;

import com.hy.ureport.entity.Test;
import com.hy.ureport.mapper.TestMapper;
import com.hy.ureport.service.TestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 测试用 服务实现类
 * </p>
 *
 * @author jeremy
 * @since 2022-08-14
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements TestService {

}
