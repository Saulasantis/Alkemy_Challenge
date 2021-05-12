package challenge.backend.disney.web;

import challenge.backend.disney.domain.Characters;
import challenge.backend.disney.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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

    @PostMapping("/save_character")
    public String save_character(Characters characters) {
        characterService.saveCharacters(characters);
        return "redirect:list_of_characters";
    }

    @GetMapping("/edit_characters/{id_character}")
    public String edit_characters(Characters characters, Model model) {
        characters = characterService.findCharacters(characters);
        model.addAttribute("characters", characters);
        return "create_character";
    }

    @GetMapping("/delete_characters")
    public String delete_characters(Characters characters) {
        characterService.deleteCharacters(characters);
        return "redirect:/list_of_characters";
    }

}
