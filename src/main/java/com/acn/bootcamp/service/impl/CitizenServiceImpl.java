package com.acn.bootcamp.service.impl;



import com.acn.bootcamp.dao.CitizenDAO;
import com.acn.bootcamp.domain.Citizen;
import com.acn.bootcamp.service.CitizenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by jaqcawaling on 7/7/17.
 */
@Service
public class CitizenServiceImpl implements CitizenService{

    CitizenDAO daoFunction = new CitizenDAO();

    @Override
    public Citizen retrieveCitizenById(int id) throws SQLException {
        return daoFunction.retrieveCitizenById(id);
    }

    @Override
    public List<Citizen> retrieveCitizens() throws SQLException {
        return daoFunction.retrieveCitizens();
    }

    @Override
    public List<Citizen> createCitizen(Citizen citizen) throws SQLException {
        return daoFunction.createCitizen(citizen);
    }

    @Override
    public List<Citizen> updateCitizen(Citizen citizen) throws SQLException {
        return daoFunction.updateCitizen(citizen);
    }

    @Override
    public List<Citizen> deleteCitizen(int id) throws SQLException {
        return daoFunction.deleteCitizen(id);
    }

}

