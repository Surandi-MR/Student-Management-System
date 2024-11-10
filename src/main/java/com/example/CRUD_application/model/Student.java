package com.example.CRUD_application.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@AllArgsConstructor
@Data
@Table(name= "Students")

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="first_name", nullable=false)
    private String firstName;
    @Column(name="last_name", nullable=false)
    private String lastName;
    @Column(name="email_id", nullable=false)
    private String email;
    @Column(name="department", nullable = false)
    private String department;
    @Column(name="enrollment_year", nullable = false)
    private Integer yearOfEnrollment;
}
