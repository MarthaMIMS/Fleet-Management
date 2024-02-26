package Fleet.Management.services.TaxiserviceIMPL;

import Fleet.Management.entities.TrajectoriesEnt;
import Fleet.Management.repository.TrajectoriesRepository;
import Fleet.Management.services.TrajectoriesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class TrajectoriesImplementation implements TrajectoriesServices {
    @Autowired
    private TrajectoriesRepository repository;

    @Override
    public Page<TrajectoriesEnt> getAllTrajectories(int taxiId, String date, Pageable pageable) {return this.repository.findByTaxi_id(taxiId, date, pageable);
    }

}
