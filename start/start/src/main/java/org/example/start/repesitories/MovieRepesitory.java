package org.example.start.repesitories;

import org.example.start.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepesitory extends JpaRepository<Movie, String> {
}
