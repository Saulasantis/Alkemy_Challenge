package challenge.backend.disney.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerCharacters {

    @GetMapping("/")
    public String Home(Model model) {
        return "index";
    }

    @GetMapping("/list_of_characters")
    public String list_of_characters(Model model) {
        return "list_of_characters";
    }

}
