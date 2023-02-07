package com.student.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.student.school.model.School_Programs;

@Repository
public interface SchoolProgramsRepository extends JpaRepository<School_Programs, Long> {

	@Modifying
	@Query("Delete from School_Programs pgm where pgm.id = :id")
	Integer delete_Programs(@Param("id") Long id);
	
	

}
