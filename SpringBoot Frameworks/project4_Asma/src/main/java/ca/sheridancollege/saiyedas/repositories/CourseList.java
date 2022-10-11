package ca.sheridancollege.saiyedas.repositories;

import java.util.List;

import ca.sheridancollege.saiyedas.beans.Course;

public interface CourseList {
	public List<Course> getCourseList();
	public void setCourseList(List<Course> courseList);
	public void emptyList();

}
