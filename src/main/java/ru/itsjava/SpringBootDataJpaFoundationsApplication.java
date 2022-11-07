package ru.itsjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.itsjava.service.FilmService;
import ru.itsjava.service.GenreService;

@SpringBootApplication
public class SpringBootDataJpaFoundationsApplication {

    public static void main(String[] args) {
        var context = SpringApplication.run(SpringBootDataJpaFoundationsApplication.class, args);
        FilmService filmService = context.getBean(FilmService.class);
        filmService.printAllFilms();

        GenreService genreService = context.getBean(GenreService.class);
        genreService.changeGenre("fantasy", "comedy");
        genreService.printGenre("comedy");

//        GenreRepository genreRepository = context.getBean(GenreRepository.class);
//        System.out.println("genreRepository.getById(1L) = " + genreRepository.getById(1L));
//
//        Genre genre = new Genre(3L, "comedy");
//        genreRepository.save(genre);
//        System.out.println("genreRepository.getById(3L) = " + genreRepository.getById(3L));
//
//        Genre genre3 = genreRepository.getById(3L);
//        genre3.setName("WESTERN");
//        genreRepository.save(genre3);
//
//        System.out.println("genreRepository.getById(3L) = " + genreRepository.getById(3L));
//
//        genreRepository.deleteById(3L);
//        System.out.println("genreRepository.findById(3L) = " + genreRepository.findById(3L).isPresent());
//
//        FilmRepository filmRepository = context.getBean(FilmRepository.class);
//        System.out.println(filmRepository.findAll());
//
//		System.out.println("genreRepository.getByName(\"WESTERN\") = " + genreRepository.getByName("WESTERN"));
//		System.out.println("genreRepository.getByName(\"WESTERN\").isPresent() = " + genreRepository.getByName("WESTERN").isPresent());
//
//        System.out.println("filmRepository.findFilmByTitleAndGenre(\"Harry Potter\", genreRepository.getById(1L)).isPresent() = "
//                + filmRepository.findFilmByTitleAndGenre("Harry Potter", genreRepository.getById(1L)).isPresent());
//        Console.main(args);


    }

}
