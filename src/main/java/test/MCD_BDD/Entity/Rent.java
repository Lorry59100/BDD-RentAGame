package test.MCD_BDD.Entity;

import jakarta.persistence.*;

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

    @OneToMany(mappedBy = "rent")
    private List<Article_Rent> articleRents = new ArrayList<>();

    @OneToMany(mappedBy = "rent")
    private List<Rent_Payment> rentPayments = new ArrayList<>();
}
