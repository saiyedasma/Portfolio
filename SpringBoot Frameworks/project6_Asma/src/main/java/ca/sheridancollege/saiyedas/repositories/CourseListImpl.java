package ca.sheridancollege.saiyedas.repositories;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Component;

import ca.sheridancollege.saiyedas.beans.Course;
import lombok.Data;
@Data
@Component
public class CourseListImpl implements CourseList {
	private List<Course> courseList = new CopyOnWriteArrayList<Course>();


	public void emptyList() {
		courseList.clear();
	}
}
