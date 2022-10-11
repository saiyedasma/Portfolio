package ca.sheridancollege.saiyedas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ca.sheridancollege.saiyedas.beans.Course;
import ca.sheridancollege.saiyedas.repositories.CourseList;


@Controller
public class CourseController {
	
	@Autowired
	private CourseList courseList;

	/*
	 * public CourseController(CourseList courseList) { super(); this.courseList =
	 * courseList; }
	 */
	@GetMapping("/")
	public String index(Model mode1) {
		System.out.println("Clearing List");
		courseList.emptyList();
		return "index";
	}

	@PostMapping("/formPost")

	public String formPost(
			@RequestParam Long id, 
			@RequestParam String prefix, 
			@RequestParam int code,
			@RequestParam String name)
	  
 {
		Course course = Course.builder()
				.id(id)
	    		.name(name)
	    		.prefix(prefix)
	    		.code(code)
				.build();
		System.out.println(course);
 
		return "working";
	}

}
