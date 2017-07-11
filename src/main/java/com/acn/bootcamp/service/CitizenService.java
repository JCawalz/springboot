package com.acn.bootcamp.service;

import com.acn.bootcamp.domain.Citizen;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by jaqcawaling on 7/6/17.
 */
public interface CitizenService {

    Citizen retrieveCitizenById(int id) throws SQLException;

    List<Citizen> retrieveCitizens() throws SQLException;

    List<Citizen> createCitizen(Citizen citizen) throws SQLException;

    List<Citizen> updateCitizen(Citizen citizen) throws SQLException;

    List<Citizen> deleteCitizen(int id) throws SQLException;

}
//make array list
// remove RS palit with get and object looping