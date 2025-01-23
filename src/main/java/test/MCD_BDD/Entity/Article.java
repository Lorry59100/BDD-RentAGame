package test.MCD_BDD.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
public class Article {
    @Id
    private Long id;

    private UUID uuid;

    private int stock;

    private double price;

    private String imageURL;

    private Date release;

    @JsonIgnore
    @ManyToMany
    private List<Rent> rents = new ArrayList<>();

    @ManyToOne
    private Game game;

    @ManyToOne
    private Platform platform;
}
