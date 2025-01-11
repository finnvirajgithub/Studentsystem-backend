package com.exampleSystem.Studentsystem.service;

import com.exampleSystem.Studentsystem.model.Student;
import com.exampleSystem.Studentsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
