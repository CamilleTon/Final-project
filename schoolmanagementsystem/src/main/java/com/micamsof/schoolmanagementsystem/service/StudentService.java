package com.micamsof.schoolmanagementsystem.service;

import com.micamsof.schoolmanagementsystem.model.Student;
import com.micamsof.schoolmanagementsystem.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class StudentService {
    private final StudentRepo studentRepo;

    @Autowired
    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public Student addStudent(Student student){
        student.setStudentNumber(UUID.randomUUID().toString());
        return studentRepo.save(student);
    }
}
