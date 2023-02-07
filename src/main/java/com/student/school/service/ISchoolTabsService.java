package com.student.school.service;

import java.util.List;

import javax.validation.Valid;

import com.student.school.model.Admission_Details_Header;
import com.student.school.model.Department;
import com.student.school.model.Online_Registration;
import com.student.school.model.School_About;
import com.student.school.model.School_Profile;
import com.student.school.model.School_Programs;
import com.student.school.model.School_Student_Developments;
import com.student.school.model.Student_Registration_Status;

public interface ISchoolTabsService {

	School_Profile schoolProfile(@Valid School_Profile homeParams);
	
	School_Profile getSchoolProfile();

	School_About schoolAbout(School_About homeParams);

	School_About getSchoolAbout();

	School_Programs updatePrograms(School_Programs programsParams);

	List<School_Programs> getPrograms();

	School_Student_Developments updateStudentDevelopment(School_Student_Developments studentDevelopmentParams);

	List<School_Student_Developments> getStudentDevelopment();

	Integer deletePrograms(@Valid Long programs_Id);

	Integer deleteStudentDevelopments(@Valid Long studentDevelopments_Id);

	Admission_Details_Header updateAdmissionDetailsHeader(Admission_Details_Header adminssionDetailsHeaderParams);

	Admission_Details_Header getAdmissionDetailsHeader();

	List<Department> getStudentDepartments();
	
	boolean email(@Valid String email_Id);

	boolean mobile(@Valid Long mobile_No);

	Online_Registration register_Student_Credentials(@Valid Online_Registration registerParams);
	
	List<Student_Registration_Status> getStudentRegistrationStatus();

	List<Online_Registration> getStudent_Online_Registrations();

}
