package com.example.studentappdevelopment.service;

import com.example.studentappdevelopment.entity.Student;
import com.example.studentappdevelopment.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public String deleteStudent(int id) {
        Optional<Student> studentEntity = studentRepository.findById(id);
        if (studentEntity.isPresent()) {
           studentRepository.delete(studentEntity.get());
            return "Record deleted successfully";
        }
        return "Record does not exists with this id : " + id;
    }
}


