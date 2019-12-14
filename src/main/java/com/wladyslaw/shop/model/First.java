package com.wladyslaw.shop.model;

public class First {

    private long id;
    private String name;
    private String secondName;
    private String hisFather;

    public First(long id, String name, String sesondName) {
        this.id = id;
        this.name = name;
        this.secondName = sesondName;
        this.hisFather = hisFather;
    }

    public First() {
    }

    public String getHisFather() {
        return hisFather;
    }

    public void setHisFather(String hisFather) {
        this.hisFather = hisFather;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String sesondName) {
        this.secondName = sesondName;
    }
}
