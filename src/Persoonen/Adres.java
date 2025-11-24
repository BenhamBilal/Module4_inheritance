package Persoonen;

public class Adres {
    private String straatNaam,huisNummer,stad;
    private int postcode;

    public Adres(String straatNaam,String huisNummer, String stad,int postcode){
        this.straatNaam = straatNaam;
        this.huisNummer = huisNummer;
        this.stad = stad;
        this.postcode = postcode;
    }
    public Adres(){

    }

    public String getStraatNaam() {
        return straatNaam;
    }

    public void setStraatNaam(String straatNaam) {
        this.straatNaam = straatNaam;
    }

    public String getHuisNummer() {
        return huisNummer;
    }

    public void setHuisNummer(String huisNummer) {
        this.huisNummer = huisNummer;
    }

    public String getStad() {
        return stad;
    }

    public void setStad(String stad) {
        this.stad = stad;
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public String toString(){
        return this.straatNaam + " nr: " + this.huisNummer + " " + this.postcode + " " + this.stad;
    }
}
