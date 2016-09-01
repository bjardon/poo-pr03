public class Palindromos {
  public static void main(String[] args) {
    String []opciones = {
      "Palindromo de enteros",
      "Palindromo de caracteres"
    };
    String cadena;
    int entero;
    MenuPalindromos menu = new MenuPalindromos(opciones);
    VerificadorDePalindromos verificador = new VerificadorDePalindromos();
    verificador.obtenerValor();
    menu.mostrar();
    menu.obtenerRespuesta();
    menu.evaluarRespuesta();
    menu.ejecutar(verificador);
  }
}
