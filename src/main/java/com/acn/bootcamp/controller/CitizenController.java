package com.acn.bootcamp.controller;

import com.acn.bootcamp.CitizenApiApp;
import com.acn.bootcamp.domain.Citizen;
import com.acn.bootcamp.service.impl.CitizenServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by jaqcawaling on 7/11/17.
 */
@RestController
@RequestMapping("/api/citizens")
public class CitizenController {

    public static final Logger logger = LoggerFactory.getLogger(CitizenController.class);

    @Autowired
    CitizenServiceImpl citizenService;

//    @RequestMapping(value = "/create/", method = RequestMethod.POST)
//    public ResponseEntity<List<Citizen>> createCitizen(@RequestBody Citizen citizen){
//        logger.info("Creating user: ", citizen);
//
//        try {
//            citizenService.createCitizen(citizen);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return
//    }
    @RequestMapping(value="/retrieve/list/", method = RequestMethod.GET)
    public ResponseEntity<List<Citizen>> retrieveCitizens() throws SQLException {
        List<Citizen> citizens = citizenService.retrieveCitizens();
        return new ResponseEntity<>(citizens, HttpStatus.OK);
    }


}
