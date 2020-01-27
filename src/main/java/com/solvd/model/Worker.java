package com.solvd.model;

import com.solvd.IWorker;
import org.apache.log4j.Logger;

public class Worker implements IWorker {

    private static final Logger LOGGER = Logger.getLogger(Worker.class);

    private int id;
    private String firstName;
    private String lastName;
    private String position;
    private int age;
    private int workExperience;
    private Address address;

    public Worker() {
    }

    public Worker (String firstName, String lastName, int age, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

    public Worker (String firstName, String lastName, String position, int age, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.age = age;
        this.address = address;
    }

    @Override
    public void work() {
        LOGGER.info("Worker " + lastName + " is working ");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
