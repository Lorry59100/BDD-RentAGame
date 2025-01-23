package test.MCD_BDD.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Category {
    @Id
    private Long id;

    private String name;

    @JsonIgnore
    @ManyToMany
    private List<Game> games = new ArrayList<>();
}
