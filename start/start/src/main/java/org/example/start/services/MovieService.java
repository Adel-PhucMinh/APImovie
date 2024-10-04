package org.example.start.services;

import org.example.start.models.Movie;
import org.example.start.repesitories.MovieRepesitory;
import org.example.start.dto.CreateMovie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    private final MovieRepesitory repesitory;

    @Autowired
    public MovieService(MovieRepesitory repesitory) {
        this.repesitory = repesitory;
    }

    public List<Movie> findAll(){
        return repesitory.findAll();
    }

    public Movie findById(String id){
        return repesitory.findById(id).orElse(null);
    }

    public void create(CreateMovie createMovie){
        Movie movie = new Movie();
        movie.setTitle(createMovie.getTitle());
        movie.setCategory(createMovie.getCategory());
        repesitory.save(movie);
    }

    public void deleteById(String id){
        repesitory.deleteById(id);
    }
}
