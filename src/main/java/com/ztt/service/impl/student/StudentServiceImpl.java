package com.ztt.service.impl.student;

import com.ztt.dao.jpa.UserDao;
import com.ztt.dao.jpa.student.StudentDao;
import com.ztt.dao.mapper.student.StudentMapper;
import com.ztt.entity.Student;
import com.ztt.entity.user.User;
import com.ztt.service.UserService;
import com.ztt.service.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

/**
 * Created by ztt on 2017/3/19.
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student queryStudent(String userId) throws Exception {
        return studentDao.findById(userId);
    }

    @Override
    public Student modifyPawword(Student student) throws Exception {
        int count = studentMapper.modifyPassword(student);
        if (count == 0) {
            return null;
        }
        return studentDao.findOne(student.getId());
    }

    @Override
    public Page<Student> query(Integer page, Integer size) throws Exception {
        /*按照id升序排序*/
        Page<Student> userPage = studentDao.findAll(new PageRequest(page, size));
        return userPage;
    }


}
