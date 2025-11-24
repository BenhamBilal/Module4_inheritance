package Persoonen;

public class Persoon {

    private String voorNaam, achterNaam, email;
    private Adres persoonsAdress;
    static int countInstances = 0;

    public Persoon(String voorNaam, String achterNaam) {
        countInstances += 1;
        this.voorNaam = voorNaam;
        this.achterNaam = achterNaam;
        this.email = (voorNaam + "." +  achterNaam.replaceAll(" ","") + "@persoon.be").toLowerCase();
    }

    public String getVoorNaam() {
        return voorNaam;
    }

    public void setVoorNaam(String voorNaam) {
        this.voorNaam = voorNaam;
    }

    public String getAchterNaam() {
        return achterNaam;
    }

    public void setAchterNaam(String achterNaam) {
        this.achterNaam = achterNaam;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Adres getPersoonsAdress() {
        return persoonsAdress;
    }

    public void setPersoonsAdress(Adres persoonsAdress) {
        this.persoonsAdress = persoonsAdress;
    }

    @Override
    public String toString() {
        return "Persoon{" +
                "voorNaam='" + voorNaam + '\'' +
                ", achterNaam='" + achterNaam + '\'' +
                ", email='" + email + '\'' +
                ", persoonsAdress=" + persoonsAdress +
                '}';
    }
}
