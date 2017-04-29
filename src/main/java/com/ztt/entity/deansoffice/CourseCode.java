package com.ztt.entity.deansoffice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 课程代码
 *
 * Created by ztt on 2017/1/31.
 */
@Entity
@Table(name = "course")
public class CourseCode {

    // 课程编号
    @Id
    @Column(length = 8)
    private String id;

    // 课程名称
    @Column(length = 16, nullable = false)
    private String name;

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
}
