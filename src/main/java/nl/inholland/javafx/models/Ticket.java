package nl.inholland.javafx.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Ticket {
    private LocalDateTime start;
    private LocalDateTime end;
    private String title;
    private int seats;
    private double price;

    public Ticket(LocalDateTime start, LocalDateTime end, String title, int seats, double price) {
        this.start = start;
        this.end = end;
        this.title = title;
        this.seats = seats;
        this.price = price;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
