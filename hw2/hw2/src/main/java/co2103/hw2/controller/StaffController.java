package co2103.hw2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import co2103.hw2.repo.StaffRepository;

@Controller
public class StaffController {
	@Autowired
	private StaffRepository staffRepo;
	
	@GetMapping("/Staff")
	public String movies(Model model) {
		model.addAttribute("staff", staffRepo.findAll());
		return "Staff/list";
	}
}
