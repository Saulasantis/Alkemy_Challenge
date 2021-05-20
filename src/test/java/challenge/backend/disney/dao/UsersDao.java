package challenge.backend.disney.dao;

import challenge.backend.disney.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersDao extends JpaRepository<Users, Long> {

    Users findByUsername(String username);

}
