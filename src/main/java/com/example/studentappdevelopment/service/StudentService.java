package com.example.studentappdevelopment.service;

import com.example.studentappdevelopment.entity.Student;
import com.example.studentappdevelopment.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> students() {
        return studentRepository.findAll();
    }

    public Student addStudent(Student students) {
        return studentRepository.save(students);
    }

    public Student updateStudent(Student students) {
        return studentRepository.save(students);
    }
}

