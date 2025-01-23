package test.MCD_BDD.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Payment {
    @Id
    private Long id;

    private String name;

    @OneToMany(mappedBy = "payment")
    private List<Rent_Payment> rentPayments = new ArrayList<>();
}
