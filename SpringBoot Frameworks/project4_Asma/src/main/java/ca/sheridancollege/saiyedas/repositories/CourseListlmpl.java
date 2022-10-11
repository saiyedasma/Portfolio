package ca.sheridancollege.saiyedas.repositories;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Component;

import ca.sheridancollege.saiyedas.beans.Course;

@Component
public class CourseListlmpl {
	
	private List<Course> courseList = new CopyOnWriteArrayList<Course>();

	public List<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}

}
