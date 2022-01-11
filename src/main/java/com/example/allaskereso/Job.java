package com.example.allaskereso;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.UUID;

@Entity
@Table
public class Job {

    public Job() {}
    public int getId() {
        return id;
    }

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    @Size(min=0,max=50, message="Megnevezés hosszú e-mal cím")
    private String name;
    @Column
    @Size(min=0,max=50, message="Helyszin hosszú e-mal cím")
    private String location;
    private String UUid;

    public String getUUid() {
        return UUid;
    }

    public void setUUid(String UUid) {
        this.UUid = UUid;
    }



    public Job(String name, String location) {
        this.name = name;
        this.location = location;
    }
    public Job(String name, String location,String UUid) {
        this.name = name;
        this.location = location;
        this.UUid = UUid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
