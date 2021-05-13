package challenge.backend.disney.service;

import challenge.backend.disney.domain.Characters;
import java.util.List;

public interface CharacterService {

    public List<Characters> listCharacters();

    public void saveCharacters(Characters characters);

    public void deleteCharacters(Characters characters);

    public Characters findCharacters(Characters characters);

    public Characters detailsCharacters(Characters characters);

}
