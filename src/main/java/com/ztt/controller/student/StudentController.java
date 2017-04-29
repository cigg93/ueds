package com.ztt.controller.student;

import com.ztt.base.controller.BaseController;
import com.ztt.base.entity.ResultInfo;
import com.ztt.base.util.PageUtil;
import com.ztt.entity.Student;
import com.ztt.service.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by ztt on 2017/3/19.
 */
@RestController
@RequestMapping("student")
public class StudentController extends BaseController {

    @Autowired
    private StudentService userService;

    @RequestMapping(value = "{userId}/info", method = RequestMethod.GET)
    public Student queryStudent(@PathVariable String userId) throws Exception {
        return userService.queryStudent(userId);
    }

    @RequestMapping(value = "password", method = RequestMethod.PUT)
    public Student modifyPassword(
            @RequestBody Student student) throws Exception {
        return userService.modifyPawword(student);
    }

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public ResultInfo query(HttpServletRequest request) throws Exception {

        ResultInfo resultInfo = new ResultInfo();
        /*分页信息*/
        Integer page = pageUtil.getPage(request);
        Integer size = pageUtil.getPageSize(request);
            /*进行无条件分页查询*/
        Page<Student> users = userService.query(page, size);
        resultInfo.setTotal(users.getTotalElements());
        resultInfo.setRows(users.getContent());

        return resultInfo;

    }









}
