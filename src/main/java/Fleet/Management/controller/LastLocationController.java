package Fleet.Management.controller;

import Fleet.Management.entities.LastLocationEnt;
import Fleet.Management.services.TaxiserviceIMPL.LastLoactionImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LastLocationController {
@Autowired
    private LastLoactionImplementation lastLoactionImplementation;
    @GetMapping("/lastLocations")
    public Page<LastLocationEnt> getLastLocations(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size) {
        Pageable pageable = PageRequest.of(page, size);
        return lastLoactionImplementation.getAllLocation(pageable);
}
    }
