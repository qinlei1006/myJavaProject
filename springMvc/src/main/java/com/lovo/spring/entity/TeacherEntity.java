package com.lovo.spring.entity;

import org.springframework.stereotype.Component;

@Component(value = "teacher")
public class TeacherEntity {
    private String teacherName ="王五";
    private String teacherClass;

    public TeacherEntity() {
    }

    public TeacherEntity(String teacherName, String teacherClass) {
        this.teacherName = teacherName;
        this.teacherClass = teacherClass;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherClass() {
        return teacherClass;
    }

    public void setTeacherClass(String teacherClass) {
        this.teacherClass = teacherClass;
    }
}
