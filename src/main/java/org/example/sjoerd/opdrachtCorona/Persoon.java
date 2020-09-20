package org.example.sjoerd.opdrachtCorona;

public class Persoon {
    private int id;
    private String naam;
    private int leeftijd;

    Persoon () {
        setId (0);
        setNaam (null);
        setLeeftijd (0);
    }

    Persoon (int newId, String newNaam, int newLeeftijd) {
        setId (newId);
        setNaam (newNaam);
        setLeeftijd (leeftijd);
    }

    int getId () {
        return id;
    }

    String getNaam () {
        return naam;
    }

    int getLeeftijd () {
        return leeftijd;
    }

    void setId(int newId) {
        id = newId;
    }

    void setNaam (String newNaam) {
        naam = newNaam;
    }

    void setLeeftijd (int newleeftijd) {
        leeftijd = newleeftijd;
    }
}
