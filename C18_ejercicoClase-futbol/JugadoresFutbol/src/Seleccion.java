import java.util.ArrayList;

public class Seleccion {
    //atributos
    private String nombre;
    private ArrayList<Jugador> jugadores;


    //contrstuctor

    public Seleccion(String nombre, ArrayList<Jugador> jugadores) {
        this.nombre = nombre;
        this.jugadores = jugadores;
    }

    public Seleccion(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }
    //metodos
    public void addJugador(Jugador j){
        this.jugadores.add(j);
    }

    //11 son los titulares, los siguientes 7 son los
    // suplentes y los 5 restantes son de reserva.
    public ArrayList<Jugador> obtenerReserva() throws RuntimeException{
        //simulamos la exepcion
        if(false) {
            throw new RuntimeException();
        }
        ArrayList<Jugador> reserva = new ArrayList<>();
        for(int i=18; i<this.jugadores.size(); i++) {
            reserva.add(this.jugadores.get(i));
        }
        return reserva;
    }

    public Integer cantJugPorPos(String pos) throws PosicionException {
        //exception
        if(!pos.equals("ARQUERO")){
            throw new PosicionException();
        }
        Integer cantJugEnPosicion = 0;
        for(Jugador jugador : this.jugadores){
            //los strings se comparan con equals
            if(jugador.getPosicion().equals(pos)){
                cantJugEnPosicion ++;
            }
        }
        return cantJugEnPosicion;
    }

}
