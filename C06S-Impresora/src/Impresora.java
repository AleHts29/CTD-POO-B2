public class Impresora {

// Atributos
    private String modelo;
    private Integer anioDeFabricacion;
    private Integer cantDeHojas;


    // constructor
    public Impresora(String modelo, Integer anioDeFabricacion) {
        this.modelo = modelo;
        this.anioDeFabricacion = anioDeFabricacion;
        cantDeHojas = 0;
    }

    // sobre escribir el constructor
    public Impresora(String modelo, Integer anioDeFabricacion, Integer cantDeHojas) {
        this.modelo = modelo;
        this.anioDeFabricacion = anioDeFabricacion;
        this.cantDeHojas = cantDeHojas;
    }





    // Metodos
    public void imprimir(String texto){
        if(puedoImprimir() ){
            System.out.println(texto);
            cantDeHojas--;

        }else{
            System.out.println("No hay hojas disponibles!");
        }

    }

    // Metodo privado
    private Boolean puedoImprimir(){
        return cantDeHojas > 0;
    }
}
