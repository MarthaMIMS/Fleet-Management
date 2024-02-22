package Fleet.Management.entities;

//import javax.persistence.*;

import jakarta.persistence.*;

@Entity
@Table(name = "taxis")
public class TaxiEnt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "plate")
    private String plate;

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

}