package com.example.studentappdevelopment.service;

import com.example.studentappdevelopment.entity.Student;
import com.example.studentappdevelopment.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> students() {
        return studentRepository.findAll();
    }
}

