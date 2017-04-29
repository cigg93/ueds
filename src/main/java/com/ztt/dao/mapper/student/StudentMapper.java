package com.ztt.dao.mapper.student;

import com.ztt.entity.Student;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by ztt on 2017/4/25.
 */
@Mapper
public interface StudentMapper {
    int modifyPassword(Student student);
}
