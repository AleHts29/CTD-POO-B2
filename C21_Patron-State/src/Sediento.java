public class Sediento implements TamagochiState{
    @Override
    public TamagochiState comer() {
        return new Triste();
    }

    @Override
    public TamagochiState beber() {
        return new Feliz();
    }

    @Override
    public TamagochiState recibirMimos() {
        return this;
    }
}
