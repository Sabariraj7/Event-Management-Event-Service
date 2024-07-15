package com.eventmanagement.Entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "hall")
public class Hall {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "hall_name")
    private String hallName;

    @Column(name = "total_seats")
    private int totalSeats;

    @Column(name = "location")
    private String location;

    @Column(name = "cost_per_seat")
    private double costPerSeat;
    
    @Column(name = "available_tickets")
    private int availableSeats;

    public int getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}

	public Hall() {
    }

    public Hall(String hallName, int totalSeats, String location, double costPerSeat,int availableSeats) {
        this.hallName = hallName;
        this.totalSeats = totalSeats;
        this.location = location;
        this.costPerSeat = costPerSeat;
        this.availableSeats = availableSeats;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getCostPerSeat() {
        return costPerSeat;
    }

    public void setCostPerSeat(double costPerSeat) {
        this.costPerSeat = costPerSeat;
    }

    @Override
    public String toString() {
        return "Hall{" +
                "id=" + id +
                ", hallName='" + hallName + '\'' +
                ", totalSeats=" + totalSeats +
                ", location='" + location + '\'' +
                ", costPerSeat=" + costPerSeat + '\'' +
                ", availableSeats="+ availableSeats +
                '}';
    }
}
