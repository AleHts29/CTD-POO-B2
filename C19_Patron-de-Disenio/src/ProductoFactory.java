public class ProductoFactory {

    // patron singleton
    private static ProductoFactory instance;

    private ProductoFactory(){
    }
    public static ProductoFactory getInstance() {
        if (instance == null){
            instance = new ProductoFactory();
        }
        return instance;
    }


    // Patron factory me crea un producto dependiendo el codigo y esto se lo designa a la fabrica
    public Producto crearProducto(String codigo){
        switch (codigo){
            case "CAJA10X10" :
                return new Caja(2.0,10.0,10.0,10.0);
            case "PELOTATENNIS" :
                return new Pelota(1.0,0.32);
            case "PELOTAFUTBOL" :
                return new Pelota(3.0,11.0);
        }
        return null;
    }
}
