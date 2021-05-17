package challenge.backend.disney.service;

import challenge.backend.disney.dao.MoviesOrSeriesDao;
import challenge.backend.disney.domain.MoviesOrSeries;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MoviesOrSeriesServiceImpl implements MoviesOrSeriesService {

    @Autowired
    private MoviesOrSeriesDao moviesOrSeriesDao;

    @Override
    @Transactional(readOnly = true)
    public List<MoviesOrSeries> listMoviesOrSeries() {
        return (List<MoviesOrSeries>) moviesOrSeriesDao.findAll();
    }

    @Override
    @Transactional
    public void saveMoviesOrSeries(MoviesOrSeries moviesOrSeries) {
        moviesOrSeriesDao.save(moviesOrSeries);
    }

    @Override
    @Transactional
    public void deleteMoviesOrSeries(MoviesOrSeries moviesOrSeries) {
        moviesOrSeriesDao.delete(moviesOrSeries);
    }

    @Override
    @Transactional(readOnly = true)
    public MoviesOrSeries findMoviesOrSeries(MoviesOrSeries moviesOrSeries) {
        return moviesOrSeriesDao.findById(moviesOrSeries.getId_movies_or_series()).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public MoviesOrSeries detailsMoviesOrSeries(MoviesOrSeries moviesOrSeries) {
        return moviesOrSeriesDao.findById(moviesOrSeries.getId_movies_or_series()).orElse(null);
    }

}
