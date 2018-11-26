package com.imooc.serviceImpl;

import com.imooc.mapper.TestMapper;
import com.imooc.pojo.Test;
import com.imooc.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("TestService")
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void save(Test test) {
        testMapper.insert(test);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void update(Test test) {
        testMapper.updateByPrimaryKeySelective(test);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void delete(String id) {
        testMapper.deleteByPrimaryKey(id);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Test queryById(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Test> queryList() {
        return null;
    }
}
