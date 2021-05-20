package challenge.backend.disney.dao;

import challenge.backend.disney.domain.Characters;
import org.springframework.data.repository.CrudRepository;

public interface CharacterDao extends CrudRepository<Characters, Long> {

}
