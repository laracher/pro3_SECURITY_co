package com.example.demo.model;

import java.sql.Date;

public class Tours
{
    private long tour_id;
    private String name;
    private String description;
    private String location;
    private Date start_date;
    private Date end_date;
    private int count_limit;

    public Tours(){}

    public Tours(long tour_id, String name, String description, String location,
            Date start_date, Date end_date, int count_limit)
    {
        this.tour_id = tour_id;
        this.name = name;
        this.description = description;
        this.location = location;
        this.start_date = start_date;
        this.end_date = end_date;
        this.count_limit = count_limit;
    }

    public long getTour_id() {
        return tour_id;
    }

    public void setTour_id(long tour_id) {
        this.tour_id = tour_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public int getCount_limit() {
        return count_limit;
    }

    public void setCount_limit(int count_limit) {
        this.count_limit = count_limit;
    }

    @Override
    public String toString() {
        return "Tours{" +
                "tour_id=" + tour_id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", location='" + location + '\'' +
                ", start_date=" + start_date +
                ", end_date=" + end_date +
                ", count_limit=" + count_limit +
                '}';
    }
}
