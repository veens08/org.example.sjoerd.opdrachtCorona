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
    void eerstePersoomMetAdresVullenTest () {
        for (int index = 1; index < 11; index++) {

            Persoon bewoner = new Persoon ();

            bewoner.setId (index);
            bewoner.setNaam ("Bewoner" + index);
            bewoner.setLeeftijd (20 + index);

            Adres adresVanHuis = new Adres ("De jagershuizen", 100 + index, "7316 NC", "Apeldoorn", "Nederland");
            bewoner.setAdres (adresVanHuis);
            System.out.println (bewoner.getId ());
            System.out.println (bewoner.getLeeftijd ());
            System.out.println (bewoner.getNaam ());
            System.out.println (adresVanHuis.toStringAdresPresentation ());
            assertThat (bewoner).isNotNull ();
        }
    }

    @Test
    void eersteTestCombinatieHuisBewoner () {

        Persoon bewoner1 = new Persoon ();
        bewoner1.setId (1);
        bewoner1.setNaam ("Bewoner1");
        bewoner1.setLeeftijd (20);
        Adres adresVanHuis = new Adres ("De jagershuizen", 100, "7316 NC", "Apeldoorn", "Nederland");
        bewoner1.setAdres (adresVanHuis);

        Persoon bewoner2 = new Persoon ();
        bewoner2.setId (1);
        bewoner2.setNaam ("Bewoner2");
        bewoner2.setLeeftijd (20);
        Adres adresVanHuis = new Adres ("De jagershuizen", 100, "7316 NC", "Apeldoorn", "Nederland");
        bewoner2.setAdres (adresVanHuis);

        Persoon bewoner3 = new Persoon ();
        bewoner3.setId (1);
        bewoner3.setNaam ("Bewoner3");
        bewoner3.setLeeftijd (20);
        Adres adresVanHuis = new Adres ("De jagershuizen", 100, "7316 NC", "Apeldoorn", "Nederland");
        bewoner3.setAdres (adresVanHuis);

        Persoon bewoner4 = new Persoon ();
        bewoner4.setId (1);
        bewoner4.setNaam ("Bewoner4");
        bewoner4.setLeeftijd (20);
        Adres adresVanHuis = new Adres ("De jagershuizen", 100, "7316 NC", "Apeldoorn", "Nederland");
        bewoner4.setAdres (adresVanHuis);

        Persoon bewoner5 = new Persoon ();
        bewoner5.setId (1);
        bewoner5.setNaam ("Bewoner5");
        bewoner5.setLeeftijd (20);
        Adres adresVanHuis = new Adres ("De jagershuizen", 100, "7316 NC", "Apeldoorn", "Nederland");
        bewoner5.setAdres (adresVanHuis);

        Persoon bewoner6 = new Persoon ();
        bewoner6.setId (1);
        bewoner6.setNaam ("Bewoner6");
        bewoner6.setLeeftijd (20);
        Adres adresVanHuis = new Adres ("De jagershuizen", 100, "7316 NC", "Apeldoorn", "Nederland");
        bewoner6.setAdres (adresVanHuis);

        Persoon bewoner7 = new Persoon ();
        bewoner7.setId (1);
        bewoner7.setNaam ("Bewoner7");
        bewoner7.setLeeftijd (20);
        Adres adresVanHuis = new Adres ("De jagershuizen", 100, "7316 NC", "Apeldoorn", "Nederland");
        bewoner7.setAdres (adresVanHuis);
        Huis huis = new Huis ();

        huis.setKadasterNummer (1);
        huis.setAantalKamers (4);
        Adres adresVanHuis = new Adres ("De jagershuizen", 100, "7316 NC", "Apeldoorn", "Nederland");
        huis.setHuisAdres (adresVanHuis);
        System.out.println (huis.getKadasterNummer ());
        System.out.println (huis.getAantalKamers ());
        System.out.println (adresVanHuis.toStringAdresPresentation ());
        assertThat (huis).isNotNull ();

        if (huis.getAantalKamers () * 2) <
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
