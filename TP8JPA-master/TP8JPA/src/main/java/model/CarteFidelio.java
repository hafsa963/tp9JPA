package model;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import model.Client;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
public class CarteFidelio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String code;
    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;
    public CarteFidelio() {
    }

    public CarteFidelio(String code) {
        this.code = code;
    }

}