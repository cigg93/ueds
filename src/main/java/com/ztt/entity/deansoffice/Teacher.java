package com.ztt.entity.deansoffice;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * 教师信息
 *
 * Created by ztt on 2017/2/1.
 */
@Entity
public class Teacher {

    // 编号
    @Id
    private String id;

    // 姓名
    private String name;

    // 性别
    private Date birthday;

    // 籍贯
    private String nativePlace;

    // 民族
    private String nation;

    // 党派
    private String party;

    // 学历
    private String education;

    // 职称
    private String professionalTitle;

    // 教龄
    private String teachingYears;

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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getProfessionalTitle() {
        return professionalTitle;
    }

    public void setProfessionalTitle(String professionalTitle) {
        this.professionalTitle = professionalTitle;
    }

    public String getTeachingYears() {
        return teachingYears;
    }

    public void setTeachingYears(String teachingYears) {
        this.teachingYears = teachingYears;
    }
}
