package com.lovo.spring;


import com.lovo.spring.entity.StudentEntity;
import com.lovo.spring.entity.TeacherEntity;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
    ClassPathXmlApplicationContext applicationContext = null;

    @Before
    public void defore(){
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

    }

    @Test
    public void testTeacher(){
        StudentEntity studentEntity = (StudentEntity) applicationContext.getBean("student");
        System.out.println(studentEntity.getStudentName()+"   "+studentEntity.getStudentAge());
    }

}
