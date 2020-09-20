package org.example.sjoerd.opdrachtCorona;

public class Huis {
    private int kadasterNummer;
    private int aantalKamers;
    private Adres huisAdres;
    private Persoon bewoner;
    private Persoon gast;

    Huis () {
        setKadasterNummer (0);
        setAantalKamers (0);
    }

    Huis (int newKadasterNummer, int newAantalKamers) {
        setKadasterNummer (newKadasterNummer);
        setAantalKamers (newAantalKamers);
    }

    Huis (int newKadasterNummer, int newAantalKamers, Adres newHuisAdres, Persoon newBewoner, Persoon newGast) {
        setKadasterNummer (newKadasterNummer);
        setAantalKamers (newAantalKamers);
        setHuisAdres (newHuisAdres);
        setBewoner (newBewoner);
        setGast (newGast);
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

    void setBewoner(Persoon newBewoner) {
        this.bewoner = newBewoner;
    }

    void setGast(Persoon newGast) {
        this.gast = newGast;
    }

    void setHuisAdres(Adres newHuisAdres) {
        this.huisAdres = newHuisAdres;
    }
}
