package test.MCD_BDD.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Payment {
    @Id
    private Long id;

    private String name;

    @JsonIgnore
    @ManyToMany(mappedBy = "payments")
    private List<Rent> rents = new ArrayList<>();
}
