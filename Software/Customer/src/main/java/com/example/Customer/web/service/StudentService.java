package com.example.Customer.web.service;

import com.example.Customer.web.Model.StudentEntity;
import com.example.Customer.web.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public StudentEntity createStudent(StudentEntity student) {
       //Business logic
        // compare or check if student is already present
        //

        studentRepository.save(student);

        return student;

    }

    public List<StudentEntity> getStudents() {
        return studentRepository.findAll();
    }
    public List<StudentEntity> getbyStudentId()
    {
        return studentRepository.findAllById(int id);
    }
}
