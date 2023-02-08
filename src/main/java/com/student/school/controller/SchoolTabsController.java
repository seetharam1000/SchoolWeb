package com.student.school.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.student.school.model.*;
import com.student.school.service.ISchoolTabsService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/schooltabs")
public class SchoolTabsController {

	@Autowired
	private ISchoolTabsService iSchoolTabsService;

	@Autowired
	School_Profile schoolProfile = null;

	@Autowired
	School_About schoolAbout = null;

	@Autowired
	School_Programs schoolPrograms = null;

	@Autowired
	List<School_Programs> schoolProgramsList = null;

	@Autowired
	School_Student_Developments schoolStudentDevelopments = null;

	@Autowired
	List<School_Student_Developments> schoolStudentDevelopmentList = null;

	@Autowired
	Admission_Details_Header admissionDetailsHeaders;

	@Autowired
	List<Department> dept;
	
	@Autowired
	List<Student_Registration_Status> studentRegistrationStatus;
	
	@Autowired
	List<Online_Registration> student_Online_Registrations;

	@RequestMapping(value = "/schoolProfile", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public School_Profile schoolProfile(@RequestBody School_Profile homeParams) {

		schoolProfile = iSchoolTabsService.schoolProfile(homeParams);

		return schoolProfile;
	}

	@RequestMapping(value = "/getSchoolProfile", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public School_Profile getSchoolProfile() {

		schoolProfile = iSchoolTabsService.getSchoolProfile();

		return schoolProfile;
	}

	@RequestMapping(value = "/schoolAbout", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public School_About schoolAbout(@RequestBody School_About aboutParams) {

		schoolAbout = iSchoolTabsService.schoolAbout(aboutParams);

		return schoolAbout;
	}

	@RequestMapping(value = "/getSchoolAbout", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public School_About getSchoolAbout() {

		schoolAbout = iSchoolTabsService.getSchoolAbout();

		return schoolAbout;
	}

	@RequestMapping(value = "/updatePrograms", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public School_Programs updatePrograms(@RequestBody School_Programs programsParams) {

		schoolPrograms = iSchoolTabsService.updatePrograms(programsParams);

		return schoolPrograms;
	}

	@RequestMapping(value = "/getPrograms", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<School_Programs> getPrograms() {

		schoolProgramsList = iSchoolTabsService.getPrograms();

		return schoolProgramsList;
	}

	@RequestMapping(value = "/deletePrograms/{program_Id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Integer deletePrograms(@Valid @PathVariable Long program_Id) {

		Integer status = null;

		status = iSchoolTabsService.deletePrograms(program_Id);
		return status;
	}

	@RequestMapping(value = "/updateStudentDevelopment", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public School_Student_Developments updateStudentDevelopment(
			@RequestBody School_Student_Developments studentDevelopmentParams) {

		schoolStudentDevelopments = iSchoolTabsService.updateStudentDevelopment(studentDevelopmentParams);

		return schoolStudentDevelopments;
	}

	@RequestMapping(value = "/getStudentDevelopment", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<School_Student_Developments> getStudentDevelopment() {

		schoolStudentDevelopmentList = iSchoolTabsService.getStudentDevelopment();

		return schoolStudentDevelopmentList;
	}

	@RequestMapping(value = "/deleteStudentDevelopments/{studentDevelopments_Id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Integer deleteStudentDevelopments(@Valid @PathVariable Long studentDevelopments_Id) {

		Integer status = null;

		status = iSchoolTabsService.deleteStudentDevelopments(studentDevelopments_Id);
		return status;
	}

	@RequestMapping(value = "/updateAdmissionDetailsHeader", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public Admission_Details_Header updateAdmissionDetailsHeader(
			@RequestBody Admission_Details_Header adminssionDetailsHeaderParams) {

		admissionDetailsHeaders = iSchoolTabsService.updateAdmissionDetailsHeader(adminssionDetailsHeaderParams);

		return admissionDetailsHeaders;
	}

	@RequestMapping(value = "/getAdmissionDetailsHeader", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Admission_Details_Header getAdmissionDetailsHeader() {

		admissionDetailsHeaders = iSchoolTabsService.getAdmissionDetailsHeader();

		return admissionDetailsHeaders;
	}

	@RequestMapping(value = "/getStudentDepartments", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Department> getStudentDepartments() {

		dept = iSchoolTabsService.getStudentDepartments();

		return dept;
	}

	@RequestMapping(value = "/email/{email_Id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean email(@Valid @PathVariable String email_Id) {

		boolean emailExist = false;

		emailExist = iSchoolTabsService.email(email_Id);

		return emailExist;
	}

	@RequestMapping(value = "/mobile/{mobile_No}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean mobile(@Valid @PathVariable Long mobile_No) {

		boolean mobileExist = false;

		mobileExist = iSchoolTabsService.mobile(mobile_No);

		return mobileExist;
	}

	@RequestMapping(value = "/onlineRegistration", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public Online_Registration onlineRegistration(@RequestBody Online_Registration registerParams) {

		Online_Registration userRegister = null;

		userRegister = iSchoolTabsService.register_Student_Credentials(registerParams);

		return userRegister;
	}
	
	@RequestMapping(value = "/getStudentRegistrationStatus", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Student_Registration_Status> getStudentRegistrationStatus() {

		studentRegistrationStatus = iSchoolTabsService.getStudentRegistrationStatus();

		return studentRegistrationStatus;
	}
	
	@RequestMapping(value = "/getStudent_Online_Registrations", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Online_Registration> getStudent_Online_Registrations() {

		student_Online_Registrations = iSchoolTabsService.getStudent_Online_Registrations();

		return student_Online_Registrations;
	}

}
