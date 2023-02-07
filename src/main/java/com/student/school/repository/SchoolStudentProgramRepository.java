package com.student.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.student.school.model.School_Student_Developments;

@Repository
public interface SchoolStudentProgramRepository extends JpaRepository<School_Student_Developments, Long> {

	@Modifying
	@Query("Delete from School_Student_Developments sd where sd.id = :id")
	Integer deleteStudentDevelopments(@Param("id") Long id);

}
