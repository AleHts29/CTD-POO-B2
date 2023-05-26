package plants;

import absClass.Planta;

public class Flor extends Planta {
    private String colorPetalos;
    private double avgPetalos;
    private String colorPistilo;
    private String variedadFlor;
    private String estacionEnQueFlorece;

    public Flor() {
    }

    public Flor(String nombre, double altoTallo, boolean tieneHojas, String climaIdeal, String colorPetalos, double avgPetalos, String colorPistilo, String variedadFlor, String estacionEnQueFlorece) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.colorPetalos = colorPetalos;
        this.avgPetalos = avgPetalos;
        this.colorPistilo = colorPistilo;
        this.variedadFlor = variedadFlor;
        this.estacionEnQueFlorece = estacionEnQueFlorece;
    }

    public String getColorPetalos() {
        return colorPetalos;
    }

    public void setColorPetalos(String colorPetalos) {
        this.colorPetalos = colorPetalos;
    }

    public double getAvgPetalos() {
        return avgPetalos;
    }

    public void setAvgPetalos(double avgPetalos) {
        this.avgPetalos = avgPetalos;
    }

    public String getColorPistilo() {
        return colorPistilo;
    }

    public void setColorPistilo(String colorPistilo) {
        this.colorPistilo = colorPistilo;
    }

    public String getVariedadFlor() {
        return variedadFlor;
    }

    public void setVariedadFlor(String variedadFlor) {
        this.variedadFlor = variedadFlor;
    }

    public String getEstacionEnQueFlorece() {
        return estacionEnQueFlorece;
    }

    public void setEstacionEnQueFlorece(String estacionEnQueFlorece) {
        this.estacionEnQueFlorece = estacionEnQueFlorece;
    }

    @Override
    public void saludo() {
        System.out.println("Hola soy un/a "+this.getNombre());
    }
}
