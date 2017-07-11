package com.acn.bootcamp.domain;

/**
 * Created by jaqcawaling on 7/6/17.
 */
public class Citizen {

    private int id;

    private String first_name;

    private String last_name;

    private int age;

    private String comment;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLast_name() {

        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {

        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }


    public String getComment() {

        comment = getLast_name() +", "+ getFirst_name()+ " is "+ getAge()+" years old with ID of "+ getId();

        return comment;
    }
}
