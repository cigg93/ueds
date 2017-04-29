package com.ztt.entity.deansoffice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 班级代码
 *
 * Created by ztt on 2017/1/31.
 */
@Entity
@Table(name = "class")
public class ClassCode {

    // 班级编号
    @Id
    @Column(length = 4)
    private String id;

    // 班级名称
    @Column(nullable = false)
    private String name;

    // 班级人数
    @Column(nullable = false)
    private Integer studentCount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(Integer studentCount) {
        this.studentCount = studentCount;
    }
}
