public class Triste implements TamagochiState{
    @Override
    public TamagochiState comer() {
        return this;
    }

    @Override
    public TamagochiState beber() {
        return this;
    }

    @Override
    public TamagochiState recibirMimos() {
        return new Feliz();
    }
}
