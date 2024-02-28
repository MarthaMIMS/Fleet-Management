package Fleet.Management.repository;

import Fleet.Management.entities.LastLocationEnt;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LastLocationRepository extends JpaRepository<LastLocationEnt, Integer> {
    @Query(value = "SELECT t.id, t.plate, tr.longitude, tr.latitude, tr.date " +
            "FROM taxis t " +
            "JOIN trajectories tr ON t.id = tr.taxi_id " +
            "WHERE (tr.taxi_id, tr.date) IN (SELECT taxi_id, MAX(date) FROM trajectories GROUP BY taxi_id)", nativeQuery = true)
    Page<LastLocationEnt> findLastLocations(Pageable pageable);

}
/* @Query (value = "select * from trajectories where taxi_id = :taxiId AND TO_CHAR(date, 'DD-MM-YYYY') = :date", nativeQuery = true)
   public Page<TrajectoriesEnt> findByTaxi_id(int taxiId, String date, Pageable pageable);*/