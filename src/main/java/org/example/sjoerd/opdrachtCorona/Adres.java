package org.example.sjoerd.opdrachtCorona;

public class Adres {
    private String straatnaam;
    private int huisnummer;
    private String postcode;
    private String woonplaats;
    private String land;

    Adres() {
        setStraatnaam (null);
        setHuisnummer (0);
        setPostcode (null);
        setWoonplaats (null);
        setLand (null);
    }

    Adres (String newStraatnaam, int newHuisnummer, String newPostcode, String newWoonplaats, String newLand) {
        setStraatnaam (newStraatnaam);
        setHuisnummer (newHuisnummer);
        setPostcode (newPostcode);
        setWoonplaats (newWoonplaats);
        setLand (newLand);
    }

    String getStraatnaam () {
        return straatnaam;
    }

    int getHuisnummer () {
        return huisnummer;
    }

    String getPostcode () {
        return postcode;
    }

    String getWoonplaats () {
        return woonplaats;
    }

    String getLand () {
        return land;
    }
    void setStraatnaam(String newStraatnaam) {
        straatnaam = newStraatnaam;
    }

    void setHuisnummer(int newHuisnummer) {
        huisnummer = newHuisnummer;
    }

    void setPostcode(String newPostcode) {
        postcode = newPostcode;
    }

    void setWoonplaats(String newWoonplaats) {
        woonplaats = newWoonplaats;
    }

    void setLand(String newLand) {
        land = newLand;
    }

    String toStringAdresPresentation () {
        return "Adres[straatnaam = " + straatnaam +
                " huisnummer = " + huisnummer +
                " postcode = " + postcode +
                " woonplaats = "+ woonplaats +
                " land = " + land + "]";
        //        " woonplaats " = + woonplaats +
        //        " land = " + land + "]";
        }

}
