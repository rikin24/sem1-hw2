package co2103.hw2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co2103.hw2.repo.CustomersRepository;
import co2103.hw2.repo.MoviesRepository;
import co2103.hw2.repo.RoomsRepository;
import co2103.hw2.repo.StaffRepository;

@Controller
public class ListController {
	
	@Autowired
	private CustomersRepository customersRepo;
	@Autowired
	private MoviesRepository moviesRepo;
	@Autowired
	private RoomsRepository roomsRepo;
	@Autowired
	private StaffRepository staffRepo;
	
    @GetMapping("/list")
    public String musicLibrary(Model model) {
        model.addAttribute("customers", customersRepo.findAll());
        model.addAttribute("movies", moviesRepo.findAll());
        model.addAttribute("rooms", roomsRepo.findAll());
        model.addAttribute("staff", staffRepo.findAll());
        return "list";
    }
	
	/* @RequestMapping("/list")
	public String list() {
		return "list";
	} */
}
