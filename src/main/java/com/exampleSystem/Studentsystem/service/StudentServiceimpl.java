package com.exampleSystem.Studentsystem.service;

import com.exampleSystem.Studentsystem.model.Student;
import com.exampleSystem.Studentsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//step 05 start
@Service
public class StudentServiceimpl implements StudentService {

//    dependency injection
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

//    step 05 end
//    step 06 at controller

    //    step 08 start

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    //step 08 end
    //step 09 at Controller
}
