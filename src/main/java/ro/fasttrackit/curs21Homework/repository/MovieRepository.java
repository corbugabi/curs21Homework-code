package ro.fasttrackit.curs21Homework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttrackit.curs21Homework.model.Movie;

public interface MovieRepository extends JpaRepository<Movie,Integer> {
}
