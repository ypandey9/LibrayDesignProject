package com.greatlearning.library.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.library.model.GreatLearning;

//@Controller
@RestController
public class ExampleController {

	@GetMapping("/info")
	//@ResponseBody
	public GreatLearning get()
	{
		GreatLearning greatLearning=new GreatLearning();
		greatLearning.setCourseName("Learn Controller in Spring");
		greatLearning.setCourseType("Inforamtion Technology");
		greatLearning.setInstructorName("Samarth Narula");
		
		return greatLearning;
		
	}
	
	@PostMapping("custominfo")
	public GreatLearning customInfo(String courseName,String courseType,String instructorName)
	{
		GreatLearning greatLearning =new GreatLearning();
		greatLearning.setCourseName(courseName);
		greatLearning.setCourseType(courseType);
		greatLearning.setInstructorName(instructorName);
		return greatLearning;
		
	}
	
}