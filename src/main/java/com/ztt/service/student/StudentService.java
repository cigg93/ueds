package com.ztt.service.student;

import com.ztt.entity.Student;
import org.springframework.data.domain.Page;

/**
 * Created by ztt on 2017/3/19.
 */
public interface StudentService {

    Student queryStudent(String userId) throws Exception;

    Student modifyPawword(Student student) throws Exception;

    Page<Student> query(Integer page, Integer size) throws Exception;

}
