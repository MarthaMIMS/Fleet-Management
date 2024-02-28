package Fleet.Management.services;

import Fleet.Management.entities.LastLocationEnt;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface LastLocationService {
    Page<LastLocationEnt> getAllLocation(Pageable pageable);
}
