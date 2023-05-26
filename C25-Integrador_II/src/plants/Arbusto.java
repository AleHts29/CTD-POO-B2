package plants;

import absClass.Planta;

public class Arbusto extends Planta {
    private double anchoArbusto;
    private boolean esDomestico;
    public String variedadArbusto;
    public String colorHojas;
    public boolean sePoda;

    public Arbusto() {
    }

    public Arbusto(String nombre, double altoTallo, boolean tieneHojas, String climaIdeal, double anchoArbusto, boolean esDomestico, String variedadArbusto, String colorHojas, boolean sePoda) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.anchoArbusto = anchoArbusto;
        this.esDomestico = esDomestico;
        this.variedadArbusto = variedadArbusto;
        this.colorHojas = colorHojas;
        this.sePoda = sePoda;
    }

    public double getAnchoArbusto() {
        return anchoArbusto;
    }

    public void setAnchoArbusto(double anchoArbusto) {
        this.anchoArbusto = anchoArbusto;
    }

    public boolean isEsDomestico() {
        return esDomestico;
    }

    public void setEsDomestico(boolean esDomestico) {
        this.esDomestico = esDomestico;
    }

    public String getVariedadArbusto() {
        return variedadArbusto;
    }

    public void setVariedadArbusto(String variedadArbusto) {
        this.variedadArbusto = variedadArbusto;
    }

    public String getColorHojas() {
        return colorHojas;
    }

    public void setColorHojas(String colorHojas) {
        this.colorHojas = colorHojas;
    }

    public boolean isSePoda() {
        return sePoda;
    }

    public void setSePoda(boolean sePoda) {
        this.sePoda = sePoda;
    }

    @Override
    public void saludo() {
        System.out.println("Hola soy un/a "+this.getNombre());
    }
}
