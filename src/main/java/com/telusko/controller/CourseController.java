package com.telusko.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.telusko.pojo.Course;

@Controller
public class CourseController 
{
	@GetMapping("/course")
	public String getCourseDetails(Model model)
	{
		model.addAttribute("cid","T1");
		model.addAttribute("cname","Spring MVC");
		model.addAttribute("cprice","4999 INR");
		return "course";
	}
	@GetMapping({"/courseInfo","/courseDetails"})
	public String getCourseInfo(Model model)
	{
		Course course=new Course();
		course.setCid(1);
		course.setCname("AWS");
		course.setCprice(5000.8);
		course.setcDuration("250");
		model.addAttribute("course",course);
		
		return "course";
	}

}
