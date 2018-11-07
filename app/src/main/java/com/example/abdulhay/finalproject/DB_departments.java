package com.example.abdulhay.finalproject;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by abdulhay on 11.01.18.
 */

public class DB_departments {
     public static DetailsOfStaff[] depart;


    static ArrayList<String> departments_NAMELIST;
    static ArrayList<String> departments_NUMLIST;
    static ArrayList<String> departments_ROOMLIST;
    static ArrayList<String> departments_EMAILLIST;


    public ArrayList<String> getDepartments_NAMELIST() {
        return departments_NAMELIST;
    }

    public ArrayList<String> getDepartments_NUMLIST() {
        return departments_NUMLIST;
    }

    public ArrayList<String> getDepartments_ROOMLIST() {
        return departments_ROOMLIST;
    }

    public ArrayList<String> getDepartments_EMAILLIST() {
        return departments_EMAILLIST;
    }

}
