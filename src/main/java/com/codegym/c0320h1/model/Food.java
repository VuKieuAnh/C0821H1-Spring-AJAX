package com.codegym.c0320h1.model;

public class Food {
    int id;
    String name;

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

    public Food(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Food() {
    }
}

