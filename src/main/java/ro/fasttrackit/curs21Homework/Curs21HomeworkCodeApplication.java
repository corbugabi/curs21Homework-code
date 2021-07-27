package ro.fasttrackit.curs21Homework;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ro.fasttrackit.curs21Homework.model.*;
import ro.fasttrackit.curs21Homework.repository.ActorRepository;
import ro.fasttrackit.curs21Homework.repository.MovieRepository;
import ro.fasttrackit.curs21Homework.repository.ReviewRepository;
import ro.fasttrackit.curs21Homework.repository.StudioRepository;

import java.util.List;

@SpringBootApplication
public class Curs21HomeworkCodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(Curs21HomeworkCodeApplication.class, args);
    }

    @Bean
    CommandLineRunner atStart(MovieRepository movieRepository, StudioRepository studioRepository, ActorRepository actorRepository) {
        return args -> {


            Studio BBC = studioRepository.save(new Studio("BBC Films", "Aluminei"));
            Studio Lux = studioRepository.save(new Studio("Lux Films", "Caselei"));
            Actor alin = actorRepository.save(new Actor("Alin Andrei", 2000));
            Actor jude = actorRepository.save(new Actor("Jude Law", 1987));
            Actor michael = actorRepository.save(new Actor("Michael Cane", 1933));
            Actor liam = actorRepository.save(new Actor("Liam Neeson", 1952));
            Actor brad = actorRepository.save(new Actor("Brad Pitt", 1963));

            movieRepository.saveAll(List.of(
                    new Movie("Alcapone", 2000, new MovieRating(5, "IMDb"), listOfReveu1(), BBC, List.of(jude,michael)),
                    new Movie("Marea mahmureala", 2005, new MovieRating(4, "IMDb"), listOfReveu2(), Lux, List.of(liam,michael,brad)),
                    new Movie("Aquaman", 2015, new MovieRating(5, "IMDb"), listOfReveu(), BBC, List.of(alin,brad,liam))
            ));
        };
    }

    private List<Review> listOfReveu() {
        return List.of(new Review("Tare", "Geo"), new Review("Groaznic", "Gabi"));
    }

    private List<Review> listOfReveu1() {
        return List.of(new Review("Este extraordinar", "Florin"), new Review("A fost ceva din alta lume", "Alina"));
    }

    private List<Review> listOfReveu2() {
        return List.of(new Review("Nice", "Calin"), new Review("Bestial", "Catalina"));
    }
}
