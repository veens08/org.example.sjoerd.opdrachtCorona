package org.example.sjoerd.opdrachtCorona;

public class Huis {
    private int kadasterNummer;
    private int aantalKamers;
    private Adres huisAdres;

    Huis () {
        setKadasterNummer (0);
        setAantalKamers (0);
    }

    Huis (int newKadasterNummer, int newAantalKamers) {
        setKadasterNummer (newKadasterNummer);
        setAantalKamers (newAantalKamers);
    }

    Huis (int newKadasterNummer, int newAantalKamers, Adres newHuisAdres) {
        setKadasterNummer (newKadasterNummer);
        setAantalKamers (newAantalKamers);
        setHuisAdres (newHuisAdres);
    }

    int getKadasterNummer() {
        return kadasterNummer;
    }

    int getAantalKamers() {
        return aantalKamers;
    }

    Adres getHuisAdres () {
        return this.huisAdres;
    }

    void setKadasterNummer(int newKadasterNummer) {
        kadasterNummer  = newKadasterNummer;
    }

    void setAantalKamers(int newAantalKamers) {
        aantalKamers = newAantalKamers;
    }

    void setHuisAdres(Adres newHuisAdres) {
        this.huisAdres = newHuisAdres;
    }
}
