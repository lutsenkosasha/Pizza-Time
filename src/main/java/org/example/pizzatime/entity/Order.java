package org.example.pizzatime.entity;

import java.time.LocalDate;

public class Order {
    private Long id;
    private String address;
    private LocalDate deliveryTime;
    private Integer costOfTheOrder;
    private Long userIdFk;

    public Order(Long id, String address, LocalDate deliveryTime, Integer costOfTheOrder, Long user) {
        this.id = id;
        this.address = address;
        this.deliveryTime = deliveryTime;
        this.costOfTheOrder = costOfTheOrder;
        this.userIdFk = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(LocalDate deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Integer getCostOfTheOrder() {
        return costOfTheOrder;
    }

    public void setCostOfTheOrder(Integer costOfTheOrder) {
        this.costOfTheOrder = costOfTheOrder;
    }

    public Long getUserIdFk() {
        return userIdFk;
    }

    public void setUserIdFk(Long userIdFk) {
        this.userIdFk = userIdFk;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", deliveryTime=" + deliveryTime +
                ", costOfTheOrder=" + costOfTheOrder +
                ", userIdFk=" + userIdFk +
                '}';
    }
}