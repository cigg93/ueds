package com.ztt.entity.deansoffice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 系、部代码
 *
 * Created by ztt on 2017/1/31.
 */
@Entity
@Table(name = "department")
public class DepartmentCode {
    @Id
    @Column(length = 3)
    private String id;

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
