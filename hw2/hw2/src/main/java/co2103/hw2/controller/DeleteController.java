package co2103.hw2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co2103.hw2.model.Customers;
import co2103.hw2.repo.CustomersRepository;
import co2103.hw2.repo.MoviesRepository;
import co2103.hw2.repo.RoomsRepository;
import co2103.hw2.repo.StaffRepository;

@Controller
public class DeleteController {
	@Autowired
	private CustomersRepository customersRepo;
	@Autowired
	private MoviesRepository moviesRepo;
	@Autowired
	private RoomsRepository roomsRepo;
	@Autowired
	private StaffRepository staffRepo;
	
	@GetMapping("/deleteCustomers")
    public String deleteCustomers(@RequestParam(name="id") int customers) {
        Customers toTerminate = null;
        for(Customers c : customersRepo.findAll()) {
            if (c.getTicketID() == customers) {
                toTerminate = c;
            }
        }
        if (toTerminate != null) {
            customersRepo.delete(toTerminate);
        }
        return "redirect:/list";
	}
}
