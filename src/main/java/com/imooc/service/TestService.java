package com.imooc.service;

import com.imooc.pojo.Test;

import java.util.List;

public interface TestService {
    public void save(Test test);

    public void update(Test test);

    public void delete(String id);

    public Test queryById(String id);

    public List<Test> queryList();
}
