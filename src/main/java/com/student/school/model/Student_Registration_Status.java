package com.student.school.model;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = "id") })
@Component
public class Student_Registration_Status {

	@Id
	@Column(length = 11)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(length = 100)
	private String status;

}
