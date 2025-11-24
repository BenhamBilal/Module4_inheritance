package Persoonen;

public class PersonenMain {
    public static void main(String[] args) {
//        E1: Herhaling klasse
//        Maak een klasse Persoon, van een persoon willen we de volgende gegevens opslaan:
//        Voornaam
//        Achternaam
//        email
//        adres (Object van klasse Adres, dat mag je uit de oefeningen van Classes overnemen)
//
//        Zorg voor een constructor waar je een persoon kan aanmaken met een voor- en achternaam.
//        Overschrijf ook nog de toString methode om de gegevens te kunnen afdrukken.
//        Om te testen of alles werkt maak je in je main klasse twee personen aan en geef je hen een adres.
//        Druk hun gegevens af om te controleren of correct is ingegeven.
//
//        Als uitdaging zoek je nog een manier toe om te tellen hoeveel personen er in totaal zijn aangemaakt.
//        Hiervoor kan je gebruik maken van static

        Persoon sam = new Persoon("Sam","De Keatelaare");
        Adres samsAdres = new Adres("Bergensesteenweg","94/2","Anderlecht",1070);
        Persoon paul = new Persoon("Paul","De Stroof");
        Adres paulsAdres = new Adres("zoutstraat","12","Anderlecht",1070);
        Persoon eric = new Persoon("Eric","Judor");
        Adres ericsAdres = new Adres("Mettewielaan","1562","Molenbeek",1080);
        sam.setPersoonsAdress(samsAdres);
        paul.setPersoonsAdress(paulsAdres);
        eric.setPersoonsAdress(ericsAdres);
        System.out.println(Persoon.countInstances);
    }
}