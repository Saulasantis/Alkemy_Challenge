package challenge.backend.disney.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Data
@Entity
@Table(name = "characters")
public class Characters implements Serializable {

    private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_character;

    private String image;

    @NotEmpty
    private String name;

    @NotEmpty
    private Integer age;

    @NotEmpty
    private Integer wheigt;

    @NotEmpty
    private String story;

    @NotEmpty
    private String associated_movies;

}
