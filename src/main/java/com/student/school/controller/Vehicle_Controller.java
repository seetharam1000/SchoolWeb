//package com.student.school.controller;
//
//import java.util.List;
//import java.util.Optional;
//
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.student.school.model.News;
//import com.student.school.model.Vehicle;
//import com.student.school.model.VehicleNotification;
//import com.student.school.service.Vehicle_Service;
//
//
//@RestController
//@RequestMapping("/schoolvehicle")
//public class Vehicle_Controller {
//
//	@Autowired
//	public Vehicle_Service vehicle_service;
//
//	@RequestMapping(value = "/route",
//			method = RequestMethod.GET,
//			produces = MediaType.APPLICATION_JSON_VALUE)
//	public List<Vehicle> vehicle() {
//
//		return vehicle_service.route();
//	}
//
//	@RequestMapping(value = "/maprefresh/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//	public Optional<Vehicle> mapRefresh(@Valid @PathVariable Integer id) {
//
//		return vehicle_service.maprefresh(id);
//	}
//
//	@RequestMapping(value = "/vehiclenotification",
//			method = RequestMethod.GET,
//			produces = MediaType.APPLICATION_JSON_VALUE)
//	public List<VehicleNotification> vehiclenotification() {
//
//		return vehicle_service.vehiclenotification();
//	}
//
//	@RequestMapping(value = "/news",
//			method = RequestMethod.GET,
//			produces = MediaType.APPLICATION_JSON_VALUE)
//	public List<News> news() {
//
//		return vehicle_service.news();
//	}
//
//}
