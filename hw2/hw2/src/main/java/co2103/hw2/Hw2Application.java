package co2103.hw2;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import co2103.hw2.model.Customers;
import co2103.hw2.model.Movies;
import co2103.hw2.model.Rooms;
import co2103.hw2.model.Staff;
import co2103.hw2.repo.CustomersRepository;
import co2103.hw2.repo.MoviesRepository;
import co2103.hw2.repo.RoomsRepository;
import co2103.hw2.repo.StaffRepository;

@SpringBootApplication
public class Hw2Application implements ApplicationRunner {
	@Autowired
	private CustomersRepository customersRepo;
	@Autowired
	private MoviesRepository moviesRepo;
	@Autowired
	private RoomsRepository roomsRepo;
	@Autowired
	private StaffRepository staffRepo;

	public static void main(String[] args) {
		SpringApplication.run(Hw2Application.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Rooms r1 = new Rooms();
		Rooms r2 = new Rooms();
		
		r1.setRoomID(1);
		r2.setRoomID(2);
		r1 = roomsRepo.save(r1);
		r2 = roomsRepo.save(r2);
		
		
		Customers c1 = new Customers();
		Customers c2 = new Customers();
		Customers c3 = new Customers();
		Customers c4 = new Customers();
		Customers c5 = new Customers();
		Customers c6 = new Customers();
		Customers c7 = new Customers();
		Customers c8 = new Customers();
		Customers c9 = new Customers();
		Customers c10 = new Customers();
		Customers c11 = new Customers();
		Customers c12 = new Customers();

		c1.setTicketID(1);
		c2.setTicketID(2);
		c3.setTicketID(3);
		c4.setTicketID(4);
		c5.setTicketID(5);
		c6.setTicketID(6);
		c7.setTicketID(7);
		c8.setTicketID(8);
		c9.setTicketID(9);
		c10.setTicketID(10);
		c11.setTicketID(11);
		c12.setTicketID(12);

		c1.setName("Sami Lennon");
		c2.setName("Kelan Morrow");
		c3.setName("Amara Prentice");
		c4.setName("Rufus Saunders");
		c5.setName("Cory Calvert");
		c6.setName("Rahim Lancaster");
		c7.setName("Shane Park");
		c8.setName("Zi Wilkins");
		c9.setName("Zachary Rivera");
		c10.setName("Hollie Duke");
		c11.setName("Brittney Traynor");
		c12.setName("Mitchel Ryder");
		
		c1.setRooms(r1);
		c2.setRooms(r1);
		c3.setRooms(r1);
		c4.setRooms(r1);
		c5.setRooms(r1);
		c6.setRooms(r1);
		c7.setRooms(r2);
		c8.setRooms(r2);
		c9.setRooms(r2);
		c10.setRooms(r2);
		c11.setRooms(r2);
		c12.setRooms(r2);
		
		c1 = customersRepo.save(c1);
		c2 = customersRepo.save(c2);
		c3 = customersRepo.save(c3);
		c4 = customersRepo.save(c4);
		c5 = customersRepo.save(c5);
		c6 = customersRepo.save(c6);
		c7 = customersRepo.save(c7);
		c8 = customersRepo.save(c8);
		c9 = customersRepo.save(c9);
		c10 = customersRepo.save(c10);
		c11 = customersRepo.save(c11);
		c12 = customersRepo.save(c12);
		
		
		Movies m1 = new Movies();
		Movies m2 = new Movies();
		Movies m3 = new Movies();
		Movies m4 = new Movies();
		Movies m5 = new Movies();
		Movies m6 = new Movies();
		
		m1.setMovieID(1);
		m2.setMovieID(2);
		m3.setMovieID(3);
		m4.setMovieID(4);
		m5.setMovieID(5);
		m6.setMovieID(6);
		
		m1.setTitle("James Bond");
		m2.setTitle("Harry Potter");
		m3.setTitle("Mission Impossible");
		m4.setTitle("23 Jump Street");
		m5.setTitle("The Kings man");
		m6.setTitle("West Side Story");

		m1.setTime("12:00");
		m2.setTime("16:00");
		m3.setTime("20:00");
		m4.setTime("13:00");
		m5.setTime("17:00");
		m6.setTime("21:00");
		
		m1.setRooms(r1);
		m2.setRooms(r1);
		m3.setRooms(r1);
		m4.setRooms(r2);
		m5.setRooms(r2);
		m6.setRooms(r2);
		
		m1 = moviesRepo.save(m1);
		m2 = moviesRepo.save(m2);
		m3 = moviesRepo.save(m3);
		m4 = moviesRepo.save(m4);
		m5 = moviesRepo.save(m5);
		m6 = moviesRepo.save(m6);
		
		
		r1.setMovies(new ArrayList<>());
		r1.getMovieList().add(m1);
		r1.getMovieList().add(m2);
		r1.getMovieList().add(m3);
		r1 = roomsRepo.save(r1);
		
		r2.setMovies(new ArrayList<>());
		r2.getMovieList().add(m4);
		r2.getMovieList().add(m5);
		r2.getMovieList().add(m6);
		r2 = roomsRepo.save(r2);
		
		
		Staff s1 = new Staff();
		Staff s2 = new Staff();

		s1.setStaffID(1);
		s2.setStaffID(2);
		
		s1.setRooms(r1);
		s2.setRooms(r2);
		
		s1 = staffRepo.save(s1);
		s2 = staffRepo.save(s2);

	}

}
