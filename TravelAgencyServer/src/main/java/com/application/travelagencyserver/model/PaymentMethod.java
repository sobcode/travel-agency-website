package com.application.travelagencyserver.model;

import jakarta.persistence.*;

@Entity
@Table(name = "payment_methods")
public class PaymentMethod {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "card_number")
    private String cardNumber;

    @Column(name = "day")
    private int day;

    @Column(name = "month")
    private int month;


    public PaymentMethod() {
    }

    public PaymentMethod(String cardNumber, int day, int month) {
        this.cardNumber = cardNumber;
        this.day = day;
        this.month = month;
    }

    @Override
    public String toString() {
        return "PaymentMethod{" +
                "id=" + id +
                ", cardNumber='" + cardNumber + '\'' +
                ", day=" + day +
                ", month=" + month +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
}
