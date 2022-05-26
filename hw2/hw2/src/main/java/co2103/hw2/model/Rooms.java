package co2103.hw2.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Rooms {
	@Id
	private int roomID;
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Movies> movieList = new ArrayList<>();
	
	public int getRoomID() {
		return roomID;
	}
	
	public List<Movies> getMovieList() {
		return movieList;
	}
	
	
	public void setRoomID(int roomID) {
		this.roomID = roomID;
	}
	
	public void setMovies(List<Movies> movieList) {
		this.movieList = movieList;
	}
	
	public String toString() {
		return "Room Details:" + "\nRoom ID - " + roomID + "\nMovies:" + "\n" + movieList;
	}
}
