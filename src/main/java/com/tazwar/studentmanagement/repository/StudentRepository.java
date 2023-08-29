package com.tazwar.studentmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tazwar.studentmanagement.entity.Student;
public interface StudentRepository extends JpaRepository<Student, Long>{

}
