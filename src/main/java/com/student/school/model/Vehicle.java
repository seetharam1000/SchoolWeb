package com.student.school.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Vehicle {

	private Integer bus_no; 
	
	private String first_name;

	private String last_name;
	
	private long mobile;
	
	private String route;
	
	private double lat;
	
	private double lon;

}
