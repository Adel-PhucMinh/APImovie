package org.example.start.models;

import org.example.start.global.Category;

public class Movie {
    private Actor actor;

    private Category category;
    private String id;

    public String getId() {return id; }

    public Actor setActor(Actor actor) {
        this.actor = actor;
        return actor;
    }
}
