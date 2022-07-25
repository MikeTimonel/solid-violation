public class Principal {

  public static void main(String[] args) {
    Tiempo[] envios = {
        new Municipal(),
        new Intermunicipal(),
        new Internacional()
    };
    Impresion.imprimirTiempoDeEnvio(envios);
    Crear.crearTipoEnvio(envios);
  }
}
