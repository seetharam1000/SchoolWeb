package com.student.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.student.school.model.School_Profile;

@Repository
public interface SchoolProfileRepository extends JpaRepository<School_Profile, Long> {

	@Modifying
    @Query(
            value = "truncate table School_Profile",
            nativeQuery = true
    )
	void truncateSchoolProfile();
}
