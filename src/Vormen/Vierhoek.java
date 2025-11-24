package Vormen;

import java.awt.*;
import java.util.Objects;

public class Vierhoek extends Vorm implements Vulling {
    private int ID;
    private int lengte;
    private int breedte;

    public Vierhoek(int ID,int lengte, int breedte) {
        this.ID = ID;
        this.lengte = lengte;
        this.breedte = breedte;
    }


    public Vierhoek(int x, int y, int lijndikte, Color kleur, int lengte, int breedte) {
        super(x, y, lijndikte, kleur);
        this.lengte = lengte;
        this.breedte = breedte;
    }

    public int getLengte() {
        return lengte;
    }

    public void setLengte(int lengte) {
        this.lengte = lengte;
    }

    public int getBreedte() {
        return breedte;
    }

    public void setBreedte(int breedte) {
        this.breedte = breedte;
    }

    public String toString(){
        return "De kleur van de vierhoek is " + super.getKleur();
    }
    @Override
    public float berekenOppervlakte(){
        return lengte * breedte;
    }

    @Override
    public void gevuld(){
        System.out.println("Deze vorm is gevuld");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Vierhoek vierhoek = (Vierhoek) o;
        return ID == vierhoek.ID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), ID);
    }
}
