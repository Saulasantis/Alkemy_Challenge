package challenge.backend.disney.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_users;

    @NotEmpty
    private String user_name;

    @NotEmpty
    private String password;

    @OneToMany
    @JoinColumn(name = "id_users")
    private List<Rol> roles;

}
