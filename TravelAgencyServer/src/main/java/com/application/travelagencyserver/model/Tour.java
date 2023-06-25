package com.application.travelagencyserver.model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "tours")
public class Tour {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "destination")
    private String destination;

    @Column(name = "date")
    private Date date;

    @Column(name = "price")
    private int price;

    @Column(name = "durability")
    private int durability;

    @Column(name = "rating")
    private int rating;

    @Column(name = "remains")
    private int remains;


    public Tour() {
    }

    public Tour(String name, String destination, Date date, int price, int durability, int rating, int remains) {
        this.name = name;
        this.destination = destination;
        this.date = date;
        this.price = price;
        this.durability = durability;
        this.rating = rating;
        this.remains = remains;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", destination='" + destination + '\'' +
                ", date=" + date +
                ", price=" + price +
                ", durability=" + durability +
                ", rating=" + rating +
                ", remains=" + remains +
                '}';
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

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getRemains() {
        return remains;
    }

    public void setRemains(int remains) {
        this.remains = remains;
    }
}
