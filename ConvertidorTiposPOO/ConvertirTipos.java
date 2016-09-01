public class ConvertirTipos {
  public static void main(String[] args) {
    String []opciones = {
      "Convertir a byte [byte]",
      "Convertir a entero corto [short]",
      "Convertir a entero [int]",
      "Convertir a entero largo [long]",
      "Convertir a punto flotante de precisión simple [float]",
      "Convertir a punto flotante de precisión doble [double]",
      "Convertir a caracter [char]",
      "Convertir a booleano [boolean]",
      "Obtener valores (MAX, MIN) de byte",
      "Obtener valores (MAX, MIN) de short",
      "Obtener valores (MAX, MIN) de int",
      "Obtener valores (MAX, MIN) de long",
      "Obtener valores (MAX, MIN) de float",
      "Obtener valores (MAX, MIN) de double",
      "Obtener valores (MAX, MIN) de char",
      "Obtener valores (MAX, MIN) de boolean",
    };
    Convertidor convertidor = new Convertidor();
    MenuConvertidor menu = new MenuConvertidor(opciones);

    convertidor.obtenerValor();
    menu.mostrar();
    menu.obtenerRespuesta();
    menu.ejecutar(convertidor);
  }
}
