package org.example.sjoerd.opdrachtCorona;

public class Huis {
    private int kadasterNummer;
    private int aantalKamers;

    Huis () {
        setKadasterNummer (0);
        setAantalKamers (0);
    }

    int getKadasterNummer() {
        return kadasterNummer;
    }

    int getAantalKamers() {
        return aantalKamers;
    }

    void setKadasterNummer(int newKadasterNummer) {
        kadasterNummer  = newKadasterNummer;
    }

    void setAantalKamers(int newAantalKamers) {
        aantalKamers = newAantalKamers;
    }
}
