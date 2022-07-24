public class Principal {

  public static void main(String[] args) {
    Tiempo[] envios = {
        new Municipal(),
        /*new intermunicipal(),
        new internacional()*/
    };
    Impresion.imprimirTiempoDeEnvio(envios);
  }
  class Impresion{
    public static void imprimirTiempoDeEnvio(Tiempo[] envios){
    for (Tiempo envio : envios) {
      System.out.println("Tiempo de envío: " + envio.obtenertiempo() + " horas. Y el precio es " + envio.obtenerPrecio());
    }
  }
  }
}
