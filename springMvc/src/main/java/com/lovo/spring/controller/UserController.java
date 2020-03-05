package com.lovo.spring.controller;

import com.lovo.spring.entity.StudentEntity;
import com.lovo.spring.entity.TeacherEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//整个类的方法不再做视图渲染，只返回数据
@RestController
@RequestMapping("UserController")
public class UserController {
    @RequestMapping("/getStudent")
    public StudentEntity getStudent(){

        StudentEntity studentEntity = new StudentEntity("赵云",18);
        return studentEntity;

    }


    @RequestMapping("/getTeacher")
    public TeacherEntity getTeacher(){
        TeacherEntity teacherEntity = new TeacherEntity("老师","j174");
        return teacherEntity;
    }

}
