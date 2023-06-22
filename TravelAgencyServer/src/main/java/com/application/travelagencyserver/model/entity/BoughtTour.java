package com.application.travelagencyserver.model.entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "bought_tours")
public class BoughtTour {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "purchase_date")
    private Date purchaseDate;


    @Column(name = "price")
    private int price;

    @OneToOne
    @JoinColumn(name = "users_id")
    private User user;

    @OneToOne
    @JoinColumn(name = "tours_id")
    private Tour tour;


    public BoughtTour() {
    }

    public BoughtTour(Date purchaseDate, int price, User user, Tour tour) {
        this.purchaseDate = purchaseDate;
        this.price = price;
        this.user = user;
        this.tour = tour;
    }

    @Override
    public String toString() {
        return "BoughtTour{" +
                "id=" + id +
                ", purchaseDate=" + purchaseDate +
                ", price=" + price +
                ", user=" + user +
                ", tour=" + tour +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }
}
