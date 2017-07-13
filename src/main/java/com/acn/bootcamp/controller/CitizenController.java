package com.acn.bootcamp.controller;
import com.acn.bootcamp.domain.Citizen;
import com.acn.bootcamp.service.impl.CitizenServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * Created by jaqcawaling on 7/11/17.
 */
@RestController
@RequestMapping("/api/citizens")
public class CitizenController {

    @Autowired
    CitizenServiceImpl citizenService;
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<?> addCitizen(@RequestBody Citizen citizen){
        citizenService.createCitizen(citizen);
        return new ResponseEntity<>("New citizen data has been added.", HttpStatus.OK);
    }

    @RequestMapping(value="/retrieve/list", method = RequestMethod.GET)
    public ResponseEntity<List<Citizen>> listallCitizens() {
        List<Citizen> citizens = citizenService.retrieveCitizens();
        return new ResponseEntity<>(citizens, HttpStatus.OK);
    }

    @RequestMapping(value="/retrieve/single/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> listCitizenById(@PathVariable("id") int id){
        Citizen citizen = citizenService.retrieveCitizenById(id);
        if (citizen.getId() != 0) {
            return new ResponseEntity<>(citizen, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("ERROR: Citizen not found.", HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value="/update", method = RequestMethod.POST)
    public ResponseEntity<?> updateCitizen(@RequestBody Citizen citizen){
        citizenService.updateCitizen(citizen);
        return new ResponseEntity<>("Existing citizen data has been updated.", HttpStatus.OK);
    }

    @RequestMapping(value="/delete/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> deleteCitizenById(@PathVariable("id") int id){
        citizenService.deleteCitizen(id);
        return new ResponseEntity<>("Existing citizen data has been deleted.", HttpStatus.OK);
    }

}
