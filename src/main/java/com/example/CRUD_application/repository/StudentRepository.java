package com.example.CRUD_application.repository;
import com.example.CRUD_application.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository  extends JpaRepository<Student,Long> {
    //crud
}

