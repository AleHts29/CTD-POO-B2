import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> criptomonedas = new HashMap<>();
        criptomonedas.put(1, "Bitcoin");
        criptomonedas.put(2, "Ethereum");
        criptomonedas.put(3, "Binance");
        criptomonedas.put(4, "Cardano");
        criptomonedas.put(5, "Teather");

        System.out.println("Claves: "+criptomonedas.keySet());
        System.out.println("Valores: "+criptomonedas.values());
        System.out.println("Valores: "+criptomonedas);

    //Ejemplos for/while
        System.out.println("\n--for--");
        for(int i=1; i <= criptomonedas.size(); i++){
            System.out.println(criptomonedas.get(i));
        }

        System.out.println("\n--while--");
        int i=1;
        while (i<= criptomonedas.size()){
            System.out.println(criptomonedas.get(i));
            i++;
        }

        int i2=1;
        boolean encontrado=false;
        while (i2<= criptomonedas.size() && !encontrado ){
            if(criptomonedas.get(i2) == "Binance")
                encontrado=true;
            System.out.println("-->: "+criptomonedas.get(i2));
            i2++;
        }


    //Ejemplos hasNext() && next()
        System.out.println("\n--hasNext() && next()--");
        Iterator iterator = criptomonedas.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            i++;
        }

    //Ejemplos for each
        criptomonedas.forEach((k,v)-> System.out.println("Clave:"+k+" valor:"+v));


        System.out.println("-----------------------------------");

        //metodo replace
        criptomonedas.replace(5, "Chiba INU");
        criptomonedas.forEach((k,v)-> System.out.println("Clave:"+k+" valor:"+v));
    }
}