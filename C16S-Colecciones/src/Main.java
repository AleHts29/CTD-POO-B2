import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        Jugador jugador_01 = new Jugador(8, "Alonso", true, true);
        Jugador jugador_02 = new Jugador(10, "Messi", false, true);
        Jugador jugador_03 = new Jugador(6, "Juan", true, false);
        Jugador jugador_04 = new Jugador(5, "Alonso", false, false);

        Equipo equipo_01 = new Equipo("River");
        equipo_01.addJugadores(jugador_01);
        equipo_01.addJugadores(jugador_02);
        equipo_01.addJugadores(jugador_03);
        equipo_01.addJugadores(jugador_04);

        //usamos generic
        ArrayList<Jugador> listaJugadores = equipo_01.getJugadores();

//        for (int i = 0; i < listaJugadores.size(); i++) {
//            System.out.println("Jugadores: "+listaJugadores.get(i).getNombre());
//        }


//        for (Jugador jugador: listaJugadores) {
//            if (jugador.getNroCamiseta() > 5){
//                System.out.println("Jugadores: "+jugador.getNombre());
//            }
//        }

        equipo_01.mostrarJugadoresTitulares();
        System.out.println("Numero de jugadores lesionados: "+ equipo_01.getCantidadJugadoresLesionados());


        System.out.println("Los jugadores: "+jugador_01.getNroCamiseta() +" y "+ jugador_02.getNroCamiseta() + jugador_01.compararJugadores(jugador_02));

    }
}