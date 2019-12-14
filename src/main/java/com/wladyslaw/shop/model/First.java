package com.wladyslaw.shop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class First {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String secondName;
    private String hisFather;

    public First(long id, String name, String sesondName, String hisFather) {
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
