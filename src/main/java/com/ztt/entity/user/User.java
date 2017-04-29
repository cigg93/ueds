package com.ztt.entity.user;

import com.ztt.base.entity.ResultInfo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by ztt on 2017/3/18.
 */

@Entity
@Table(name = "user")
public class User extends ResultInfo {
    @Id
    private Integer id;

    @Column
    private String name;

    @Column
    private String password;

    @Column
    private Short type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }
}
