package com.student.school.global;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@AllArgsConstructor
public class Global_Methods {
	
	@Autowired
	public static RestTemplate restTemplate;
	
	public static <DynamicPojo> ParameterizedTypeReference<List<DynamicPojo>> getListOfObjects(
			Class<DynamicPojo> dynamicPojo) {

		ParameterizedTypeReference<List<DynamicPojo>> dynamicBean = new ParameterizedTypeReference<List<DynamicPojo>>() {
		};

		return dynamicBean;
	}

}
