package org.torryharris;

import org.springframework.stereotype.Component;

@Component("address")
public class Address {

    private String doorNo;
    private String street;
    private String  city;
    private String state;
    private String  pin;

    public Address() {
    }

    public String getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "Address{" +
                "doorNo='" + doorNo + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pin='" + pin + '\'' +
                '}';
    }
}
