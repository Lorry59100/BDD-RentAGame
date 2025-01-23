package test.MCD_BDD.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
public class Client {
    @Id
    private Long id;

    private UUID uuid;

    @Column (unique = true)
    private String email;

    private String name;

    private Date register;

    @OneToMany(mappedBy = "client")
    private List<Rent> rents = new ArrayList<>();
}
