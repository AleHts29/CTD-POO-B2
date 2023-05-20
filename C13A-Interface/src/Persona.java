public class Persona implements Comparable {
    private int edad;

    public int getEdad(){
        return this.edad;
    }


    @Override
    public int compareTo(Object o) {
        Persona p = (Persona) o;
        return (this.edad - p.getEdad());
    }
}
