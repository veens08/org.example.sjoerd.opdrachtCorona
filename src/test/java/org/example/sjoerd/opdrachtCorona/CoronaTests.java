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

    @Test
    void eerstePersoonVullenTest () {
        for (int index = 1; index < 21; index++) {
            Persoon persoon = new Persoon();

            persoon.setId (index);
            persoon.setNaam ("Persoon" + index);
            persoon.setLeeftijd (20 + index);

            System.out.println (persoon.getId ());
            System.out.println (persoon.getLeeftijd ());
            System.out.println (persoon.getNaam ());
            assertThat(persoon).isNotNull ();
        }
    }

    @Test
    void eersteAdresVullenTest () {
        for (int index = 1; index < 11; index++) {
            Adres adres = new Adres ();

            adres.setStraatnaam ("De Jagershuizen");
            adres.setHuisnummer (100 + index);
            adres.setPostcode ("7316 NC");
            adres.setWoonplaats ("Apeldoorn");
            adres.setLand ("Nederland");

            System.out.println (adres.getStraatnaam ());
            System.out.println (adres.getHuisnummer ());
            System.out.println (adres.getPostcode ());
            System.out.println (adres.getWoonplaats ());
            System.out.println (adres.getLand ());
            assertThat (adres).isNotNull ();
        }
    }


    @Test
    void eersteHuisVullenTest () {
        for (int index = 1; index < 11; index++) {

            Huis huis = new Huis ();

            huis.setKadasterNummer (index + 1);
            huis.setAantalKamers (4);
            Adres adresVanHuis = new Adres ("De jagershuizen", 100 + index, "7316 NC", "Apeldoorn", "Nederland");
            huis.setHuisAdres (adresVanHuis);
            System.out.println (huis.getKadasterNummer ());
            System.out.println (huis.getAantalKamers ());
            System.out.println (adresVanHuis.toStringAdresPresentation ());
            assertThat (huis).isNotNull ();
        }
    }
}
