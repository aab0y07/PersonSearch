package com.example.abdulhay.finalproject;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by abdulhay on 09.01.18.
 */

public class DB_electEng extends DB_departments {


    static DetailsOfStaff[] electEng = {
            new DetailsOfStaff("Prof. Dr Dirk Bank", "07315028291", "A306c", "bankL@hs-ulm.de"),
            new DetailsOfStaff("Prof. Dr Richard Böker", "07315028216", "XXX", "boeker@hs-ulm.de"),
            new DetailsOfStaff("Prof. Dr Flowin Derr", "07315028180", "A210a", "derr@hs-ulm.de"),
            new DetailsOfStaff("Prof. Dr Manfred Gaida", "07315028426", "M104", "gaida@hs-ulm.de"),
            new DetailsOfStaff("Prof. Dr Damian Gerbaulet", "07315028415", "M105", "gerbaulet@hs-ulm.de"),
            new DetailsOfStaff("Prof. Dr Dietmar Graebar", "07315016960" , "P205", "d.graebar@hs-ulm.de"),
            new DetailsOfStaff("Prof. Dr Thomas Hofmann", "07315028268", "D03", "th.hofmann@hs-ulm.de"),
            new DetailsOfStaff("Prof. Dr Adelheid Junginger", "07315028181", "A210b", "junginger@hs-ulm.de"),
            new DetailsOfStaff("Prof. Dr Claus Kröger", "07315028171", "A205b", "kroeger@hs-ulm.de"),
            new DetailsOfStaff("Prof. Dr Silko-Matthias Kruse", "07315028411", "M106", "kruse@hs-ulm.de"),
            new DetailsOfStaff("Prof. Dr Michael Lux", "07315016989", "H207", "lux@hs-ulm.de"),
            new DetailsOfStaff("Prof. Dr Roland Münzner", "07315028337", "P01", "muenzner@hs-ulm.de"),
            new DetailsOfStaff("Prof. Dr Steffen Prochnow","07315028316" , "P104", "prochnow@hs-ulm.de"),
            new DetailsOfStaff("Prof. Dr Dietar Pross", "07315028421", "M210", "pross@hs-ulm.de"),
            new DetailsOfStaff("Prof Susanne Radtke", "07315028321", "N108", "radtke@hs-ulm.de"),
            new DetailsOfStaff("Frau Petra Sander","07315028165" , "A208", "sander@hs-ulm.de"),
            new DetailsOfStaff("Prof. Dr Michael Schlick", "07315028169", "A307a", "michael.schlick@hs-ulm.de"),
            new DetailsOfStaff("Prof. Dr Lothar Schmidt", "07315028338", "P102", "schmidt@hs-ulm.de"),
            new DetailsOfStaff("Prof. Dr Dominik Stöckle", "07315028420", "M207", "stoekckle@hs-ulm.de"),
            new DetailsOfStaff("Prof. Dr Anestis Terzis", "07315028341", "P101", "terzis@hs-ulm.de"),
            new DetailsOfStaff("Prof. Dr Marianne von Schwerin", "07315028103", "A303b", "m.schwerin@hs-ulm.de"),

    };
    static {
        depart = electEng;
    }



    private final static ArrayList<String> electEng_NAMELIST= new ArrayList <String>(electEng.length);
    private final static ArrayList<String> electEng_NUMLIST = new ArrayList <String>(electEng.length);;
    private final static ArrayList<String> electEng_ROOMLIST = new ArrayList <String>(electEng.length);;
    private final static ArrayList<String> electEng_EMAILLIST = new ArrayList <String>(electEng.length);;

    static {
        for (DetailsOfStaff r : electEng) {
            electEng_NAMELIST.add(r.getName());
        }

        departments_NAMELIST = electEng_NAMELIST;

    }

    static {
        for (DetailsOfStaff r : electEng) {
            electEng_NUMLIST.add(r.getTelNumber());
        }

        departments_NUMLIST = electEng_NUMLIST;

    }

    static {
        for (DetailsOfStaff r : electEng) {
            electEng_ROOMLIST.add(r.getRoom());
        }

        departments_ROOMLIST = electEng_ROOMLIST;

    }



    static {
        for (DetailsOfStaff r : electEng) {
            electEng_EMAILLIST.add(r.getEmail());
        }

        departments_EMAILLIST = electEng_EMAILLIST;

    }


    public ArrayList<String> getElectEng_NAMELIST() {
        return electEng_NAMELIST;
    }

    public ArrayList<String> getElectEng_NUMLIST() {
        return electEng_NUMLIST;
    }

    public ArrayList<String> getElectEng_ROOMLIST() {
        return electEng_ROOMLIST;
    }

    public ArrayList<String> getElectEng_EMAILLIST() {
        return electEng_EMAILLIST;
    }

}
