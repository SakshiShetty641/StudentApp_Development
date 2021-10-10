package com.example.studentappdevelopment.controller;

import com.example.studentappdevelopment.entity.Student;
import com.example.studentappdevelopment.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(value = "/student")
    public Student addStudent(@RequestBody Student students) {
        return studentService.addStudent(students);
    }

    @PutMapping(value = "/updatestudent")
    public Student updateStudent(@RequestBody Student students) {
        return studentService.updateStudent(students);
    }

    @DeleteMapping(value = "/deletestudent")
    public String deleteStudent(@RequestParam int id) {
        return studentService.deleteStudent(id);
    }

    @GetMapping(value = "/get-student-by-id")
    public Student getStudentById(@RequestParam int id) {
        return studentService.getStudentById(id);
    }

}


