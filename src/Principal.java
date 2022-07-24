public class Principal {

  public static void main(String[] args) {
    Tiempo[] envios = {
        new Municipal(),
        new Nacional(),
        new Internacional()
    };
    imprimirTiempoDeEnvio(envios);
  }

  public static void imprimirTiempoDeEnvio(Tiempo[] envios){
    for (Tiempo envio : envios) {
      System.out.println("Tiempo de envío: "+envio.tiempoEnvio()+" horas.");
    }
  }
}