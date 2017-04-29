package com.ztt.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by ztt on 2017/4/24.
 */
@Data
@Entity
public class OptionalCourseTimeTable {

    @Id
    @Column
    private int id;

    @Column
    private int teacherId;

    @Column
    private int classroomId;

    @Column
    private String optionalCourseId;

    @Column
    private String timeId;

    @Column
    private int classId;

}
