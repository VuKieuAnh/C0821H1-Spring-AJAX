package com.codegym.c0320h1.model;


import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;

@Entity
@Table
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private String image;
    @Transient
    private MultipartFile avata;

    public MultipartFile getAvata() {
        return avata;
    }

    public void setAvata(MultipartFile avata) {
        this.avata = avata;
    }

    @ManyToOne
    private Classess classess;


    public Student() {
    }

    public Classess getClassess() {
        return classess;
    }

    public void setClassess(Classess classess) {
        this.classess = classess;
    }

    public Student(Long id, String name, String address, String image, Classess classess) {
        this.id = id;
        this.image = image;
        this.classess = classess;
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }


    public Student( String name, String address, String image, Classess classess, MultipartFile avata) {
        this.avata = avata;
        this.image = image;
        this.classess = classess;
        this.name = name;
        this.address = address;
    }
}
