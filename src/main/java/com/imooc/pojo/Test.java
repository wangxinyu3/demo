package com.imooc.pojo;

import javax.persistence.*;

public class Test {
    private Integer id;

    private String name;

    private String dept;

    private Long salary;

    private String edlevel;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return dept
     */
    public String getDept() {
        return dept;
    }

    /**
     * @param dept
     */
    public void setDept(String dept) {
        this.dept = dept;
    }

    /**
     * @return salary
     */
    public Long getSalary() {
        return salary;
    }

    /**
     * @param salary
     */
    public void setSalary(Long salary) {
        this.salary = salary;
    }

    /**
     * @return edlevel
     */
    public String getEdlevel() {
        return edlevel;
    }

    /**
     * @param edlevel
     */
    public void setEdlevel(String edlevel) {
        this.edlevel = edlevel;
    }
}