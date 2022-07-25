public class Internacional extends Datos{
    private int precio;
    Internacional() {
        this.precio = 25000;
    }
    @Override
    int obtenerPrecio(){
        return precio;
    }
    @Override
    int obtenertiempo(){
        return 90;
    }
}
