import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<VideoJuegos> listaVideoJuegos = new ArrayList<VideoJuegos>();

        VideoJuegos videoGame_01 = new VideoJuegos(121, "Banjo kazooie", "Nintendo 64", 4, "plataforma");
        VideoJuegos videoGame_02 = new VideoJuegos(122, "Mario party", "Nintendo 64", 4, "plataforma");
        VideoJuegos videoGame_03 = new VideoJuegos(123, "Age of Empire II", "PC", 1, "plataforma");
        VideoJuegos videoGame_04 = new VideoJuegos(124, "Mario kart", "Nintendo 64", 4, "plataforma");
        VideoJuegos videoGame_05 = new VideoJuegos(125, "Crash Bandico", "PlayStation", 1, "plataforma");

        //Agregamos info al array
        listaVideoJuegos.add(videoGame_01);
        listaVideoJuegos.add(videoGame_02);
        listaVideoJuegos.add(videoGame_03);
        listaVideoJuegos.add(videoGame_04);
        listaVideoJuegos.add(videoGame_05);


        //Recorremos la lista
        for (VideoJuegos videGame: listaVideoJuegos) {
            System.out.println("Titulo: "+videGame.getTitulo()+"\nConsola: "+videGame.getConsola()+"\nCant Jugadores: "+ videGame.getCantJugadores()+"\n" );
        }

        //Cambio de nombre y jugadores
        videoGame_05.setTitulo("Crach Bandico Nitro");
        videoGame_05.setCantJugadores(2);

        //Mostrar solo videoJuegos de Nintendo64
        for (VideoJuegos videGame: listaVideoJuegos) {
            if(videGame.getConsola().equals("Nintendo 64")){
                System.out.println(videGame.toString());

            }
        }

    }
}