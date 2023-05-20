import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private ArrayList<Jugador> jugadores;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList();
    }

    public void addJugadores(Jugador jugador){
        this.jugadores.add(jugador);
    }

    public void mostrarJugadoresTitulares(){
        for(Jugador jugador: this.jugadores){
            if(jugador.isTitular())
                System.out.println(jugador.getNombre()+" es titular");

        }
    }

    public int getCantidadJugadoresLesionados(){
        int jugadoresLesionados = 0;
        for(Jugador jugador: jugadores){
            if(jugador.isLesionado())
                jugadoresLesionados++;
        }
        return jugadoresLesionados;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }
}
