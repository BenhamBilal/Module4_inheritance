package Vormen;

import java.awt.*;

public class Cirkel extends Vorm {

    private int straal;


    public Cirkel(int straal){
        this.straal = straal;
    }
    public Cirkel(int x, int y, int lijndikte, Color kleur, int straal){
        super(x,y,lijndikte,kleur);
        this.straal = straal;
    }

    @Override
    public float berekenOppervlakte(){
        return (float)Math.PI * straal * straal;
    }
}
