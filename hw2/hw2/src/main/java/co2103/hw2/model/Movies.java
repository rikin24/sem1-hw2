package co2103.hw2.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Movies {
	@Id
	private int movieID;
	private String title;
	private String time;
	@ManyToMany(mappedBy = "movies")
	private List<Customers> customers = new ArrayList<>();
	@ManyToOne
	@JoinColumn
	private Rooms roomNo;
	
	public int getMovieID() {
		return movieID;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getTime() {
		return time;
	}
	
	public List<Customers> getCustomers() {
		return customers;
	}
	
	public Rooms getRooms() {
		return roomNo;
	}
	
	
	public void setMovieID(int movieID) {
		this.movieID = movieID;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setTime(String time) {
		this.time = time;
	}
	
	public void setCustomers(List<Customers> customers) {
		this.customers = customers;
	}
	
	public void setRooms(Rooms roomNo) {
		this.roomNo = roomNo;
	}
	
	public String toString() {
		return "Movie Details:" + "\nMovie Title - " + title + "\nViewing Time - " + time + "\nRoom ID - " + roomNo + "\nCustomers: " + "\n" + customers;
	}
}
