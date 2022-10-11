package ca.sheridancollege.saiyedas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ca.sheridancollege.saiyedas.beans.Course;
import ca.sheridancollege.saiyedas.repositories.CourseList;

@Controller
public class CourseController {
	
	private CourseList courseList;
	public CourseController(CourseList courseList) {
		super();
		this.setCourseList(courseList);
	}

	@GetMapping("/")
public String index(Model mode1) {
	return "index";
}
	
	@PostMapping("/formPost")
	public String formPost(@RequestParam String scienceCourse, @RequestParam Long scienceCourseNum, @RequestParam String mathCourse,
			@RequestParam int mathCourseNum, @RequestParam String courseList) {

		Course course = new Course();
		course.setScienceCourse(scienceCourse);
		course.setScienceCourseNum(scienceCourseNum);
		course.setMathCourse(mathCourse);
		course.setMathCourseNum(mathCourseNum);

		System.out.println(course);
		return "working";
		
}

	public CourseList getCourseList() {
		return courseList;
	}

	public void setCourseList(CourseList courseList) {
		this.courseList = courseList;
	}

}
