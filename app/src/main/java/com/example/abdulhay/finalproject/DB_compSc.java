package com.example.abdulhay.finalproject;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by abdulhay on 11.01.18.
 */

public class DB_compSc extends DB_departments {
      static DetailsOfStaff[] compSc ={
            new DetailsOfStaff("Prof. Dr. Klaus Baer", "07315028189", "V 104", "baer@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Anette Beckmann", "07315028134", "C 022", "beckmann@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Alfred Michael Franz", "07315028608", "V 202", "franz@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Herbert Frey", "07315028110", "A 306b", "frey@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Markus Goldstein", "07315028532", "Q 229", "goldstein@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Philipp Graf", "07315028533", "Q 231", "graf@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. G¸nter Gramlich", "07315028496", "A 305b", "gramlich@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Volker Herbort", "07315028545", "V 202", "herbort@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Joachim Hering", "07315028526", "Q 213", "hering@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Tibor Keszty¸s", "07315028607", "Q 255", "kesztyus@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Klaus Peter Kratzer", "07315028604", "Q 273", "kratzer@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Cary Laxer", "------", "---", "laxer@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Jˆrg Lehmann", "07315028609", "Q 251", "lehmann@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Karin Lunde", "07315028459", "C 030", "k.lunde@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. R¸diger Lunde", "07315028008", "A 306a", "r.lunde@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Tim Pietzcker", "07315028528", "Q 203", "pietzcker@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Volker Reuter", "07315028215", "A 303d", "reuter@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Markus Sch‰ffter", "07315028012", "A 309", "schaeffter@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Georg Schied", "07315028451", "A 105b", "schied@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Christian Schlegel", "07315028242", "A 307b", "schlegel@hs-ulm.de" ),
            new DetailsOfStaff("Frau Renate Schraag", "07315028022", "V 101", "schraag@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Frank Steiper", "07315028257", "A 105a", "steiper@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Manfred Strahnen", "07315028163", "A 106", "strahnen@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Stefan Traub", "07315028467", "F 33", "traub@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Bernd Vˆgel", "07315028546", "A310", "voegel@hs-ulm.de" ),
            new DetailsOfStaff("Prof. Dr. Reinhold von Schwerin", "07315028259", "Q 265", "r.schwerin@hs-ulm.de" ),
            new DetailsOfStaff("Frau Birgit Widmann", "07315028502", "V 101", "b.widmann@hs-ulm.de" ),
            new DetailsOfStaff(" Frau Irmgard Zankl", "07315028237", "A 112a", "zankl@hs-ulm.de"),
            new DetailsOfStaff("Prof. Dr. Manfred Wilhelm", "07315016903", "Q 235", "wilhelm@hs-ulm.de" ),
    };
      static {
          depart = compSc;
      }

    private final static ArrayList<String> compSc_NAMELIST= new ArrayList <String>(compSc.length);
    private final static ArrayList<String> compSc_NUMLIST = new ArrayList <String>(compSc.length);;
    private final static ArrayList<String> compSc_ROOMLIST = new ArrayList <String>(compSc.length);;
    private final static ArrayList<String> compSc_EMAILLIST = new ArrayList <String>(compSc.length);;

    static {
        for (DetailsOfStaff r : compSc) {
            compSc_NAMELIST.add(r.getName());
        }

        departments_NAMELIST = compSc_NAMELIST;

    }

    static {
        for (DetailsOfStaff r : compSc) {
            compSc_NUMLIST.add(r.getTelNumber());
        }

        departments_NUMLIST = compSc_NUMLIST;

    }

    static {
        for (DetailsOfStaff r : compSc) {
            compSc_ROOMLIST.add(r.getRoom());
        }

        departments_ROOMLIST = compSc_ROOMLIST;

    }



    static {
        for (DetailsOfStaff r : compSc) {
            compSc_EMAILLIST.add(r.getEmail());
        }

        departments_EMAILLIST = compSc_EMAILLIST;

    }


    public ArrayList<String> getCompSc_NAMELIST() {
        return compSc_NAMELIST;
    }

    public ArrayList<String> getCompSc_NUMLIST_() {
        return compSc_NUMLIST;
    }

    public ArrayList<String> getCompSc_ROOMLIST() {
        return compSc_ROOMLIST;
    }

    public ArrayList<String> getCompSc_EMAILLIST() {
        return compSc_EMAILLIST;
    }





}
