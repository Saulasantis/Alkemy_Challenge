package challenge.backend.disney.web;

import challenge.backend.disney.service.MoviesOrSeriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerListOfMovies {

    @Autowired
    private MoviesOrSeriesService moviesOrSeriesService;

    @GetMapping("/movies")
    public String movies(Model model) {
        var movies_or_series = moviesOrSeriesService.listMoviesOrSeries();
        model.addAttribute("movies_or_series", movies_or_series);
        return "list_of_movies";
    }

}
