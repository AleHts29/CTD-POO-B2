import empresa.Empleado;
import empresa.EmpleadoMarketing;

public class Main {
    public static void main(String[] args) {
        EmpleadoMarketing empl_01 = new EmpleadoMarketing("Pedro", "Sanchez", "1234", "Redes Sociales");

        empl_01.trabajar();
        empl_01.trabajar(4);
    }
}