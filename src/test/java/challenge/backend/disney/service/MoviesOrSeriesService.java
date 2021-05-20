package challenge.backend.disney.service;

import challenge.backend.disney.domain.MoviesOrSeries;
import java.util.List;

public interface MoviesOrSeriesService {

    public List<MoviesOrSeries> listMoviesOrSeries();

    public void saveMoviesOrSeries(MoviesOrSeries moviesOrSeries);

    public void deleteMoviesOrSeries(MoviesOrSeries moviesOrSeries);

    public MoviesOrSeries findMoviesOrSeries(MoviesOrSeries moviesOrSeries);

    public MoviesOrSeries detailsMoviesOrSeries(MoviesOrSeries moviesOrSeries);

}
