package Fleet.Management.services.TaxiserviceIMPL;

import Fleet.Management.entities.LastLocationEnt;
import Fleet.Management.repository.LastLocationRepository;
import Fleet.Management.services.LastLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LastLoactionImplementation implements LastLocationService {
    @Autowired
    private LastLocationRepository repository;

    @Override
    public Page<LastLocationEnt> getAllLocation(Pageable pageable) {
        return this.repository.findLastLocations(pageable);
    }
}
