package ro.fasttrackit.curs21Homework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttrackit.curs21Homework.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Integer> {
}
