package Fleet.Management.controller;


import Fleet.Management.entities.TaxiEnt;
import Fleet.Management.services.TaxiserviceIMPL.TaxiServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaxiController {

    @Autowired
    private TaxiServiceImplementation taxiService; //servicio para manejar la lógica de los taxis

    @GetMapping("/taxis")
    public List<TaxiEnt> getAllTaxis() {
        return taxiService.getAllTaxis();
    }
}
