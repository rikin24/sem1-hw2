package co2103.hw2.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Customers {
	@Id
	@GeneratedValue
	private int ticketID;
	private String name;
	@ManyToOne
	private Rooms roomNo;
	@ManyToMany
	private List<Movies> movies = new ArrayList<>();
	
	public int getTicketID() {
		return ticketID;
	}
	
	public String getName() {
		return name;
	}
	
	public Rooms getRooms() {
		return roomNo;
	}
	
	public List<Movies> getMovies() {
		return movies;
	}
	
	
	public void setTicketID(int ticketID) {
		this.ticketID = ticketID;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setRooms(Rooms roomNo) {
		this.roomNo = roomNo;
	}
	
	public void setMovies(List<Movies> movies) {
		this.movies = movies;
	}
	
	@Override
	public String toString() {
		return "Customer Details: " + "\nTicket ID - " + ticketID + "\nCustomer Name - " + name + "\nRoom ID - " + roomNo + "\nMovies: " + "\n" + movies;
	}
}
