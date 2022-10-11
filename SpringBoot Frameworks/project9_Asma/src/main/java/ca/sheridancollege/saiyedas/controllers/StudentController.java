package ca.sheridancollege.saiyedas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ca.sheridancollege.saiyedas.beans.Student;
import ca.sheridancollege.saiyedas.database.DatabaseAccess;

@Controller
public class StudentController {
	@Autowired
	private DatabaseAccess da;
	 
		@GetMapping("/")
		public String index(Model model) {
			
			da.insertStudentHardCoded();

			
			model.addAttribute("student",new Student());
			return "index";
		}
	

}
