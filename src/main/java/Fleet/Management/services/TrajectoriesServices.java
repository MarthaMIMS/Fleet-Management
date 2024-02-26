package Fleet.Management.services;

import Fleet.Management.entities.TrajectoriesEnt;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TrajectoriesServices {

    Page<TrajectoriesEnt> getAllTrajectories(int taxiId, String date, Pageable pageable);

}
