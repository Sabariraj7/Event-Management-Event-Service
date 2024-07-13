package com.eventmanagement.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "offer")
public class Offer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "ticket_count")
    private int ticketCount;

    @Column(name = "percentage_to_reduce")
    private int percentageToReduce;

    public Offer() {
    }

    public Offer(String name, int ticketCount, int percentageToReduce) {
        this.name = name;
        this.ticketCount = ticketCount;
        this.percentageToReduce = percentageToReduce;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTicketCount() {
        return ticketCount;
    }

    public void setTicketCount(int ticketCount) {
        this.ticketCount = ticketCount;
    }

    public int getPercentageToReduce() {
        return percentageToReduce;
    }

    public void setPercentageToReduce(int percentageToReduce) {
        this.percentageToReduce = percentageToReduce;
    }

    @Override
    public String toString() {
        return "Offer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ticketCount=" + ticketCount +
                ", percentageToReduce=" + percentageToReduce +
                '}';
    }
}
