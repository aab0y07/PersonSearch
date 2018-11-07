package com.example.abdulhay.finalproject;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by abdulhay on 11.01.18.
 */

public class DB_mechAndMedEng extends DB_departments {
    private final static DetailsOfStaff[] mechAndMedEng ={
            new DetailsOfStaff("Prof. Dr. Hariolf Betz", "07315028520", "Q 227", "hbetz@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Ronald Blechschmidt", "07315028534", "Q 247", "blechschmidt@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Rainer Brucher", "07315028601", "---", "brucher@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Felix Capanni", "07315028521", "Q 221", "capanni@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Thomas Engleder", "07315028529", "Q 221", "engleder@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Eberhard Frank", "07315028266", "F 31", "frank@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Martin Heﬂling", "07315028602", "Q 269", "hessling@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Michael Kaufeld", "07315028182", "F 05", "kaufeld@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Michael Munz", "07315028536", "Q 237", "michael.munz@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Klaus Paulat", "07315028606", "Q 257", "paulat@hs-ulm.de" ),
            new DetailsOfStaff("Frau Renate Schraag", "07315028022", "V 101", "schraag@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Thomas Walter", "07315028523", "Q 207", "walter.th@hs-ulm.de" ),
            new DetailsOfStaff("Frau Birgit Widmann", "07315028502", "V 101", "b.widmann@hs-ulm.de" ),
            new DetailsOfStaff("Frau Irmgrad Zankl", "07315028237", "A 112a", "zankl@hs-ulm.de" )};
    static {
        depart = mechAndMedEng;
    }
    private final static ArrayList<String> mechAndMedEng_NAMELIST= new ArrayList <String>(mechAndMedEng.length);
    private final static ArrayList<String> mechAndMedEng_NUMLIST = new ArrayList <String>(mechAndMedEng.length);;
    private final static ArrayList<String> mechAndMedEng_ROOMLIST = new ArrayList <String>(mechAndMedEng.length);;
    private final static ArrayList<String> mechAndMedEng_EMAILLIST = new ArrayList <String>(mechAndMedEng.length);;

    static {
        for (DetailsOfStaff r : mechAndMedEng) {
            mechAndMedEng_NAMELIST.add(r.getName());
        }

        departments_NAMELIST = mechAndMedEng_NAMELIST;

    }

    static {
        for (DetailsOfStaff r : mechAndMedEng) {
            mechAndMedEng_NUMLIST.add(r.getTelNumber());
        }

        departments_NUMLIST = mechAndMedEng_NUMLIST;

    }

    static {
        for (DetailsOfStaff r : mechAndMedEng) {
            mechAndMedEng_ROOMLIST.add(r.getRoom());
        }

        departments_ROOMLIST = mechAndMedEng_ROOMLIST;

    }



    static {
        for (DetailsOfStaff r : mechAndMedEng) {
            mechAndMedEng_EMAILLIST.add(r.getEmail());
        }

        departments_EMAILLIST = mechAndMedEng_EMAILLIST;

    }


    public ArrayList<String> getMechAndMedEng_NAMELIST() {
        return mechAndMedEng_NAMELIST;
    }

    public ArrayList<String> getMechAndMedEng_NUMLIST() {
        return mechAndMedEng_NUMLIST;
    }

    public ArrayList<String> getMechAndMedEng_ROOMLIST() {
        return mechAndMedEng_ROOMLIST;
    }

    public ArrayList<String> getMechAndMedEng_EMAILLIST() {
        return mechAndMedEng_EMAILLIST;
    }

}
