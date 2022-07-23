public class Principal {

  public static void main(String[] args) {
    Envio[] envios = {
        new Envio("Municipal",5000),
        new Envio("Intermunicipal",15000),
        new Envio("Internacional",25000)
    };
    imprimirTiempoDeEnvio(envios);
  }

  public static void imprimirTiempoDeEnvio(Envio[] envios){
    for (Envio coche : envios) {
      System.out.println( "Tiempo de envio " + Tiempo.imprimirtiempo() + " horas.");

    }
  }

  abstract class Tiempo{
    abstract int imprimirtiempo();
  }
  class municipal extends Tiempo{
    int imprimirtiempo(){
      return 12;
    };
  }
  class intermunicipal extends Tiempo{
    int imprimirtiempo(){
      return 36;
    };
  } 
  class internacional extends Tiempo{
    int imprimirtiempo(){
      return 90;
    };
}
}
