package Fleet.Management.services;

import Fleet.Management.entities.TaxiEnt;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TaxiServices {
     List<TaxiEnt> ConsultarTaxis();
  TaxiEnt CrearTaxi(int id);
  Page<TaxiEnt> getAllTaxis(Pageable pageable);
}
