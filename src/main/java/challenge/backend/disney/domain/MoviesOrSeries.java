package challenge.backend.disney.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
@Table(name = "movies_or_series")
public class MoviesOrSeries implements Serializable {

    private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_movies;

    private String image;

    @NotEmpty
    private String title;

    @NotNull
    @Min(1895)
    @Max(2021)
    private int creation_date;

    @NotNull
    @Min(1)
    @Max(5)
    private int qualification;

    @NotEmpty
    private String associated_characters;

}
