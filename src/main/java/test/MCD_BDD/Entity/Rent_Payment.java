package test.MCD_BDD.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Rent_Payment {
    @Id
    private Long id;

    @ManyToOne
    private Payment payment;

    @ManyToOne
    private Rent rent;

    private double amount;
}
