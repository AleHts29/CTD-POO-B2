public class Main {
    public static void main(String[] args) {

        OfertaAcademicaFactory factory = OfertaAcademicaFactory.getInstance();

        Instituto instituto = new Instituto();

        instituto.agregarOferta(factory.crearOfertaAcademica(OfertaAcademicaFactory.CODIGO_FRONTEND));
        instituto.agregarOferta(factory.crearOfertaAcademica(OfertaAcademicaFactory.CODIGO_BACKEND));
        instituto.agregarOferta(factory.crearOfertaAcademica(OfertaAcademicaFactory.CODIGO_FULLSTACK));



        instituto.mostrarOfertasAcademicas();
    }
}