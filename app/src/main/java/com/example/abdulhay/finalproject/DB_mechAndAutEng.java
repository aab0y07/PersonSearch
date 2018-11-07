package com.example.abdulhay.finalproject;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by abdulhay on 11.01.18.
 */

public class DB_mechAndAutEng extends DB_departments {
    private final static DetailsOfStaff[] mechAndAutEng ={
            new DetailsOfStaff("Prof. Dr. Mario Adamschik", "07315028007", "B 213", "adamschik@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Klaus Allmendinger", "07315028115", "B 110c", "allmendinger@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Thomas Baier", "07315028137", "C 017", "baer@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Manuela Boin", "07315028037", "C 018", "boin@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Hayri Damarit¸rk", "07315028286", "B 110d", "damarituerk@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Christian Dettmann", "07315028106", "A 302", "dettmann@hs-ulm.de" ),
            new DetailsOfStaff("Frau Helga Dirr", "07315028131", "B 212c", "dirr@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dipl.-Ing. Stephanus Faller", "07315028015", "F 06", "faller@hs-ulm.de" ),
            new DetailsOfStaff("Frau Susanne Gall", "07315028111", "B 212a", "gall@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Gottfried Goebel", "07315028258", "D 03", "goebel@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Bernd Graf", "07315028038", "B 105", "bgraf@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Thomas Hofmann", "07315028268", "D03", "th.hofmann@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Dietmar Imbsweiler", "07315028019", "B 105", "imbsweiler@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Markus Kalenborn", "07315028229", "D 03", "kalenborn@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Hubert Mantz", "07315028539", "Q 233", "mantz@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Thomas Mayer", "07315028099", "B 105", "mayer@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Mathias Niebergall", "07315028469", "F 02", "niebergall@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Ralf Otte", "07315028663", "B 213", "otte@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Ulrich Schrade", "07315016951", "F 03", "schrade@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Wolfgang Schulz", "07315028033", "D 03", "wschulz@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dipl.-Ing. Stephan Schwantes", "07315028128", "B 206", "schwantes@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Gerald Stengele", "07315028153", "B 110b", "stengele@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Ulrich Straub", "07315028522", "Q 205", "straub@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Jochen Thˆnniﬂen", "07315016813", "F 09b", "thoennissen@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Robert Watty", "07315028120", "B 212d", "watty@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Ursula Weiﬂ", "07315028090", "B 210b", "weiss@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Bernd Wender", "07315028116", "B 214", "wender@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Joachim Werner", "07315028138", "C 016", "werner@hs-ulm.de" ),
    };
    static {
        depart = mechAndAutEng;
    }

    private final static ArrayList<String> mechAndAutEng_NAMELIST= new ArrayList <String>(mechAndAutEng.length);
    private final static ArrayList<String> mechAndAutEng_NUMLIST = new ArrayList <String>(mechAndAutEng.length);;
    private final static ArrayList<String> mechAndAutEng_ROOMLIST = new ArrayList <String>(mechAndAutEng.length);;
    private final static ArrayList<String> mechAndAutEng_EMAILLIST = new ArrayList <String>(mechAndAutEng.length);;

    static {
        for (DetailsOfStaff r : mechAndAutEng) {
            mechAndAutEng_NAMELIST.add(r.getName());
        }

        departments_NAMELIST = mechAndAutEng_NAMELIST;

    }

    static {
        for (DetailsOfStaff r : mechAndAutEng) {
            mechAndAutEng_NUMLIST.add(r.getTelNumber());
        }

        departments_NUMLIST = mechAndAutEng_NUMLIST;

    }

    static {
        for (DetailsOfStaff r : mechAndAutEng) {
            mechAndAutEng_ROOMLIST.add(r.getRoom());
        }

        departments_ROOMLIST = mechAndAutEng_ROOMLIST;

    }



    static {
        for (DetailsOfStaff r : mechAndAutEng) {
            mechAndAutEng_EMAILLIST.add(r.getEmail());
        }

        departments_EMAILLIST = mechAndAutEng_EMAILLIST;

    }


    public ArrayList<String> getMechAndAutEng_NAMELIST() {
        return mechAndAutEng_NAMELIST;
    }

    public ArrayList<String> getMechAndAutEng_NUMLIST() {
        return mechAndAutEng_NUMLIST;
    }

    public ArrayList<String> getMechAndAutEng_ROOMLIST() {
        return mechAndAutEng_ROOMLIST;
    }

    public ArrayList<String> getMechAndAutEng_EMAILLIST() {
        return mechAndAutEng_EMAILLIST;
    }

}
