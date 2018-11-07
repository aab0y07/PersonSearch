package com.example.abdulhay.finalproject;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by abdulhay on 11.01.18.
 */

public class DB_mathNat extends DB_departments {
    static DetailsOfStaff[]  mathNat ={
            new DetailsOfStaff("Prof. Dr. Thomas Baier", "07315028137", "C 017", "baier@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Anette Beckmann", "07315028134", "C 022", "beckmann@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Manuela Boin", "07315028037", "C 018", "boin@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Verena Cerna", "07315028135", "C 015", "cerna@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Ben Dippe", "07315028137", "C 017", "baier@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Barbara Gaisbauer-Pointner", "07315028158", "A 310", "gaisbauer-pointnere@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. G¸nter Gramlich", "07315028496", "A 305b", "gramlich@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Harald Groﬂ", "07315028535", "Q 235", "gross@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Georg Gutenbrunner", "07315028021", "Q 225", "gutenbrunner@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Annika Halder", "07315028039", "A 310", "halder@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Christian Iniotakis", "07315028600", "A 305d", "iniotakis@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Ursula Klaschka", "07315028456", "A 110", "klaschka@hs-ulm.de" ),
            new DetailsOfStaff(" Frau Barbara Kugler", "07315028274", "A 100", "kugler@hs-ulm.de" ),
            new DetailsOfStaff("Dr. Peter Lachmann", "07315028525", "Q 211", "lachmann@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Karin Lunde", "07315028459", "C 030", "k.lunde@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Hubert Mantz", "07315028539", "Q 233", "mantz@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Marc-Oliver Otto", "07315028136", "A 101", "otto@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Thomas Raiber", "07315028104", "H 201", "raiber@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Volker Reuter", "07315028215", "A 303d", "reuter@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Daniel Schallmo", "07315028273", "A 310", "schallmo@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Stephan Schl¸ter", "07315028265", "B 207", "stephan.schlueter@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Beatrice Schuster", "07315028217", "H 201", "schuster@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Martin Severin", "07315028495", "A 306d", "severin@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Alla Slynko", "07315028530", "Q 225", "slynko@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Ulrich Straub", "07315028522", "Q 205", "straub@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Barbara Streppel", "07315028549", "Q 233", "streppel@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Thorsten Titzmann", "07315028541", "A310", "titzmann@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Ursula Weiﬂ", "07315028090", "B 210b", "weiss@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Joachim Werner", "07315028138", "C 016", "werner@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Steffen Wettengl", "07315028091", "A 102", "wettengl@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Manfred Wilhelm", "07315016903", "Q 235", "wilhelm@hs-ulm.de" ),
    };
    static {
        depart = mathNat;
    }

    private final static ArrayList<String> mathNat_NAMELIST= new ArrayList <String>(mathNat.length);
    private final static ArrayList<String> mathNat_NUMLIST = new ArrayList <String>(mathNat.length);;
    private final static ArrayList<String> mathNat_ROOMLIST = new ArrayList <String>(mathNat.length);;
    private final static ArrayList<String> mathNat_EMAILLIST = new ArrayList <String>(mathNat.length);;

    static {
        for (DetailsOfStaff r : mathNat) {
            mathNat_NAMELIST.add(r.getName());
        }

        departments_NAMELIST = mathNat_NAMELIST;

    }

    static {
        for (DetailsOfStaff r : mathNat) {
            mathNat_NUMLIST.add(r.getTelNumber());
        }

        departments_NUMLIST = mathNat_NUMLIST;

    }

    static {
        for (DetailsOfStaff r : mathNat) {
            mathNat_ROOMLIST.add(r.getRoom());
        }

        departments_ROOMLIST = mathNat_ROOMLIST;

    }



    static {
        for (DetailsOfStaff r : mathNat) {
            mathNat_EMAILLIST.add(r.getEmail());
        }

        departments_EMAILLIST = mathNat_EMAILLIST;

    }


    public ArrayList<String> getElectEng_NAMELIST() {
        return mathNat_NAMELIST;
    }

    public ArrayList<String> getMathNat_NAMELIST() {
        return mathNat_NUMLIST;
    }

    public ArrayList<String> getMathNat_ROOMLIST() {
        return mathNat_ROOMLIST;
    }

    public ArrayList<String> getMathNat_EMAILLIST() {
        return mathNat_EMAILLIST;
    }

}
