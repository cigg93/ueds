package com.ztt.entity.deansoffice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 专业代码
 *
 * Created by ztt on 2017/2/1.
 */
@Entity
@Table(name = "major")
public class MajorCode {

    // 专业编号
    @Id
    private String id;

    // 专业名称
    @Column(nullable = false)
    private String name;

    // 批准文号
    @Column
    private String registration;

    // 开设时间
    @Column
    private Date establishingTime;

    // 专业介绍
    private String introduction;

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

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public Date getEstablishingTime() {
        return establishingTime;
    }

    public void setEstablishingTime(Date establishingTime) {
        this.establishingTime = establishingTime;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
}
