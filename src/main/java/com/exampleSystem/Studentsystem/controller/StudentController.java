package com.exampleSystem.Studentsystem.controller;

//step 06 start

import com.exampleSystem.Studentsystem.model.Student;
import com.exampleSystem.Studentsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student) {
        studentService.saveStudent(student);
        return "New student is saved!";
    }
//    step 06 end
//    step 07 start at student repository for get student data

// step 09 start
    @GetMapping("/getAll")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
}
