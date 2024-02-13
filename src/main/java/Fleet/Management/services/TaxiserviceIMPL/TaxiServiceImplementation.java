package Fleet.Management.services.TaxiserviceIMPL;

import Fleet.Management.entities.TaxiEnt;
import Fleet.Management.repository.TaxiRepository;
import Fleet.Management.services.TaxiServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaxiServiceImplementation implements TaxiServices {

    @Autowired
    private final TaxiRepository repository;

    public TaxiServiceImplementation(TaxiRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<TaxiEnt> ConsultarTaxis() {
        return this.repository.findAll();
    }

    @Override
    public TaxiEnt CrearTaxi(int id) {
        return null;
    }

    public List<TaxiEnt> getAllTaxis() {
        return null;
    }
}
