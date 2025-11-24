package Vormen;

import java.awt.*;
import java.util.Objects;

public abstract class Vorm {

    private int x,y, lijndikte;
    private Color kleur;

    public Vorm(){

    }

    public Vorm(int x,int y,int lijndikte,Color kleur){
        this.x = x;
        this.y = y;
        this.lijndikte = lijndikte;
        this.kleur = kleur;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getLijndikte() {
        return lijndikte;
    }

    public void setLijndikte(int lijndikte) {
        this.lijndikte = lijndikte;
    }

    public Color getKleur() {
        return kleur;
    }

    public void setKleur(Color kleur) {
        this.kleur = kleur;
    }

    public String toString() {
        return "De kleur van de vorm is" + this.kleur;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vorm vorm = (Vorm) o;
        return getX() == vorm.getX() && getY() == vorm.getY() && getLijndikte() == vorm.getLijndikte() && Objects.equals(getKleur(), vorm.getKleur());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY(), getLijndikte(), getKleur());
    }

    public abstract float berekenOppervlakte();


}
