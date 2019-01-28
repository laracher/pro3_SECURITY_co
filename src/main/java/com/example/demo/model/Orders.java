package com.example.demo.model;

import java.sql.Date;

public class Orders
{
    private long order_id;
    private long user_id;
    private long tour_id;
    private boolean confirmed;
    private Date time_key;

    public Orders(){}

    public Orders(long order_id, long user_id, long tour_id,
            boolean confirmed, Date time_key)
    {
        this.order_id = order_id;
        this.user_id = user_id;
        this.tour_id = tour_id;
        this.confirmed = confirmed;
        this.time_key = time_key;
    }

    public long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(long order_id) {
        this.order_id = order_id;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public long getTour_id() {
        return tour_id;
    }

    public void setTour_id(long tour_id) {
        this.tour_id = tour_id;
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }

    public Date getTime_key() {
        return time_key;
    }

    public void setTime_key(Date time_key) {
        this.time_key = time_key;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "order_id=" + order_id +
                ", user_id=" + user_id +
                ", tour_id=" + tour_id +
                ", confirmed=" + confirmed +
                ", time_key=" + time_key +
                '}';
    }
}
