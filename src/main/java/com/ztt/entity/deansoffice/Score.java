package com.ztt.entity.deansoffice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 学生成绩
 *
 * Created by ztt on 2017/1/31.
 */
@Entity
public class Score {

    // 学年
    @Id
    private String term;

    // 学期类型
    @Column(nullable = false)
    private String termId;

    // 班级编号
    @Column(nullable = false)
    private String classId;

    // 课程编号
    @Column(nullable = false)
    private String courseId;

    // 成绩类型标识id
    @Column(nullable = false)
    private String scoreTypeId;

    // 学号
    @Column(nullable = false)
    private String studentId;

    // 备注
    private String remark;

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getTermId() {
        return termId;
    }

    public void setTermId(String termId) {
        this.termId = termId;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getScoreTypeId() {
        return scoreTypeId;
    }

    public void setScoreTypeId(String scoreTypeId) {
        this.scoreTypeId = scoreTypeId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
