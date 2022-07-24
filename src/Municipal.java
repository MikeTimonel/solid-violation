public class Municipal extends Tiempo{
    private int precio;
    Municipal() {
        this.precio = 5000;
    }
    @Override
    int obtenerPrecio(){
        return precio;
    }
    @Override
    int obtenertiempo(){
        return 12;
    }
}
