package co2103.hw2.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Staff {
	@Id
	private int staffID;
	@OneToOne
	@JoinColumn
	private Rooms roomNo;
	
	public int getStaffID() {
		return staffID;
	}
	
	public Rooms getRooms() {
		return roomNo;
	}
	
	
	public void setStaffID(int staffID) {
		this.staffID = staffID;
	}
	
	public void setRooms(Rooms roomNo) {
		this.roomNo = roomNo;
	}
	
	public String toString() {
		return "Staff Details:" + "\n Staff ID - " + staffID + "\nRoom ID - " + roomNo;
	}
}
