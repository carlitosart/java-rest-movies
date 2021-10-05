package bo.edu.ucb.ingsof.movies;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.MediaType;

@RestController
public class Movies {

    List<Movie> movieList = new ArrayList<>();

    @GetMapping(path = "/movie", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Movie> listAll(){

        return movieList;

    }
    @PostMapping(path = "/movie", produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    public Movie listAll(@RequestBody Movie movie){
        movieList.add(movie);
        return movie;
    }
}
