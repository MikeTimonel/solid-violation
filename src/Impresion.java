public class Impresion{
    public static void imprimirTiempoDeEnvio(Datos[] envios){
    for (Datos envio : envios) {
      System.out.println("Tiempo de envío: " + envio.obtenertiempo() + " horas. Y el precio es: " + envio.obtenerPrecio());
    }
  }
}
