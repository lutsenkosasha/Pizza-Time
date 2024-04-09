package org.example.pizzatime.entity;

public class DishOrder {
    private Long id;
    private Long orderIdFk;
    private Long dishIdFk;
    private Integer count;

    public DishOrder(Long id, Long orderIdFk, Long dishIdFk, Integer count) {
        this.id = id;
        this.orderIdFk = orderIdFk;
        this.dishIdFk = dishIdFk;
        this.count = count;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderIdFk() {
        return orderIdFk;
    }

    public void setOrderIdFk(Long orderIdFk) {
        this.orderIdFk = orderIdFk;
    }

    public Long getDishIdFk() {
        return dishIdFk;
    }

    public void setDishIdFk(Long dishIdFk) {
        this.dishIdFk = dishIdFk;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "DishOrder{" +
                "id=" + id +
                ", orderIdFk=" + orderIdFk +
                ", dishIdFk=" + dishIdFk +
                ", count=" + count +
                '}';
    }
}
