package challenge.backend.disney.web;

import challenge.backend.disney.domain.Characters;
import challenge.backend.disney.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerCharacters {

    @Autowired
    private CharacterService characterService;

    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }

    @GetMapping("/list_of_characters")
    public String list_of_characters(Model model) {
        var character = characterService.listCharacters();
        model.addAttribute("character", character);
        return "list_of_characters";
    }

    @GetMapping("/add_character")
    public String add_character(Characters characters) {
        return "create_character";
    }

}
