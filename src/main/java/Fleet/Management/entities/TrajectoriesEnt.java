package Fleet.Management.entities;


import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name="trajectories")
public class TrajectoriesEnt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="id")
    private Long id;
@Column(name = "taxi_id")
    private Integer taxi_id;
@Column(name = "date")
    private Timestamp timestamp;
@Column(name = "longitude")
    private double longitude;
@Column(name = "latitude")
    private double latitude;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTaxi_id() {
        return taxi_id;
    }

    public void setTaxi_id(Integer taxi_id) {
        this.taxi_id = taxi_id;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
}
