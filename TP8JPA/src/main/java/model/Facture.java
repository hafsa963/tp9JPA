package model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private double amount;
    private String description;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
    public Facture() {
    }

    public Facture(double amount, String description) {
        this.id=id;
        this.amount = amount;
        this.description = description;
    }


    public double getAmount() {
        return amount;
    }
}

