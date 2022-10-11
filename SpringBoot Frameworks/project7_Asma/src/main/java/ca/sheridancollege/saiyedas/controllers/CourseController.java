package ca.sheridancollege.saiyedas.controllers;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ca.sheridancollege.saiyedas.beans.Course;

@Controller
public class CourseController {
	
	List<Course> courseList = new CopyOnWriteArrayList<Course>();
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("courseList", courseList);
		return "index";
	}
	
	@PostMapping("/addCourse")
	private String addCourse(
			@RequestParam Long id, 
			@RequestParam String prefix, 
			@RequestParam String code, 
			@RequestParam String name, 
			Model model) {
		
		Course course = new Course(name, prefix, code, id);
		
		courseList.add(course);
		
		model.addAttribute("courseList", courseList);
		
		System.out.println(course);
		
		return "index";
	}
}
