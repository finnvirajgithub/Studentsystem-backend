package com.exampleSystem.Studentsystem.repository;

import com.exampleSystem.Studentsystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//step 02 start
@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

}
//step 02 end
//step 03 is connect the database