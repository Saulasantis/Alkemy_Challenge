package challenge.backend.disney.web;

import challenge.backend.disney.domain.MoviesOrSeries;
import challenge.backend.disney.service.MoviesOrSeriesService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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

    @GetMapping("/add_movies")
    public String add_movies(MoviesOrSeries moviesOrSeries) {
        return "create_movies";
    }

    @PostMapping("/save_movies")
    public String save_movies(@Valid MoviesOrSeries moviesOrSeries, BindingResult result) {
        if (result.hasErrors()) {
            return "create_movies";
        }
        moviesOrSeriesService.saveMoviesOrSeries(moviesOrSeries);
        return "redirect:/movies";
    }

    @GetMapping("/edit_movies")
    public String edit_movies(MoviesOrSeries moviesOrSeries, Model model) {
        moviesOrSeries = moviesOrSeriesService.findMoviesOrSeries(moviesOrSeries);
        model.addAttribute("moviesOrSeries", moviesOrSeries);
        return "edit_movies";
    }

    @GetMapping("/delete_movies")
    public String delete_movies(MoviesOrSeries moviesOrSeries) {
        moviesOrSeriesService.deleteMoviesOrSeries(moviesOrSeries);
        return "redirect:/movies";
    }

    @GetMapping("/details_movies")
    public String details_movies(MoviesOrSeries moviesOrSeries, Model model) {
        moviesOrSeries = moviesOrSeriesService.findMoviesOrSeries(moviesOrSeries);
        model.addAttribute("moviesOrSeries", moviesOrSeries);
        return "details_of_movies";
    }
}
