package com.student.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.school.model.Online_Registration;
import com.student.school.model.Student_Registration_Status;

@Repository
public interface Student_Online_Registration_Repository extends JpaRepository<Online_Registration, Long> {

}
