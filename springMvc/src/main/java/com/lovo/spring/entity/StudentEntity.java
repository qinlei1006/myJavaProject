package com.lovo.spring.entity;

import org.springframework.stereotype.Component;

@Component(value = "student")
public class StudentEntity {
    private String studentName  = "李四";
    private int studentAge =21;

    public StudentEntity() {
    }

    public StudentEntity(String studentName, int studentAge) {
        this.studentName = studentName;
        this.studentAge = studentAge;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }
}
