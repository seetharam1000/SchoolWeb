package com.student.school.controller;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import com.student.school.global.Global_Methods;
import com.student.school.global.Global_URL;
import com.student.school.model.Department;
import com.student.school.model.Profile_Category;
import com.student.school.model.Profile_Details;
//import com.student.school.service.Profile_Service;

@RestController
@RequestMapping("/school")
public class Profile_Controller {

//	@Autowired
//	public RestTemplate restTemplate;
//
//	@Autowired
//	private Profile_Service profile_Service;
//
//	@RequestMapping(value = "/email/{email_Id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//	public boolean email(@Valid @PathVariable String email_Id) {
//
//		boolean emailExist = false;
//
//		emailExist = profile_Service.email(email_Id);
//
//		return emailExist;
//	}
//
//	@RequestMapping(value = "/mobile/{mobile_No}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//	public boolean mobile(@Valid @PathVariable Long mobile_No) {
//
//		boolean mobileExist = false;
//
//		mobileExist = profile_Service.mobile(mobile_No);
//
//		return mobileExist;
//	}
//
//	@RequestMapping(value = "/register", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<Profile_Details> register(@RequestBody Profile_Details registerParams) {
//
//		ResponseEntity<Profile_Details> user_Register = restTemplate.postForEntity(Global_URL.REGISTER_SCHOOL_MENU,
//				registerParams, Profile_Details.class);
//
//		return user_Register;
//	}
//
//	@RequestMapping(value = "/login", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<Profile_Details> login(@RequestBody Profile_Details userParams) throws URISyntaxException {
//
//		ResponseEntity<Profile_Details> profile_Details = restTemplate.postForEntity(Global_URL.LOGIN_SCHOOL_MENU,
//				userParams, Profile_Details.class);
//
//		return profile_Details;
//	}
//
//	@RequestMapping(value = "/profile_category", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<List<Profile_Category>> profileCategory() throws IOException {
//
//		// List<Profile_Category> profile_Category_List = (List<Profile_Category>)
//		// restTemplate.getForObject("http://schoolmenu/schoolmenu/profile_category/",
//		// Profile_Category.class);
//
//		ResponseEntity<List<Profile_Category>> profile_Category_List = restTemplate.exchange(
//				Global_URL.PROFILE_CATEGORY_SCHOOL_MENU, HttpMethod.GET, null,
//				Global_Methods.getListOfObjects(Profile_Category.class));
//
//		return profile_Category_List;
//	}
//
//	@RequestMapping(value = "/departments/{admin_id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<List<Department>> departments(@PathVariable Integer admin_id) {
//
//		ResponseEntity<List<Department>> department_List = restTemplate.exchange(
//				Global_URL.DEPARTMENTS_SCHOOL_MENU + admin_id, HttpMethod.GET, null,
//				Global_Methods.getListOfObjects(Department.class));
//
//		return department_List;
//	}
//
//	@RequestMapping(value = "/profiles", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<List<Profile_Details>> getProfiles(@RequestBody Profile_Details userParams)
//			throws URISyntaxException {
//
////		profile_service.profile(userParams);
//		RequestEntity jsonBody = RequestEntity.post(new URI(Global_URL.PROFILE_DETAILS_SCHOOL_MENU))
//				.accept(MediaType.APPLICATION_JSON).body(userParams);
//
//		ResponseEntity<List<Profile_Details>> profile_Details_List = restTemplate.exchange(jsonBody,
//				Global_Methods.getListOfObjects(Profile_Details.class));
//
//		return profile_Details_List;
//	}
//
//	@RequestMapping(value = "/deleteProfile/{profile_Id}/{profile_category_id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
//	public Integer deleteProfile(@Valid @PathVariable String profile_Id,
//			@Valid @PathVariable Long profile_category_id) {
//
//		Integer profileDelete = 0;
//
//		profileDelete = profile_Service.deleteProfile(profile_Id, profile_category_id);
//
//		return profileDelete;
//	}

	@RequestMapping(value = "/uploadImages", method = RequestMethod.POST, consumes = {
			"multipart/form-data" }, produces = MediaType.APPLICATION_JSON_VALUE, headers = {
					"content-type=application/json", "X-Content-Type-Options=nosniff" })
	@ResponseBody
	public boolean uploadImages(@RequestParam("file") MultipartFile file, @Valid @RequestParam String profile_Id,
			@Valid @RequestParam String profile_Folder) throws Exception {
		boolean status = false;

		File imageDirectory = new File(
				Global_URL.DIRECTORY + profile_Folder + "\\" + profile_Id + ".png");

		if (!imageDirectory.exists())
			imageDirectory.mkdirs();

		file.transferTo(imageDirectory);
		status = true;
		return status;

	}



}
