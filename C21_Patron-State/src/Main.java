import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Tamagochi tamagochi = new Tamagochi("Leo");
        tamagochi.darDeBeber();
        tamagochi.darDeComer();
        tamagochi.darleMimos();
        Date date = new Date();
        tamagochi.darleMimos();
        tamagochi.darDeComer();
        tamagochi.darDeComer();
        System.out.println(tamagochi);
    }
}