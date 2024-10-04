package org.example.start.services;

import org.example.start.dto.CreateActor;
import org.example.start.models.Actor;
import org.example.start.models.Movie;
import org.example.start.repesitories.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorService {

    private final ActorRepository repository;

    private MovieService movieService;

    @Autowired
    public ActorService(ActorRepository repository) {
        this.repository = repository;
        this.movieService = movieService;
    }

    private Actor findById(String id) {
        return null;
    }

    public List<Actor> findAll() {
        return repository.findAll();
    }

    public void create(CreateActor createActor) {
        Actor actor = new Actor();
        Movie movie = movieService.findById(createActor.getMovieid());
        actor.setFirstname(createActor.getFirstname());
        actor.setName(createActor.getName());
        actor.setMovie(movie);
        repository.save(actor);
    }


    public void deleteBiId(String id){repository.deleteById(id);}

    public void update(String id, Actor actor) {
        Actor updateActor = findById(id);
        updateActor.setName(actor.getName);
        updateActor.setFirstname(actor.getFirstname);
        repository.save(updateActor);
        // UPDATE actor SET (firstname, name) VALUES (:firstname, :name) where id = id;
    }



}