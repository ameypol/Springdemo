package com.luv2code.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.luv2code.springdemo.mvc.validation.CourseCode;

public class Customer {
 private String firstName;
 
 @NotNull(message="is required")
 @Min(value=0, message="must be greater")
 @Max(value=10,message="must be less than 10")
 private Integer freePasses;
 
 @Pattern(regexp="^[a-zA-Z0-9]{5}", message="only 5 char/digits")
 private String postCode;
 
 
@CourseCode(value="TOPS", message="must start with TOPS") 
private String courseCode;

public String getCourseCode() {
	return courseCode;
}
public void setCourseCode(String courseCode) {
	this.courseCode = courseCode;
}
@NotNull(message="is required")
 @Size(min=1)
 private String lastName;

 public Integer getFreePasses() {
	return freePasses;
}
public void setFreePasses(Integer freePasses) {
	this.freePasses = freePasses;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getPostCode() {
	return postCode;
}
public void setPostCode(String postCode) {
	this.postCode = postCode;
} 
 
}
