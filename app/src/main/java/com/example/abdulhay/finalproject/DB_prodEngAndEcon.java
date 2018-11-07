package com.example.abdulhay.finalproject;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by abdulhay on 11.01.18.
 */

public class DB_prodEngAndEcon extends DB_departments {
    private final static DetailsOfStaff[] prodEngAndEcon ={
            new DetailsOfStaff("Prof. Dr. Raphael Arlitt", "07315028403", "M 101", "arlitt@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Norbert Bartneck", "07315028010", "B 310d", "bartneck@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Hartwig Baumg‰rtel", "07315028281", "B 310d", "baumgaertel@hs-ulm.de" ),
            new DetailsOfStaff("Frau Anita Berger", "07315028466", "B 306", "berger@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Franz Bˆhm", "07315028124", "B 307", "boehm@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Dieter Buchberger", "07315028193", "B 310b", "buchberger@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Walter Commerell", "07315028417", "N 201", "commerell@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Christian Dietrich", "07315028130", "F 12", "dietrich@hs-ulm.de" ),
            new DetailsOfStaff("Frau Graziella Ebach", "07315028121", "B 305a", "ebach@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Klaus-Peter Franke", "07315028296", "B 313", "franke@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. G¸nter Gramlich", "07315028496", "A 305b", "gramlich@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Helmut Hartberger", "07315028195", "B 310c", "hartberger@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Gerd Heilscher", "07315016981", "P 205", "heilscher@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Manfred H¸ser", "07315028473", "B 314", "hueser@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Michael Kaul", "07315028095", "B 110a", "kaul@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Jens Kiefer", "07315028188", "F 11", "jens.kiefer@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Josef Kurfess", "07315028126", "F 02", "kurfess@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Gerhard Mengedoht", "07315028358", "P 201", "mengedoht@hs-ulm.de" ),
            new DetailsOfStaff(" Frau Marion Moebes", "07315028485", "B 205a", "moebes@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Martin M¸ller", "07315028354", "O 201", "martin.mueller@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Norbert Rohbeck", "07315028240", "B 310a", "rohbeck@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Klaus Schlickenrieder", "07315028145", "F 13", "schlickenrieder@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Sven Vˆlker", "07315028031", "B 314", "voelker@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Ralf Voﬂ", "07315028249", "F 11", "voss@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Manfred Wehrheim", "07315028092", "F 13", "wehrheim@hs-ulm.de" )};
    static {
        depart = prodEngAndEcon;
    }
    private final static ArrayList<String> prodEngAndEcon_NAMELIST= new ArrayList <String>(prodEngAndEcon.length);
    private final static ArrayList<String> prodEngAndEcon_NUMLIST = new ArrayList <String>(prodEngAndEcon.length);;
    private final static ArrayList<String> prodEngAndEcon_ROOMLIST = new ArrayList <String>(prodEngAndEcon.length);;
    private final static ArrayList<String> prodEngAndEcon_EMAILLIST = new ArrayList <String>(prodEngAndEcon.length);;

    static {
        for (DetailsOfStaff r : prodEngAndEcon) {
            prodEngAndEcon_NAMELIST.add(r.getName());
        }

        departments_NAMELIST = prodEngAndEcon_NAMELIST;

    }

    static {
        for (DetailsOfStaff r : prodEngAndEcon) {
            prodEngAndEcon_NUMLIST.add(r.getTelNumber());
        }

        departments_NUMLIST = prodEngAndEcon_NUMLIST;

    }

    static {
        for (DetailsOfStaff r : prodEngAndEcon) {
            prodEngAndEcon_ROOMLIST.add(r.getRoom());
        }

        departments_ROOMLIST = prodEngAndEcon_ROOMLIST;

    }



    static {
        for (DetailsOfStaff r : prodEngAndEcon) {
            prodEngAndEcon_EMAILLIST.add(r.getEmail());
        }

        departments_EMAILLIST = prodEngAndEcon_EMAILLIST;

    }


    public ArrayList<String> getElectEng_NAMELIST() {
        return prodEngAndEcon_NAMELIST;
    }

    public ArrayList<String> getElectEng_NUMLIST() {
        return prodEngAndEcon_NUMLIST;
    }

    public ArrayList<String> getElectEng_ROOMLIST() {
        return prodEngAndEcon_ROOMLIST;
    }

    public ArrayList<String> getElectEng_EMAILLIST() {
        return prodEngAndEcon_EMAILLIST;
    }

}
