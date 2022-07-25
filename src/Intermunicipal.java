public class Intermunicipal extends Tiempo{
    private int precio;
    Intermunicipal() {
        this.precio = 15000;
    }
    @Override
    int obtenerPrecio(){
        return precio;
    }
    @Override
    int obtenertiempo(){
        return 36;
    }
}
