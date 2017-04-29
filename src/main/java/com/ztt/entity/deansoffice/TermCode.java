package com.ztt.entity.deansoffice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 学期代码
 *
 * Created by ztt on 2017/1/31.
 */
@Entity
@Table(name = "term")
public class TermCode {

    // 学期类型
    @Id
    private String id;

    // 学期名称
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
