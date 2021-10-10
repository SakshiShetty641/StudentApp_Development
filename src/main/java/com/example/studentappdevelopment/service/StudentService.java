package com.example.studentappdevelopment.service;

import com.example.studentappdevelopment.entity.Student;
import com.example.studentappdevelopment.dto.StudentDTO;
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

    public Student addStudent(StudentDTO studentDTO) {
        Student studentEntity = new Student();
        studentEntity.setFirstName(studentDTO.getFirstName());
        studentEntity.setLastName(studentDTO.getLastName());
        studentEntity.setRollNo(studentDTO.getRollNo());

        return studentRepository.save(studentEntity);
    }

    public Student updateStudent(int id, StudentDTO studentDTO) {
        Optional<Student> optionalStudentEntity = studentRepository.findById(id);
        if(optionalStudentEntity.isPresent()) {
            Student studentEntity = optionalStudentEntity.get();
            studentEntity.setFirstName(studentDTO.getFirstName());
            studentEntity.setLastName(studentDTO.getLastName());
            studentEntity.setRollNo(studentDTO.getRollNo());
            return studentRepository.save(studentEntity);
        }
        return null;
    }

    public String deleteStudent(int id) {
        Optional<Student> studentEntity = studentRepository.findById(id);
        if (studentEntity.isPresent()) {
           studentRepository.delete(studentEntity.get());
            return "Record deleted successfully";
        }
        return "Record does not exists with this id : " + id;
    }

    public Student getStudentById(int id) {
        Optional<Student> studentEntity = studentRepository.findById(id);
        if(studentEntity.isPresent()) {
            return studentEntity.get();
        }
        return null;
    }
}


