public class Principal {

  public static void main(String[] args) {
    Datos[] envios = {
        new Municipal(),
        new Intermunicipal(),
        new Internacional()
    };
    Impresion.imprimirTiempoDeEnvio(envios);
    Crear.crearTipoEnvio(envios);
  }
}
