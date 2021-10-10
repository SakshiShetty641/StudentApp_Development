package com.example.studentappdevelopment.controller;

import com.example.studentappdevelopment.entity.Student;
import com.example.studentappdevelopment.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    //To perform CRUD Operations like -> Create, Read, Update, Delete

    @Autowired
    private StudentService studentService;

    @GetMapping(value = "/students")
    public List<Student> students() {
        return studentService.students();
    }
}
