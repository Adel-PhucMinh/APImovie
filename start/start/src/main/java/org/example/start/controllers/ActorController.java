package org.example.start.controllers;

import org.example.start.models.Actor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class ActorController {

    private ActorController service;

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable String id, @RequestBody Actor actor) {
        service.update(id, actor);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
