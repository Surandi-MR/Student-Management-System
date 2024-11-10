package com.example.CRUD_application.controller;//StudentController
import com.example.CRUD_application.model.Student;
import com.example.CRUD_application.service.Studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@CrossOrigin(origins = "*")

public class StudentController {

@Autowired
    private Studentservice studentService;

@PostMapping
    public ResponseEntity<Student> saveStudent (@RequestBody Student student){
        return new ResponseEntity<Student>(studentService.saveStudent(student), 
        HttpStatus.CREATED);
    }

//GetAll Rest Api
@GetMapping
public List<Student> getAllStudent(){
    return studentService.getAllStudent();
}

//Get by Id Rest Api
@GetMapping("{id}")
// localhost:8080/api/students/1
public ResponseEntity<Student> getStudentById(@PathVariable("id") long StudentID){
    return new ResponseEntity<Student>(studentService.getStudentById(StudentID),HttpStatus.OK);
}

@PutMapping("{id}")
 public ResponseEntity<Student> updateStudent(@PathVariable("id") long id, @RequestBody Student student){
    return new ResponseEntity<Student>(studentService.updateStudent(student,id),HttpStatus.OK);
 }

 //Delete Rest Api
 @DeleteMapping("{id}")
 public ResponseEntity<String> deleteStudent(@PathVariable("id") long id){
    //delete employee from db
    studentService.deleteStudent(id);
    return new ResponseEntity<String>("Student deleted Successfully.",HttpStatus.OK);
 }
}


