public class Impresion{
    public static void imprimirTiempoDeEnvio(Tiempo[] envios){
    for (Tiempo envio : envios) {
      System.out.println("Tiempo de envío: " + envio.obtenertiempo() + " horas. Y el precio es: " + envio.obtenerPrecio());
    }
  }
}
