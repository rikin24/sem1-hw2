package co2103.hw2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import co2103.hw2.repo.CustomersRepository;

@Controller
public class CustomersController {
	@Autowired
	private CustomersRepository customersRepo;
	
	@GetMapping("/Customers")
	public String customers(Model model) {
		model.addAttribute("customers", customersRepo.findAll());
		return "Customers/list";
	}
}
