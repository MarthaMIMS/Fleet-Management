package Fleet.Management.services.TaxiserviceIMPL;

import Fleet.Management.entities.TaxiEnt;
import Fleet.Management.repository.TaxiRepository;
import Fleet.Management.services.TaxiServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaxiServiceImplementation implements TaxiServices {

    @Autowired
    private  TaxiRepository repository;

    @Override
    public List<TaxiEnt> ConsultarTaxis() {
        return this.repository.findAll();
    }

    @Override
    public TaxiEnt CrearTaxi(int id) {
        return null;
    }

    @Override
    public Page<TaxiEnt> getAllTaxis(Pageable pageable) {
        return this.repository.findAll(pageable);
    }
}
//@Override
/*public Page<TaxiEnt> getAllTaxis(Pageable pageable) {
    return  this.repository.findAll(pageable);
}*/
