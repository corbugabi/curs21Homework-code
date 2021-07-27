package ro.fasttrackit.curs21Homework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttrackit.curs21Homework.model.Actor;

public interface ActorRepository extends JpaRepository<Actor, Integer> {
}
