package genericity.demo7.bean;

import java.util.Date;

public class Movie {
    private String name;
    private String actor;
    private Double mark;
    private Double time;
    private Double price;
    private int number;
    private Date startTime;

    public Movie() {
    }

    public Movie(String name, String actor, Double mark, Double time, Double price, int number, Date startTime) {
        this.name = name;
        this.actor = actor;
        this.mark = mark;
        this.time = time;
        this.price = price;
        this.number = number;
        this.startTime = startTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public Double getMark() {
        return mark;
    }

    public void setMark(Double mark) {
        this.mark = mark;
    }

    public Double getTime() {
        return time;
    }

    public void setTime(Double time) {
        this.time = time;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
}
