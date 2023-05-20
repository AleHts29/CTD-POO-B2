public class Tamagochi {

    private TamagochiState estadoActual;
    private String nombre;

    public Tamagochi(String nombre){
        this.nombre = nombre;
        estadoActual = new Feliz();
    }

    public void darDeComer(){
        this.estadoActual = estadoActual.comer();
    }

    public void darDeBeber(){
        this.estadoActual = estadoActual.beber();
    }

    public void darleMimos(){
        this.estadoActual = estadoActual.recibirMimos();
    }
}
