public class Clase {
  private String hola;

  @Override
  public String toString() {
    String resultado = "Hola " + hola;
    String envio = String.valueOf(resultado);
    return envio;
  }

}
