package com.ztt.entity.deansoffice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 级、系部、专业、课程关系表
 *
 * Created by ztt on 2017/2/1.
 */
@Entity
public class DeptMajorCourse {

    // 级id
    @Id
    private String classEntranceId;

    // 系部id
    @Column(nullable = false)
    private String deptId;

    // 专业id
    private String majorId;

    // 课程id
    private String courseId;

    public String getClassEntranceId() {
        return classEntranceId;
    }

    public void setClassEntranceId(String classEntranceId) {
        this.classEntranceId = classEntranceId;
    }

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
}
