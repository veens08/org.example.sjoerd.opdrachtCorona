package org.example.sjoerd.opdrachtCorona;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CoronaTests {

    @Test
    void eerstePersoonTest () {
        Persoon persoon = new Persoon();

        persoon.setId (1);
        persoon.setNaam ("Sjoerd");
        persoon.setLeeftijd (58);

        System.out.println (persoon.getId ());
        System.out.println (persoon.getLeeftijd ());
        System.out.println (persoon.getNaam ());
        assertThat(persoon).isNotNull ();
    }

    @Test
    void eersteHuisTest () {
        Huis huis = new Huis ();

        huis.setKadasterNummer(1);
        huis.setAantalKamers (4);

        System.out.println (huis.getKadasterNummer ());
        System.out.println (huis.getAantalKamers ());
        assertThat(huis).isNotNull ();
    }


    @Test
    void eersteAdresTest () {
        Adres adres = new Adres ();

        adres.setStraatnaam ("De Jagershuizen");
        adres.setHuisnummer (111);
        adres.setPostcode ("7316 NC");
        adres.setWoonplaats ("Apeldoorn");
        adres.setLand ("Nedreland");

        System.out.println (adres.getStraatnaam ());
        System.out.println (adres.getHuisnummer ());
        System.out.println (adres.getPostcode ());
        System.out.println (adres.getWoonplaats ());
        System.out.println (adres.getLand ());
        assertThat(adres).isNotNull ();
    }
}
