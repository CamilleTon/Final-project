package com.micamsof.schoolmanagementsystem.repository;

import com.micamsof.schoolmanagementsystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Long> {

}
