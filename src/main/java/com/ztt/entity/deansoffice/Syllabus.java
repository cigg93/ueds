package com.ztt.entity.deansoffice;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 教学大纲
 *
 * Created by ztt on 2017/1/31.
 */
@Entity
public class Syllabus {

    // 系部编号
    @Id
    private String deptId;

    // 专业编号
    private String majorId;

    // 课程编号
    private String courseId;

    // 教师编号
    private String teacherId;

    // 学年
    private Integer term;

    // 学期
    private Integer termTime;

    // 教学大纲内容
    private String outline;

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getMajorId() {
        return majorId;
    }

    public void setMajorId(String majorId) {
        this.majorId = majorId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getTerm() {
        return term;
    }

    public void setTerm(Integer term) {
        this.term = term;
    }

    public Integer getTermTime() {
        return termTime;
    }

    public void setTermTime(Integer termTime) {
        this.termTime = termTime;
    }

    public String getOutline() {
        return outline;
    }

    public void setOutline(String outline) {
        this.outline = outline;
    }
}
