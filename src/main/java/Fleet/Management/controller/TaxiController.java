package Fleet.Management.controller;


import Fleet.Management.entities.TaxiEnt;

import Fleet.Management.services.TaxiserviceIMPL.TaxiServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaxiController {

    @Autowired
    private TaxiServiceImplementation taxiService; //servicio para manejar la lógica de los taxis

    @GetMapping("/taxis")
    public Page<TaxiEnt> getAllTaxis(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size) {
        Pageable pageable = PageRequest.of(page, size);
        return taxiService.getAllTaxis(pageable);
        //
    }
}
