//package com.student.school.service;
//
//import java.util.List;
//import java.util.Optional;
//
//import javax.validation.Valid;
//
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.stereotype.Component;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.student.school.model.News;
//import com.student.school.model.Vehicle;
//import com.student.school.model.VehicleNotification;
//
//@FeignClient(name="http://schoolmenu/vehicle" )
//@Component
//public interface Vehicle_Service {
//
//	@RequestMapping("/route")
//	public List<Vehicle> route();
//
//	@RequestMapping("/maprefresh/{id}")
//	public Optional<Vehicle> maprefresh(@Valid @PathVariable Integer id);
//
//	@RequestMapping("/vehiclenotification")
//	public List<VehicleNotification> vehiclenotification();
//
//	@RequestMapping("/news")
//	public List<News> news();
//
//
//}
//
//
//
