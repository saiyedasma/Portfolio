package ca.sheridancollege.saiyedas.database;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import ca.sheridancollege.saiyedas.beans.Student;

@Repository
public class DatabaseAccess {

	@Autowired
	private NamedParameterJdbcTemplate jdbc;
	
	public void insertStudentHardCoded() {
		
		MapSqlParameterSource namedParameters = new MapSqlParameterSource();
		
		String query="INSERT INTO student(name) VALUES ('Frank')";
		
		
		int rowsAffected = jdbc.update(query, namedParameters);
		if (rowsAffected > 0)System.out.println("*** db insert hard-coded Frank");
		}

	public void insertStudent(Student student) {
		MapSqlParameterSource namedParameters = new MapSqlParameterSource();
		
		String query="INSERT INTO student(name) VALUES (:name)";
		
		namedParameters.addValue("name",student.getName());
		
		int rowsAffected = jdbc.update(query, namedParameters);
		
		if (rowsAffected > 0)System.out.println("Inserted student with name"+ student.getName());
		}
	public List<Student> getStudentList() {
		MapSqlParameterSource namedParameters = new
		MapSqlParameterSource();
		
		String query = "SELECT * FROM student";
		return jdbc.query(query, namedParameters, new BeanPropertyRowMapper<Student>(Student.class));
	}

}
