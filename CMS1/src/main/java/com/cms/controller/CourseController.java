package com.cms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;//

import com.cms.entity.Course;
import com.cms.service.CourseService;

@Controller
public class CourseController {
	
	@Autowired 
	CourseService service;
     
	@GetMapping("/")
	public String home(Model model) {
		List<Course> list = service.getCourse();
		model.addAttribute("courses",list);
		return "home" ;
		
	}
	
	@GetMapping("/addCourse")
	public String addPage(Model model) {
		model.addAttribute("courses", new  Course());
		return "addCourse";
	}
	
	// SAVE
	@PostMapping("/saveCourse")
	public String saveCourse(Course c) {
	    service.saveCourse(c);
	    return "redirect:/";
	}

	// DELETE
	@GetMapping("/deleteCourse")
	public String deleteCourse(int id) {
	    service.deleteCourse(id);
	    return "redirect:/";
	}

	// EDIT PAGE
	@GetMapping("/editCourse")
	public String editCourse(int id, Model model) {
	    model.addAttribute("course", service.getCourseById(id));
	    return "editCourse";
	}

	// UPDATE
	@PostMapping("/updateCourse")
	public String updateCourse(Course c) {
	    service.updateCourse(c);
	    return "redirect:/";
	}
}
