package ca.sheridancollege.saiyedas.controllers;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ca.sheridancollege.saiyedas.beans.Appointment;

@Controller
public class HomeController {
	@GetMapping("/")
	public String index(Model mode1) {
		return "index";
	}

	@PostMapping("/formPost")
	public String formPost(@RequestParam String firstName, @RequestParam String lastName, @RequestParam String email,
			@RequestParam @DateTimeFormat(iso=DateTimeFormat.ISO.DATE)LocalDate appointmentDate,
			@RequestParam @DateTimeFormat(iso=DateTimeFormat.ISO.TIME)LocalTime appointmentTime) {

		Appointment appointment = new Appointment();
		appointment.setFirstName(firstName);
		appointment.setLastName(lastName);
		appointment.setEmail(email);
		appointment.setAppointmentDate(appointmentDate);
		appointment.setAppointmentTime(appointmentTime);

		System.out.println(appointment);
		return "working";
	}
}
