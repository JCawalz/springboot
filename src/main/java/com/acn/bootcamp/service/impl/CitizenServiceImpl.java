package com.acn.bootcamp.service.impl;



import com.acn.bootcamp.dao.CitizenDAO;
import com.acn.bootcamp.domain.Citizen;
import com.acn.bootcamp.service.CitizenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jaqcawaling on 7/7/17.
 */
@Service
public class CitizenServiceImpl implements CitizenService{



    @Override
    public Citizen retrieveCitizenById(int id){
        CitizenDAO daoFunction = new CitizenDAO();
        Citizen citizen = null;
        try {
            citizen = daoFunction.retrieveCitizenById(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return citizen;
    }

    @Override
    public List<Citizen> retrieveCitizens(){
        CitizenDAO daoFunction = new CitizenDAO();
        List<Citizen> citizens = new ArrayList<>();
        try {
            citizens = daoFunction.retrieveCitizens();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return citizens;
    }

    @Override
    public List<Citizen> createCitizen(Citizen citizen){
        CitizenDAO daoFunction = new CitizenDAO();
        List<Citizen> citizens = new ArrayList<>();
        try {
            citizens = daoFunction.createCitizen(citizen);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  citizens;
    }

    @Override
    public List<Citizen> updateCitizen(Citizen citizen){
        CitizenDAO daoFunction = new CitizenDAO();
        List<Citizen> citizens = new ArrayList<>();
        try {
            citizens = daoFunction.updateCitizen(citizen);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return citizens;
    }

    @Override
    public List<Citizen> deleteCitizen(int id){
        CitizenDAO daoFunction = new CitizenDAO();
        List<Citizen> citizens = new ArrayList<>();
        try {
            citizens = daoFunction.deleteCitizen(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  citizens;
    }

}

