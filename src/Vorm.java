import java.awt.*;

public class Vorm {

    private int x;
    private int y;
    private int lijndikte;
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
}
