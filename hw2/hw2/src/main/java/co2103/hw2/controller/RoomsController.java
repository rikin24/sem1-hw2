package co2103.hw2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import co2103.hw2.repo.RoomsRepository;

@Controller
public class RoomsController {
	@Autowired
	private RoomsRepository roomsRepo;
	
	@GetMapping("/Rooms")
	public String movies(Model model) {
		model.addAttribute("rooms", roomsRepo.findAll());
		return "Rooms/list";
	}
}
