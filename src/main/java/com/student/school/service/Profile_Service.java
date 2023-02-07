//package com.student.school.service;
//
//import com.student.school.model.Profile_Details;
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.stereotype.Component;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import javax.validation.Valid;
//import java.util.List;
//
//@FeignClient(name="http://schoolmenu/schoolmenu")
//@Component
//public interface Profile_Service {
//
//	@RequestMapping("/email/{email_Id}")
//	public boolean email(@Valid @PathVariable String email_Id);
//
//	@RequestMapping("/mobile/{mobile_No}")
//	public boolean mobile(@Valid @PathVariable Long mobile_No);
//
//	@RequestMapping("/profiles")
//	public List<Profile_Details> profile(@Valid @RequestBody Profile_Details profile_Details);
//
//	@DeleteMapping("/deleteProfile/{profile_Id}/{profile_category_id}")
//	public Integer deleteProfile(@PathVariable String profile_Id, @PathVariable Long profile_category_id);
//
////	@RequestMapping("/employee/findall")
////	public Collection<EmployeeInfo> findAll();
//
//}
//
//
//
