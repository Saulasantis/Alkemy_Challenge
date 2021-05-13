package challenge.backend.disney.service;

import challenge.backend.disney.dao.UserDao;
import challenge.backend.disney.domain.Rol;
import challenge.backend.disney.domain.Users;
import java.util.ArrayList;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("userDetailsService")
@Slf4j
public class UserService implements UserDetailsService {

    @Autowired
    private UserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = userDao.findByUsername(username);

        if (user == null) {
            throw new UsernameNotFoundException(username);

        }

        var roles = new ArrayList<GrantedAuthority>();

        for (Rol rol : user.getRoles()) {
            roles.add(new SimpleGrantedAuthority(rol.getName()));

        }

        return new User(user.getUser_name(), user.getPassword(), roles);
    }

}
