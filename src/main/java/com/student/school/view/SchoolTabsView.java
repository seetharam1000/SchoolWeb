package com.student.school.view;

import java.io.IOException;
import java.util.*;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.student.school.global.Global_URL;
import com.student.school.model.*;
import com.student.school.repository.*;
import com.student.school.service.ISchoolTabsService;

@Service
public class SchoolTabsView implements ISchoolTabsService {

	@Autowired
	SchoolProfileRepository schoolProfileRepository;

	@Autowired
	SchoolAboutRepository schoolAboutRepository;

	@Autowired
	SchoolProgramsRepository schoolProgramsRepository;

	@Autowired
	SchoolStudentProgramRepository schoolStudentProgramRepository;

	@Autowired
	SchoolAdmissionHeaderRepository schoolAdmissionHeaderRepository;

	@Autowired
	SchoolOnlineAdmissionRepository schoolOnlineAdmissionRepository;

	@Autowired
	DepartmentRepository deptRepository;

	@Autowired
	Student_Registration_Status_Repository studentRegistrationStatusRepository;

	@Autowired
	Student_Online_Registration_Repository studentOnlineRegistrationsRepository;

	@Autowired
	School_Profile school_Profile;

	@Autowired
	School_About school_About;

	@Autowired
	School_Programs schoolPrograms;

	@Autowired
	Admission_Details_Header admissionDetailsHeader;

	@Override
	@Transactional
	public School_Profile schoolProfile(@Valid School_Profile homeParams) {
		// TODO Auto-generated method stub

		schoolProfileRepository.truncateSchoolProfile();
		String profile_id = "SchoolProfile";
		homeParams.setHome_image_url(
				Global_URL.DIRECTORY + Global_URL.SCHOOLPROFILEFOLDER + profile_id + Global_URL.IMAGE_FORMAT);
		schoolProfileRepository.save(homeParams);

		return homeParams;
	}

	@Override
	@Transactional(readOnly = true)
	public School_Profile getSchoolProfile() {
		// TODO Auto-generated method stub
		school_Profile.setId((long) 1);
		Optional<School_Profile> studentResponse = schoolProfileRepository.findById(school_Profile.getId());

		if (studentResponse.isPresent())
			school_Profile = studentResponse.get();

		return school_Profile;

	}

	@Override
	@Transactional
	public School_About schoolAbout(School_About aboutParams) {
		// TODO Auto-generated method stub
		schoolAboutRepository.truncateSchoolAbout();
		String profile_id = "SchoolAbout";
		aboutParams.setHome_image_url(
				Global_URL.DIRECTORY + Global_URL.SCHOOLABOUTFOLDER + profile_id + Global_URL.IMAGE_FORMAT);
		schoolAboutRepository.save(aboutParams);

		return aboutParams;
	}

	@Override
	@Transactional(readOnly = true)
	public School_About getSchoolAbout() {
		// TODO Auto-generated method stub
		school_About.setId((long) 1);
		Optional<School_About> studentResponse = schoolAboutRepository.findById(school_About.getId());

		if (studentResponse.isPresent())
			school_About = studentResponse.get();

		return school_About;
	}

	@Override
	@Transactional
	public School_Programs updatePrograms(School_Programs programsParams) {
		// TODO Auto-generated method stub

		String profile_id = "SchoolPrograms";

		if (programsParams.getId() != null) {
			schoolProgramsRepository.findById(programsParams.getId());
			programsParams.setPrograms_image_url(Global_URL.DIRECTORY + Global_URL.SCHOOLPROGRAMFOLDER + profile_id
					+ programsParams.getId() + Global_URL.IMAGE_FORMAT);
		}

		schoolProgramsRepository.save(programsParams);

		programsParams.setPrograms_image_url(Global_URL.DIRECTORY + Global_URL.SCHOOLPROGRAMFOLDER + profile_id
				+ programsParams.getId() + Global_URL.IMAGE_FORMAT);

		return programsParams;
	}

	@Override
	@Transactional(readOnly = true)
	public List<School_Programs> getPrograms() {
		// TODO Auto-generated method stub
		List<School_Programs> schoolProgramsList = new ArrayList<School_Programs>();
		schoolProgramsRepository.findAll().forEach(schoolProgramsItems -> schoolProgramsList.add(schoolProgramsItems));
		return schoolProgramsList;
	}

	@Override
	@Transactional(readOnly = false)
	public Integer deletePrograms(@Valid Long programs_Id) {
		// TODO Auto-generated method stub
		Integer status = 0;
		status = schoolProgramsRepository.delete_Programs(programs_Id);

		return status;
	}

