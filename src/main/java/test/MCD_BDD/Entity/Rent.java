package test.MCD_BDD.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
public class Rent {
    @Id
    private Long id;

    private UUID uuid;

    private Date begins;
    private Date ends;

    @ManyToOne
    private Client client;

    @ManyToMany(mappedBy = "rents")
    private List<Article> articles = new ArrayList<>();

    @ManyToMany
    private List<Payment> payments = new ArrayList<>();
}
