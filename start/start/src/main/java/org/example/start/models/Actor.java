package org.example.start.models;

import jakarta.persistence.*;

@Entity
@Table(name = "actor")
public class Actor {

    public Object getName;
    public Object getFirstname;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY.UUID)
    private String id;

    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "surname")
    private String surname;

    public Actor(String name, String surname) {
        this.name = name;
        this.surname = surname;

    }

    public Actor() {

    }

    public void setFirstname(Object getFirstname) {
    }

    public void setName(Object getName) {
    }

    public void setMovie(Movie movie) {
    }
}