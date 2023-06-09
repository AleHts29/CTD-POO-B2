public class OfertaAcademicaFactory {

    public static final String CODIGO_FRONTEND = "FRONTEND";
    public static final String CODIGO_BACKEND = "BACKEND";
    public static final String CODIGO_FULLSTACK = "FULLSTACK";
    private static OfertaAcademicaFactory instance;

    private OfertaAcademicaFactory(){

    }

    public static OfertaAcademicaFactory getInstance() {
        if(instance == null){
            instance = new OfertaAcademicaFactory();
        }
        return instance;
    }

    public OfertaAcademica crearOfertaAcademica(String codigo){
        switch (codigo){
            case CODIGO_FRONTEND :
                return new Curso("Front-end","javascript es de hippies",1000.0,2.0,16.0);
            case CODIGO_BACKEND:
                return new Curso("Back-end","aguante java",900.0,2.0,20.0);
            case CODIGO_FULLSTACK:
                ProgramaIntensivo programaIntensivo = new ProgramaIntensivo("Full-stack","algo",0.20);
                programaIntensivo.agregarOfertaAcademica(crearOfertaAcademica(CODIGO_FRONTEND));
                programaIntensivo.agregarOfertaAcademica(crearOfertaAcademica(CODIGO_BACKEND));
                return programaIntensivo;
        }
        return null;
    }
}
