package Fleet.Management.services;

import Fleet.Management.entities.TaxiEnt;

import java.util.List;

public interface TaxiServices {
     List<TaxiEnt> ConsultarTaxis();
  TaxiEnt CrearTaxi(int id);

}
