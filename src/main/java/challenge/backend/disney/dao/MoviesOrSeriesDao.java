package challenge.backend.disney.dao;

import challenge.backend.disney.domain.MoviesOrSeries;
import org.springframework.data.repository.CrudRepository;

public interface MoviesOrSeriesDao extends CrudRepository<MoviesOrSeries, Long> {

}
