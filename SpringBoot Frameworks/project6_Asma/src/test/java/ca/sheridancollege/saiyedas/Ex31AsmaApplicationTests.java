package ca.sheridancollege.saiyedas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import ca.sheridancollege.saiyedas.beans.Course;

@SpringBootTest
class Ex31AsmaApplicationTests {

	@Test
	public void buildCourse() {
		Course test = Course.builder()
				.id(Long.valueOf(10))
				.name("Java")
				.build();
		
				assertEquals(test.getId(), Long.valueOf(10));
				assertEquals(test.getName(), "Java");
	}

}
