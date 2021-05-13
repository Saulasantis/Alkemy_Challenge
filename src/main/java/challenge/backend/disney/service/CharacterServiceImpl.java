package challenge.backend.disney.service;

import challenge.backend.disney.dao.CharacterDao;
import challenge.backend.disney.domain.Characters;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CharacterServiceImpl implements CharacterService {

    @Autowired
    private CharacterDao characterDao;

    @Override
    @Transactional(readOnly = true)
    public List<Characters> listCharacters() {
        return (List<Characters>) characterDao.findAll();
    }

    @Override
    @Transactional
    public void saveCharacters(Characters characters) {
        characterDao.save(characters);
    }

    @Override
    @Transactional
    public void deleteCharacters(Characters characters) {
        characterDao.delete(characters);
    }

    @Override
    @Transactional(readOnly = true)
    public Characters findCharacters(Characters characters) {
        return characterDao.findById(characters.getId_character()).orElse(null);
    }

    @Override
    public Characters detailsCharacters(Characters characters) {
        return characterDao.findById(characters.getId_character()).orElse(null);
    }

}
