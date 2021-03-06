package bo.edu.ucb.ingsof.movies;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "movies", path = "movies")
public interface MovieRestRepository extends PagingAndSortingRepository<Movie, Integer>{
    List<Movie> findByCountry(@Param("country") String country);
}
