package Fleet.Management.repository;

import Fleet.Management.entities.TaxiEnt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TaxiRepository extends JpaRepository<TaxiEnt, Integer> {
   @Query(value = "select * from taxis", nativeQuery = true)
   List<TaxiEnt> findByPlate(String plate);
}