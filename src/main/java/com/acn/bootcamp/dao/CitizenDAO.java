package com.acn.bootcamp.dao;

import com.acn.bootcamp.config.DatabaseConnection;
import com.acn.bootcamp.domain.Citizen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
//ENDPOINT AND DAO.
/**
 * Created by jaqcawaling on 7/6/17.
 */
@SuppressWarnings("unchecked")
public class CitizenDAO{

    DatabaseConnection dbConn = new DatabaseConnection();

    private static PreparedStatement pstmt = null;
    private List<Citizen> citizens = new ArrayList<>();

    public Citizen retrieveCitizenById(int id) throws SQLException {
        dbConn.connect();
        Citizen citizen = new Citizen();
        pstmt = dbConn.connect().prepareStatement("SELECT * FROM citizen WHERE id = ?");
        pstmt.setObject(1, id);
        ResultSet rs = pstmt.executeQuery();
        while(rs.next()) {
            citizen.setId(rs.getInt("id"));
            citizen.setFirst_name(rs.getString("first_name"));
            citizen.setLast_name(rs.getString("last_name"));
            citizen.setAge(rs.getInt("age"));
        }

        return citizen;

    }

    public List<Citizen> retrieveCitizens() throws SQLException {
        dbConn.connect();
        pstmt = dbConn.connect().prepareStatement("SELECT * FROM citizen");
        ResultSet rs = pstmt.executeQuery();
        while(rs.next()) {
            Citizen citizen = new Citizen();
            citizen.setId(rs.getInt("id"));
            citizen.setFirst_name(rs.getString("first_name"));
            citizen.setLast_name(rs.getString("last_name"));
            citizen.setAge(rs.getInt("age"));
            citizens.add(citizen);
        }

        return citizens;
    }

    public List<Citizen> createCitizen(Citizen citizen) throws SQLException {

        dbConn.connect();
        pstmt = dbConn.connect().prepareStatement("INSERT INTO citizen (first_name, last_name, age) VALUES (?,?,?)");
        pstmt.setString(1, citizen.getFirst_name());
        pstmt.setString(2, citizen.getLast_name());
        pstmt.setInt(3, citizen.getAge());
        pstmt.executeUpdate();

        return retrieveCitizens();
    }

    public List<Citizen> deleteCitizen(int id) throws SQLException {

        dbConn.connect();
        pstmt = dbConn.connect().prepareStatement("DELETE FROM citizen WHERE id = ?");
        pstmt.setInt(1, id);
        pstmt.executeUpdate();

        return retrieveCitizens();
    }

    public List<Citizen> updateCitizen(Citizen citizen) throws SQLException {

        dbConn.connect();
        pstmt = dbConn.connect().prepareStatement("UPDATE citizen SET first_name = ?, last_name = ?, age = ? WHERE id = ?");
        pstmt.setString(1, citizen.getFirst_name());
        pstmt.setString(2, citizen.getLast_name());
        pstmt.setInt(3, citizen.getAge());
        pstmt.setInt(4, citizen.getId());
        pstmt.executeUpdate();

        return retrieveCitizens();
    }



}
