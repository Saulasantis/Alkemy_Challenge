package challenge.backend.disney.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

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

    @NotNull
    @Min(1)
    private int age;

    @NotNull
    @Min(1)
    private int weight;

    @NotEmpty
    private String story;

    @NotEmpty
    private String associated_movies;

}
