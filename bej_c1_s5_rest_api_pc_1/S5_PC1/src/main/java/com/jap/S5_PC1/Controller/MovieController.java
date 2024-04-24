package com.jap.S5_PC1.Controller;

import com.jap.S5_PC1.domain.Movie;
import com.jap.S5_PC1.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MovieController {

    private MovieService movieService;
    @Autowired
    public MovieController(MovieService movieService){
        this.movieService = movieService;
    }
    @PostMapping("/movie")
    public ResponseEntity saveUser(@RequestBody Movie movie){
        Movie savedMovie = movieService.saveMovie(movie);
        return new ResponseEntity(savedMovie, HttpStatus.CREATED);
    }
}
