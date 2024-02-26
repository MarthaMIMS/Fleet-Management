package Fleet.Management.controller;

import Fleet.Management.entities.TrajectoriesEnt;
import Fleet.Management.services.TaxiserviceIMPL.TrajectoriesImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TrajectoriesController {
    @Autowired
    private TrajectoriesImplementation trajectoriesImplementation;
    @GetMapping("/trajectories")
        public Page<TrajectoriesEnt> getAllTrajectories(@RequestParam() int taxiId , @RequestParam () String date , @RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size){
        Pageable pageable = PageRequest.of(page, size);
        return trajectoriesImplementation.getAllTrajectories(taxiId , date, pageable);
    }

}
