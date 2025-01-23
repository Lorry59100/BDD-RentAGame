package test.MCD_BDD.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

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

    @OneToMany(mappedBy = "article")
    private List <Article_Rent> articleRent = new ArrayList<>();

    @ManyToOne
    private Game game;

    @ManyToOne
    private Platform platform;
}
