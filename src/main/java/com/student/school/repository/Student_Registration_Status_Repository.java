package com.student.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.school.model.Student_Registration_Status;

@Repository
public interface Student_Registration_Status_Repository extends JpaRepository<Student_Registration_Status, Long> {

}
