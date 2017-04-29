package com.ztt.entity.deansoffice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 级代码
 *
 * Created by ztt on 2017/2/1.
 */
@Entity
@Table(name = "class_entrance")
public class ClassEntranceCode {

    // 级编号
    @Id
    private String id;

    // 级名称
    @Column(nullable = false)
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
