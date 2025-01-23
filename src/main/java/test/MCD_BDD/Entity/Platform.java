package test.MCD_BDD.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Platform {
    @Id
    private Long id;

    private String name;

    @OneToMany(mappedBy = "platform")
    private List<Article> articles = new ArrayList<>();
}
