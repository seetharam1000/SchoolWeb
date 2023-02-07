package com.student.school.global;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.springframework.stereotype.Component;

@Component
public class Global_URL {

	public static String PROFILE_CATEGORY_SCHOOL_MENU = "http://schoolmenu/schoolmenu/profile_category/";
	public static String DEPARTMENTS_SCHOOL_MENU = "http://schoolmenu/schoolmenu/departments/";
	public static String PROFILE_DETAILS_SCHOOL_MENU = "http://schoolmenu/schoolmenu/profiles/";
	public static String LOGIN_SCHOOL_MENU = "http://schoolmenu/schoolmenu/login/";
	public static String REGISTER_SCHOOL_MENU = "http://schoolmenu/schoolmenu/register/";

	public static String PROFILE_IMAGE_PATH = "Profile\\";
	public static String SCHOOLPROFILEFOLDER = "SchoolProfile";
	public static String SCHOOLABOUTFOLDER = "SchoolAbout";
	public static String SCHOOLPROGRAMFOLDER = "SchoolPrograms";
	public static String SCHOOLSTUDENTDEVELOPMENTFOLDER = "SchoolStudentsDevelopment\\";
	public static String IMAGE_FORMAT = ".png";

	// Image path
	public static String DIRECTORY = "D:\\School\\";

}
