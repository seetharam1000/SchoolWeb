package com.student.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.student.school.model.School_About;

@Repository
public interface SchoolAboutRepository extends JpaRepository<School_About, Long> {

	@Modifying
    @Query(
            value = "truncate table School_About",
            nativeQuery = true
    )
	void truncateSchoolAbout();
}
