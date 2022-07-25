public class Intermunicipal extends Datos{
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
