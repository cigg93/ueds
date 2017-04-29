package com.ztt.dao.jpa.student;

import com.ztt.entity.Student;
import com.ztt.entity.user.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ztt on 2017/3/19.
 */
@Repository
public interface StudentDao extends CrudRepository<Student, String>{

    Page<Student> findAll(Pageable pageable);

    Student findById(String id);
}
