package com.student.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.student.school.model.Admission_Details_Header;

@Repository
public interface SchoolAdmissionHeaderRepository extends JpaRepository<Admission_Details_Header, Long> {

	@Modifying
    @Query(
            value = "truncate table Admission_Details_Header",
            nativeQuery = true
    )
	void truncateSchoolAdmission();
}
