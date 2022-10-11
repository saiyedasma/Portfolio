package ca.sheridancollege.saiyedas.controllers;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ca.sheridancollege.saiyedas.beans.VideoGame;

@Controller
public class GameController {
	
	private List<VideoGame> gameList = new CopyOnWriteArrayList<VideoGame>();
	
	@GetMapping("/")

	public String index(Model model) {
		
		model.addAttribute("videogame", new VideoGame());
		model.addAttribute("gameList",gameList);
		return"index";
	}
	@PostMapping("/addVideoGame")
	public String addVideoGame(Model model,@ModelAttribute VideoGame videogame)
	 {
		gameList.add(videogame);
		
		
		model.addAttribute("videogame",new VideoGame());
		model.addAttribute("gameList", gameList);
		
		return "index";
		
		
	}
	
}
