//package com.student.school.repository;
//
//import java.util.List;
//
//import org.springframework.data.jpa.repository.*;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//import com.student.school.entity.Profile_Details;
//
//@Repository
//public interface Profile_Detail_Repository extends JpaRepository<Profile_Details, Long> {
//
//	@Query("select count(ud) > 0 from Profile_Details ud where ud.email_id = :#{#email} AND ud.password = :#{#password}")
//	boolean userCredentialCheck(@Param("email") String email, @Param("password") String password);
//
//	@Query("from Profile_Details ud where ud.email_id = :#{#email} AND ud.password = :#{#password}")
//	Profile_Details userDetails(@Param("email") String email, @Param("password") String password);
//
//	@Query("select count(ud) > 0 from Profile_Details ud where ud.email_id = :#{#email} OR ud.mobile_no = :#{#mobile_no}")
//	boolean userExist(@Param("email") String emailid, @Param("mobile_no") Long mobileno);
//	
//	@Query("from Profile_Details pd where pd.profile_id = :profile_id")
//	List<Profile_Details> profile_Details_Category_Id(@Param("profile_id") String profile_id);
//	
////	@Query("from Profile_Details pd where pd.dept_id = :dept_id")
////	List<Profile_Details> profile_Details_Dept_Id(@Param("dept_id") Integer profile_id);
//	
////	@Query("from Profile_Details pd where pd.profile_category_id = :profile_category_id")
////	List<Profile_Details> profile_Details_Id(@Param("profile_category_id") Integer profile_category_id);
//	
//	//@Query("SELECT pd.profile_id, pd.dob, pd.email_id, pd.first_name, pd.last_name, pd.mobile_no, (SELECT p.profile_type FROM Profile_Category p WHERE p.profile_type_id = pd.profile_category_id), (SELECT dept_name FROM Department d WHERE d.dept_id = pd.dept_id) FROM Profile_Details pd WHERE pd.mobile_no =:mobile_no")
//	@Query("from Profile_Details pd where pd.mobile_no = :mobile_no")
//	List<Profile_Details> profile_Details_Mobile(@Param("mobile_no") Long mobile_no);
//	
//}