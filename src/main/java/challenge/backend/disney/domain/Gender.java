package challenge.backend.disney.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Data
@Entity
@Table(name = "gender")
public class Gender implements Serializable {

    private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_gender;

    private String name;

    @NotEmpty
    private String image;

    @NotEmpty
    private String associated_movies;

}
