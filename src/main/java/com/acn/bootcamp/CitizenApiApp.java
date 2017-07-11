package com.acn.bootcamp;

import com.acn.bootcamp.domain.Citizen;
import com.acn.bootcamp.service.CitizenService;
import com.acn.bootcamp.service.impl.CitizenServiceImpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jaqcawaling on 7/6/17.
 */
    @Configuration
    @EnableAutoConfiguration
    @ComponentScan
    @SpringBootApplication(scanBasePackages={"com.acn.bootcamp.CitizenApiApp"})
    public class CitizenApiApp{
        public static void main(String[] args){
            SpringApplication.run(CitizenApiApp.class, args);
        }

//    static List<Citizen> citizens = new ArrayList<>();
//    public static void main(String args[]){
//        startApp();
//    }
//
//    private static void startApp(){
//        System.out.println("------------------------------Welcome to Citizen Inventory!------------------------------\n");
//        System.out.println("What do you want to do?\n");
//        System.out.println("[1]\t Retrieve citizen's data by ID");
//        System.out.println("[2]\t Retrieve all citizens' data");
//        System.out.println("[3]\t Create new citizen data");
//        System.out.println("[4]\t Update an existing citizen data");
//        System.out.println("[5]\t Delete an existing citizen data");
//        System.out.println("[6]\t Close the app\n");
//        System.out.print("Choice: ");
//        selectChoice();
//    }
//
//    private static void selectChoice() {
//        try {
//            Scanner in = new Scanner(System.in);
//            int input = in.nextInt();
//
//            switch (input) {
//                case 1:
//                    retrieveByIDMethod(in);
//                    break;
//
//                case 2:
//                    retrieveAllMethod();
//                    break;
//
//                case 3:
//                    createMethod(in);
//                    break;
//
//                case 4: //UPDATE
//                    updateMethod(in);
//                    break;
//
//                case 5:
//                    deleteMethod(in);
//                    break;
//
//                case 6:
//                    System.out.println("Closing the application...");
//                    break;
//
//                default:
//                    System.out.println("Please choose from options [1] ~ [6].");
//                    startApp();
//            }
//        } catch (InputMismatchException e){
//            System.out.println("ERROR: Non-numeric character detected.\n");
//            startApp();
//        }
//    }
//
//    private static void retrieveByIDMethod(Scanner in){
//        CitizenService citizenService = new CitizenServiceImpl();
//
//        try {
//            System.out.print("Enter citizen number: ");
//            int id = in.nextInt();
//            Citizen citizen = citizenService.retrieveCitizenById(id);
//            if(id == citizen.getId()) {
//                System.out.println(citizen.getComment());
//            } else {
//                throw new SQLException();
//            }
//        } catch (SQLException e) {
//            System.out.println("ERROR: Action aborted. Citizen not found.\n");
//        } catch (InputMismatchException e){
//            System.out.println("ERROR: Enter numeric data.\n");
//        } finally {
//            startApp();
//        }
//    }
//
//    private static void retrieveAllMethod() {
//        CitizenService citizenService = new CitizenServiceImpl();
//
//        try {
//            citizens = citizenService.retrieveCitizens();
//            for(Citizen citizen: citizens)
//                System.out.println(
//                        citizen.getId() +"\t"+ citizen.getFirst_name() +"\t"+ citizen.getLast_name() +"\t"+ citizen.getAge()
//                );
//
//        } catch (SQLException e) {
//            System.out.println("ERROR: Action aborted.");
//        } finally {
//            startApp();
//        }
//    }
//
//    private static void createMethod(Scanner in){
//        CitizenService citizenService = new CitizenServiceImpl();
//        Citizen citizen = new Citizen();
//        Scanner withSpace = new Scanner(System.in);
//        try {
//            System.out.print("Enter citizen's first name: ");
//            String first_name = withSpace.nextLine();
//            System.out.print("Enter citizen's last name: ");
//            String last_name = withSpace.nextLine();
//            System.out.print("Enter citizen's age: ");
//            int age = in.nextInt();
//
//            citizen.setFirst_name(first_name);
//            citizen.setLast_name(last_name);
//            citizen.setAge(age);
//
//            citizenService.createCitizen(citizen);
//            System.out.println("New citizen data created.");
//
//        } catch (SQLException e) {
//            System.out.println("ERROR: Action aborted.\n");
//        } catch (InputMismatchException e){
//            System.out.println("ERROR: Enter numeric data.\n");
//        } finally {
//            startApp();
//        }
//    }
//
//    private static void updateMethod(Scanner in){
//        CitizenService citizenService = new CitizenServiceImpl();
//        Citizen citizen = new Citizen();
//        Scanner withSpace = new Scanner(System.in);
//        try {
//            System.out.print("Enter citizen's number: ");
//            int id = in.nextInt();
//            citizen.setId(id);
//
//            System.out.print("Enter citizen's first name: ");
//            String first_name = withSpace.nextLine();
//            citizen.setFirst_name(first_name);
//
//
//            System.out.print("Enter citizen's last name: ");
//            String last_name = withSpace.nextLine();
//            citizen.setLast_name(last_name);
//
//
//            System.out.print("Enter citizen's age: ");
//            int age = in.nextInt();
//            citizen.setAge(age);
//
//            citizenService.updateCitizen(citizen);
//            System.out.println("Existing data has been updated.");
//
//
//        } catch (SQLException e) {
//            System.out.println("ERROR: Action aborted. Citizen not found.\n");
//        } catch (InputMismatchException e){
//            System.out.println("ERROR: Enter numeric data.\n");
//        } finally {
//            startApp();
//        }
//    }
//
//    private static void deleteMethod(Scanner in){
//        CitizenService citizenService = new CitizenServiceImpl();
//
//        try {
//            System.out.print("Enter the citizen's id number: ");
//            int id = in.nextInt();
//
//            citizenService.deleteCitizen(id);
//            System.out.println("Existing data has been deleted.");
//
//        } catch (SQLException e) {
//            System.out.println("ERROR: Action aborted. Citizen not found.\n");
//        } catch (InputMismatchException e){
//            System.out.println("ERROR: Enter numeric data.\n");
//        } finally {
//            startApp();
//        }
//    }
}
