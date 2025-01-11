package com.exampleSystem.Studentsystem.service;

import com.exampleSystem.Studentsystem.model.Student;

import java.util.List;

// step 04 start
public interface StudentService {
//    method
    public Student saveStudent(Student student);

    //step 04 end
    //step 05 at StudentServiceimpl

    // step 07 start

    public List<Student> getAllStudents();
    //    step 07 end
    //    step 08 start ay Studentserviceimpl
}
