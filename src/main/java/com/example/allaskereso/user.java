package com.example.allaskereso;

import javax.persistence.*;
import javax.validation.constraints.Size;
import javax.validation.constraints.Email;
import java.util.UUID;

@Entity
@Table
public class user {


    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column(unique = true)
    @Size(min=0,max=100, message="Túl hosszú e-mal cím")
    @Email(message = "Érvénytelen e-mail cím")
    private String e_mail;
    @Column(unique = true)
    private UUID UUID;
    public java.util.UUID getUUID() {
        return UUID;
    }

    public void setUUID(java.util.UUID UUID) {
        this.UUID = UUID;
    }


    public user(String name, String e_mail) {
        this.name = name;
        this.e_mail = e_mail;
    }

    public user() {

    }
    public int  getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }
}
