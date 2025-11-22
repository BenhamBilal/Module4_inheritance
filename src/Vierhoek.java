import java.awt.*;

public class Vierhoek extends Vorm{

    private int lengte;
    private int breedte;

    public Vierhoek(int lengte, int breedte) {
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
}
