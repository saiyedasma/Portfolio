package ca.sheridancollege.saiyedas.beans;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
@Data
//@NoArgsConstructor
//@AllArgsConstructor
@Builder
public class Course {
	@NonNull 
	private Long id;
	private String prefix;
    private int code;
	private String name;
	
	
}