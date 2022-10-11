package ca.sheridancollege.saiyedas.beans;

public class Course {
	private String scienceCourse;

	public Course(String scienceCourse, Long scienceCourseNum, String mathCourse, int mathCourseNum) {
		super();
		this.scienceCourse = scienceCourse;
		this.scienceCourseNum = scienceCourseNum;
		this.mathCourse = mathCourse;
		this.mathCourseNum = mathCourseNum;
	}

	private Long scienceCourseNum;
	private String mathCourse;
	private int mathCourseNum;

	public Course() {
		super();
	}

	public String getScienceCourse() {
		return scienceCourse;
	}

	public void setScienceCourse(String scienceCourse) {
		this.scienceCourse = scienceCourse;
	}

	public Long getScienceCourseNum() {
		return scienceCourseNum;
	}

	public void setScienceCourseNum(Long scienceCourseNum) {
		this.scienceCourseNum = scienceCourseNum;
	}

	public String getMathCourse() {
		return mathCourse;
	}

	public void setMathCourse(String mathCourse) {
		this.mathCourse = mathCourse;
	}

	public int getMathCourseNum() {
		return mathCourseNum;
	}

	public void setMathCourseNum(int mathCourseNum) {
		this.mathCourseNum = mathCourseNum;
	}

	@Override
	public String toString() {
		return "Course [scienceCourse=" + scienceCourse + ", scienceCourseNum=" + scienceCourseNum + ", mathCourse="
				+ mathCourse + ", mathCourseNum=" + mathCourseNum + "]";
	}

}