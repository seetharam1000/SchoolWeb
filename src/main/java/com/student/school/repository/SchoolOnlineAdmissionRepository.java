package com.student.school.repository;

import java.util.List;

import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.student.school.model.Online_Registration;

@Repository
public interface SchoolOnlineAdmissionRepository extends JpaRepository<Online_Registration, Integer> {
	
	@Query("select case when count(ud) > 0 then true else false end from Online_Registration ud where ud.mobile_no = :#{#mobile_no}")
	boolean mobileExist(@Param("mobile_no") Long mobileno);
	
	@Query("select case when count(ud) > 0 then true else false end from Online_Registration ud where ud.email_id = :#{#email_Id}")
	boolean emailExist(@Param("email_Id") String emailid);
	
	@Query("select case when count(ud) > 0 then true else false end from  Online_Registration ud where ud.mobile_no = :#{#mobile_no} or ud.email_id = :#{#email_Id}")
	boolean registerCredCheck(@Param("mobile_no") Long mobile_no, @Param("email_Id") String email_id);
	
	
	
	
	
	
	
	
	
//	@Query("select count(ud) > 0 from Online_Registration ud where ud.email_id = :#{#email} AND ud.password = :#{#password}")
//	boolean userCredentialCheck(@Param("email") String email, @Param("password") String password);
//
//	@Query("from Online_Registration ud where ud.email_id = :#{#email} AND ud.password = :#{#password}")
//	Online_Registration userDetails(@Param("email") String email, @Param("password") String password);
//
//	@Query("from Online_Registration pd where pd.profile_catg.profile_category_id = :profile_category_id AND pd.dept.dept_id = :dept_id")
//	List<Online_Registration> profile_Details_Profile_Category_Dept(@Param("profile_category_id") Long profile_category_id, @Param("dept_id") Long dept_id);
//	
//	@Query("from Online_Registration pd where pd.mobile_no = :mobile_no")
//	List<Online_Registration> profile_Details_Mobile(@Param("mobile_no") Long mobile_no);
//
//	@Query("From Online_Registration ud where (ud.email_id = :email_id OR ud.profile_id = :email_id) AND ud.password = :password")
//	Online_Registration getUserDetails(@Param("email_id") String email_id, @Param("password") String password);
//
//	@Query("from Online_Registration pd where pd.profile_catg.profile_category_id = :profile_category_id")
//	List<Online_Registration> getAdmin(@Param("profile_category_id") Long profile_category_id);
//
//	@Modifying
//	@Query("Delete from Online_Registration pd where pd.profile_id = :profile_id")
//	Integer delete_Profile_Staff(@Param("profile_id") String profile_Id);

}