package challenge.backend.disney.web;

import challenge.backend.disney.dao.CharacterDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerCharacters {

    @Autowired
    private CharacterDao characterDao;

    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }

    @GetMapping("/list_of_characters")
    public String list_of_characters(Model model) {
        var character = characterDao.findAll();
        model.addAttribute("character", character);
        return "list_of_characters";
    }

}
