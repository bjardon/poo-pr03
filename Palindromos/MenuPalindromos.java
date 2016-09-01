import java.util.Scanner;

public class MenuPalindromos {
  private String []opciones;
  private String respuesta;

  public MenuPalindromos(){
    this(new String[1]);
  }

  public MenuPalindromos(String []opciones){
    this.opciones = opciones;
  }

  public void mostrar(){
    for (int i = 0; i < this.opciones.length; i++) {
      System.out.println("" + i + ". " + opciones[i]);
    }
  }

  public void obtenerRespuesta(){
    System.out.print(">  ");
    this.respuesta = new Scanner(System.in).nextLine();
  }

  public int evaluarRespuesta(){
    int r;
    try {
      r = Integer.parseInt(this.respuesta);
    } catch(Exception e){
      System.out.println("ERROR! La opción ingresada es inválida");
      return -1;
    }
    if(r < 0 || r > this.opciones.length){
      System.out.println("ERROR! La opción ingresada es inválida");
      return -1;
    }
    return r;
  }

  public void ejecutar(VerificadorDePalindromos verificador){
    boolean repeat = false;
    do {
      switch (this.evaluarRespuesta()) {
        case 0:
          System.out.println("Verificando enteros");
          if(verificador.esPalindromo()){
            System.out.println("El valor es palíndromo");
          } else {
            System.out.println("El valor no es palíndromo");
          }
          repeat = false;
          break;
        case 1:
          System.out.println("Verificando caracteres");
          if(verificador.esPalindromo()){
            System.out.println("El valor es palíndromo");
          } else {
            System.out.println("El valor no es palíndromo");
          }
          repeat = false;
          break;
        default:
          repeat = true;
          break;
      }
    } while(repeat);
  }
}
