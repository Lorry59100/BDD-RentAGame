package test.MCD_BDD.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.util.Date;

@Entity
public class Article_Rent {
    @Id
    private Long id;

    @ManyToOne
    private Article article;

    @ManyToOne
    private Rent rent;

    private Date returned;
}
