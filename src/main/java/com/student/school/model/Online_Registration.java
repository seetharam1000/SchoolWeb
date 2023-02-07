package com.student.school.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = "id") })
@Component
public class Online_Registration {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(length = 11)
	private Integer id;

	@Column(length = 100)
	private String student_name;

	@Column(length = 100)
	private String father_name;

	@Column(length = 6)
	private Timestamp dob;

	@Column(length = 10)
	private Long mobile_no;
 
	@Column(length = 50) 
	private String email_id;
	
	@Column(length = 50) 
	private String profile_id;
	
	@Column(length = 1) 
	private Integer status;
	
	@OneToOne
    private Department dept;
	
}

