public class Curso extends OfertaAcademica {

    private Double precioPorHora;
    private Double duracionMeses;
    private Double horasMensuales;

    public Curso(String nombre, String descripcion, Double precioPorHora, Double duracionMeses, Double horasMensuales) {
        super(nombre, descripcion);
        this.precioPorHora = precioPorHora;
        this.duracionMeses = duracionMeses;
        this.horasMensuales = horasMensuales;
    }

    @Override
    public Double calcularPrecio() {
        return precioPorHora * duracionMeses * horasMensuales;
    }
}
