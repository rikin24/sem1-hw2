package co2103.hw2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import co2103.hw2.repo.MoviesRepository;

@Controller
public class MoviesController {
	@Autowired
	private MoviesRepository moviesRepo;
	
	@GetMapping("/Movies")
	public String movies(Model model) {
		model.addAttribute("movies", moviesRepo.findAll());
		return "Movies/list";
	}
}
