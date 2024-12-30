package com.xworkz.course.entity;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="xworkz_page")
@Data
@RequiredArgsConstructor
public class CourseEntity {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
	    private String name;
	    private Integer age;
	    private  String email;
	    private  String password;
	    private  String conformPassword;
	    private String phoneNo;
}
