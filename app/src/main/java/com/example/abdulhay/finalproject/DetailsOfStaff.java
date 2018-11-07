package com.example.abdulhay.finalproject;

/**
 * Created by abdulhay on 09.01.18.
 */

public class DetailsOfStaff {
    String name, room;
    String telNumber;
    String email;

    public DetailsOfStaff(String name, String telNumber, String room, String email) {

        this.name = name;
        this.telNumber = telNumber;
        this.room = room;
        this.email = email;
    }




    public String getName() {
        return name;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public String getRoom() {
        return room;
    }

    public String getEmail() {
        return email;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