	@Override
	@Transactional
	public School_Student_Developments updateStudentDevelopment(School_Student_Developments studentDevelopmentParams) {
		// TODO Auto-generated method stub

		String profile_id = "SchoolStudentsDevelopment";

		if (studentDevelopmentParams.getId() != null) {
			schoolStudentProgramRepository.findById(studentDevelopmentParams.getId());
			studentDevelopmentParams
					.setStudent_development_image_url(Global_URL.DIRECTORY + Global_URL.SCHOOLSTUDENTDEVELOPMENTFOLDER
							+ profile_id + studentDevelopmentParams.getId() + Global_URL.IMAGE_FORMAT);
		}

		schoolStudentProgramRepository.save(studentDevelopmentParams);
		studentDevelopmentParams
				.setStudent_development_image_url(Global_URL.DIRECTORY + Global_URL.SCHOOLSTUDENTDEVELOPMENTFOLDER
						+ profile_id + studentDevelopmentParams.getId() + Global_URL.IMAGE_FORMAT);

		return studentDevelopmentParams;
	}

	@Override
	@Transactional(readOnly = true)
	public List<School_Student_Developments> getStudentDevelopment() {
		// TODO Auto-generated method stub
		List<School_Student_Developments> schoolStudentDevelopmentList = new ArrayList<School_Student_Developments>();
		schoolStudentProgramRepository.findAll()
				.forEach(schoolProgramsItems -> schoolStudentDevelopmentList.add(schoolProgramsItems));
		return schoolStudentDevelopmentList;
	}

	@Override
	@Transactional(readOnly = false)
	public Integer deleteStudentDevelopments(@Valid Long studentDevelopment_Id) {
		// TODO Auto-generated method stub
		Integer status = 0;

		status = schoolStudentProgramRepository.deleteStudentDevelopments(studentDevelopment_Id);
		return status;
	}

	@Override
	@Transactional
	public Admission_Details_Header updateAdmissionDetailsHeader(
			Admission_Details_Header adminssionDetailsHeaderParams) {
		// TODO Auto-generated method stub
		schoolAdmissionHeaderRepository.truncateSchoolAdmission();
		schoolAdmissionHeaderRepository.save(adminssionDetailsHeaderParams);

		return adminssionDetailsHeaderParams;
	}

	@Override
	@Transactional(readOnly = true)
	public Admission_Details_Header getAdmissionDetailsHeader() {
		// TODO Auto-generated method stub
		admissionDetailsHeader.setId((long) 1);
		Optional<Admission_Details_Header> admissionHeaderResponse = schoolAdmissionHeaderRepository
				.findById(admissionDetailsHeader.getId());

		if (admissionHeaderResponse.isPresent())
			admissionDetailsHeader = admissionHeaderResponse.get();

		return admissionDetailsHeader;
	}

	@Override
	public List<Department> getStudentDepartments() {
		// TODO Auto-generated method stub

		List<Department> dept = new ArrayList<Department>();

		deptRepository.findAll().parallelStream().forEach(department -> {
			if (department.getStaff_student() == 3) {

				dept.add(department);
//						Collections.sort(dept, Comparator.comparingLong(Department::getDept_id));
				Collections.sort(dept, Comparator.comparing(Department::getDept_name));
			}
		});
		return dept;
	}

	@Override
	@Transactional
	public boolean email(@Valid String email_Id) {

		boolean email_Student_Exist = false;

		email_Student_Exist = schoolOnlineAdmissionRepository.emailExist(email_Id);

		if (email_Student_Exist) {
			email_Student_Exist = true;
		}

		return email_Student_Exist;
	}

	@Override
	@Transactional
	public boolean mobile(@Valid Long mobile_No) {

		boolean email_Student_Exist = false;

		email_Student_Exist = schoolOnlineAdmissionRepository.mobileExist(mobile_No);

		if (email_Student_Exist) {
			email_Student_Exist = true;
		}

		return email_Student_Exist;
	}

	@Override
	@Transactional
	public Online_Registration register_Student_Credentials(@Valid Online_Registration profile_Details) {
		// TODO Auto-generated method stub

		boolean registerCheck = false;

		registerCheck = schoolOnlineAdmissionRepository.registerCredCheck(profile_Details.getMobile_no(),
				profile_Details.getEmail_id());

		if (!registerCheck) {

			schoolOnlineAdmissionRepository.save(profile_Details);

			String profile_id = "SOR" + profile_Details.getId();
			profile_Details.setProfile_id(profile_id);

		} else {
			profile_Details.setProfile_id(null);
		}
		return profile_Details;
	}

	@Override
	public List<Student_Registration_Status> getStudentRegistrationStatus() {
		// TODO Auto-generated method stub

		List<Student_Registration_Status> srs = new ArrayList<Student_Registration_Status>();
		studentRegistrationStatusRepository.findAll()
				.forEach(studentRegistrationStatus -> srs.add(studentRegistrationStatus));
		return srs;
	}

	@Override
	public List<Online_Registration> getStudent_Online_Registrations() {
		// TODO Auto-generated method stub
		List<Online_Registration> sor = new ArrayList<Online_Registration>();
		studentOnlineRegistrationsRepository.findAll()
				.forEach(studentOnlineRegistration -> sor.add(studentOnlineRegistration));
		return sor;
	}
}
