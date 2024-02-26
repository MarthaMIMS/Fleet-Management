package Fleet.Management.repository;

import Fleet.Management.entities.TrajectoriesEnt;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrajectoriesRepository extends JpaRepository<TrajectoriesEnt, Integer> {
 @Query (value = "select * from trajectories where taxi_id = :taxiId AND TO_CHAR(date, 'DD-MM-YYYY') = :date", nativeQuery = true)
   public Page<TrajectoriesEnt> findByTaxi_id(int taxiId, String date, Pageable pageable);
   // @Query
}
