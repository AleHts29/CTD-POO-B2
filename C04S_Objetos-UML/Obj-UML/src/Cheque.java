import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Cheque {
    private String nombreTitular;
    private Double monto;
    private String tipo;
    private LocalDate fechaDeEmision;
    private LocalDate fechaDeVencimiento;


    public Cheque(String nombreTitular, Double monto, String tipo, LocalDate fechaDeEmision, LocalDate fechaDeVencimiento) {
        this.nombreTitular = nombreTitular;
        this.monto = monto;
        this.tipo = tipo;
        this.fechaDeEmision = fechaDeEmision;
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    // Metodos
   public void pruebaFechas(){
        LocalDate hoy = LocalDate.now();
        LocalDate vencimiento = LocalDate.of(2022, 9, 13);
        System.out.println("La fecha actual es: " + hoy);
        System.out.println("La fecha Seteada es: " + vencimiento);

        Period diferenciaFechas = Period.between(hoy, vencimiento);
//        Period diferenciaFechas = hoy.until(vencimiento);
        int meses = diferenciaFechas.getMonths();
        int dias = diferenciaFechas.getDays();
        System.out.println("Faltan " + meses + " meses y " + dias + " dias.");
    }

    public void endosar(String nombre){
        this.nombreTitular = nombre;
        System.out.println("El cheque fue endosado a: "+ nombre);
        return;
    }

    public void cobrarCheque(){
        int plazo = 30;
        Period fechaVto = Period.between(LocalDate.now(), fechaDeVencimiento);
        int dias = fechaVto.getDays();

        if(dias > plazo){
            System.out.println("El cheque no puede ser cobrado, ya que supera los "+ plazo + " dias.");
            return;
        }
        System.out.println("El cheque fue cobrado, por "+ nombreTitular + " fecha: " +LocalDate.now());
        return;
    }
}
