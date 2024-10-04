package org.example.start.dto;
import org.example.start.dto.CreateMovie;
public class CreateActor {

    private String firstname;
    private String name;
    private String movieId;

    public void setFirstname(String firstname) {this.firstname = firstname;}
    public void setName(String name) {this.name = name;}


    public Object getFirstname() {
        return firstname;
    }

    public String getName() {
        return name;
    }

    public String getMovieid(String movieId) {
        return movieId;
    }

    public void setMovieid(String movieId) {
        this.movieId = movieId;
    }

}
