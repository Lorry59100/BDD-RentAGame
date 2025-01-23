package test.MCD_BDD.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
public class Game {
    @Id
    private Long id;

    private UUID uuid;

    private String name;

    private String description;

    @OneToMany(mappedBy = "game")
    private List<Article> articles = new ArrayList<>();

    @ManyToMany(mappedBy = "games")
    private List<Category> categories = new ArrayList<>();
}
