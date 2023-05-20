import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        try {
            Seleccion seleccion = new Seleccion("seleccion Colombia");

            Jugador jugador1 = new Jugador("Pepe",1,"ARQUERO");
            Jugador jugador2 = new Jugador("Juan",12,"DELANTERO");

            seleccion.addJugador(jugador2);
            seleccion.addJugador(jugador1);
            seleccion.addJugador(jugador1);
            seleccion.addJugador(jugador1);
            seleccion.addJugador(jugador1);
            seleccion.addJugador(jugador1);
            seleccion.addJugador(jugador1);
            seleccion.addJugador(jugador1);
            seleccion.addJugador(jugador1);
            seleccion.addJugador(jugador1);
            seleccion.addJugador(jugador1);
            seleccion.addJugador(jugador1);
            seleccion.addJugador(jugador1);
            seleccion.addJugador(jugador1);
            seleccion.addJugador(jugador1);
            seleccion.addJugador(jugador1);
            seleccion.addJugador(jugador1);
            seleccion.addJugador(jugador1);
            seleccion.addJugador(jugador1);
            seleccion.addJugador(jugador1);
            seleccion.addJugador(jugador1);
            seleccion.addJugador(jugador1);
            seleccion.addJugador(jugador1);

            ArrayList<Jugador> res = seleccion.obtenerReserva();

            for(Jugador jugadorReserva: res) {
                System.out.println(jugadorReserva.getApellidoNombre());

            }

            Integer cantDEArq = seleccion.cantJugPorPos("ARQUERO");
            System.out.println("cantidad de ARQUERO: " + cantDEArq);
//            Integer cantDElanteros = seleccion.cantJugPorPos("DELANTERO");
//            System.out.println("cantidad de delanteros: " + cantDElanteros);
//            Integer aguatero = seleccion.cantJugPorPos("DELANTERO");
//            System.out.println("cantidad de aguatero: " + aguatero);

        } catch (PosicionException e){
            System.err.println("error");
        } catch (RuntimeException e) {
            System.err.println("dsds");
        }

    }
}