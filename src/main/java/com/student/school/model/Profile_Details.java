package com.student.school.model;

import java.io.File;
import java.sql.Timestamp;
import lombok.*;

@Setter
@Getter
@ToString
public class Profile_Details {

	private Integer id;
	private String profile_id;
	private String first_name;
	private String last_name;
	private String password;
	private Timestamp dob;
	private Long mobile_no;
	private String email_id;
	private String profile_url;
	private Profile_Category profile_catg;
    private Department dept;
	
	
}
