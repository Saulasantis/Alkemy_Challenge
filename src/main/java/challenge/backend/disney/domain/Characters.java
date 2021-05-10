package challenge.backend.disney.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Data
@Entity
@Table(name = "characters")
public class Characters implements Serializable {

    private static long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id_character;

    private String image;

    @NotEmpty
    private String name;

    private String age;
    private String wheigt;
    private String story;
    private String associated_movies;

}
