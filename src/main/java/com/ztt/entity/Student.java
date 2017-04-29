package com.ztt.entity;

import com.ztt.base.entity.ResultInfo;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by ztt on 2017/4/24.
 */
@Data
@Entity
public class Student extends ResultInfo {

    @Id
    @Column
    private String id;

    @Column
    private String classId;

    @Column
    private String username;

    @Column
    private String name;

    @Column
    private String password;

    @Column
    private String oldPassword;

    @Column
    private String className;

    @Column
    private String jiguan;

    @Column
    private String birthday;

    @Column
    private String sex;

}
