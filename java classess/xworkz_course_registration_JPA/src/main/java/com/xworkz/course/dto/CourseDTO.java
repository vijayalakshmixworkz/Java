package com.xworkz.course.dto;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class CourseDTO {
	 private Integer id;
	    private String name;
	    private Integer age;
	    private  String email;
	    private  String password;
	    private  String conformPassword;
	    private String phoneNo;
}
