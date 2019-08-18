package com.example.Customer.web.Controller;

import com.example.Customer.web.Model.StudentEntity;
import com.example.Customer.web.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    StudentService studentService;


    @PostMapping("/student")
    public StudentEntity createStudent(@RequestBody StudentEntity student) {
            System.out.println("");
            StudentEntity response = studentService.createStudent(student);
            return response;
    }

    @GetMapping("/students")
    public List<StudentEntity> getStudents () {
        return studentService.getStudents();
    }
    @GetMapping("/studentsId")
    public List<StudentEntity > getbyStudentId(){
        return studentService.getbyStudentId();
    }
}

