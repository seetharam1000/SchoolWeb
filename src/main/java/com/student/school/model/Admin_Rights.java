//package com.student.school.model;
//
//import lombok.*;
//import org.springframework.stereotype.Component;
//
//import javax.persistence.*;
//
//@ToString
//@AllArgsConstructor
//@NoArgsConstructor
//@Getter
//@Setter
//@Entity
//@Table(uniqueConstraints = { @UniqueConstraint(columnNames = "admin_id") })
//@Component
//public class Admin_Rights {
//
//	@Id
//	@Column(length = 11)
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private long admin_id;
//
//	@Column(length = 100)
//	private String admin_type;
//
//	@Column(length = 11)
//	private Integer permission_id;
//
//}
