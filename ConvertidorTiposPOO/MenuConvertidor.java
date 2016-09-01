import java.util.Scanner;

public class MenuConvertidor {
  private String []opciones;
  private String respuesta;

  public MenuConvertidor(){
    this(new String[1]);
  }

  public MenuConvertidor(String []opciones){
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

  public void ejecutar(Convertidor convertidor){
    boolean repeat = false;
    do {
      switch (this.evaluarRespuesta()) {
        case 0:
          convertidor.convertirAByte();
          System.out.println(convertidor.getByte());
          break;
        case 1:
          convertidor.convertirAShort();
          System.out.println(convertidor.getShort());
          break;
        case 2:
          convertidor.convertirAInt();
          System.out.println(convertidor.getInt());
          break;
        case 3:
          convertidor.convertirALong();
          System.out.println(convertidor.getLong());
          break;
        case 4:
          convertidor.convertirAFloat();
          System.out.println(convertidor.getFloat());
          break;
        case 5:
          convertidor.convertirADouble();
          System.out.println(convertidor.getDouble());
          break;
        case 6:
          convertidor.convertirAChar();
          System.out.println(convertidor.getChar());
          break;
        case 7:
          convertidor.convertirABool();
          System.out.println(convertidor.getBool());
          break;
        case 8:
          System.out.println();
          System.out.println("Valor máximo de [byte]: " + Byte.MAX_VALUE);
          System.out.println("Valor mínimo de [byte]: " + Byte.MIN_VALUE);
          break;
        case 9:
          System.out.println();
          System.out.println("Valor máximo de [short]: " + Short.MAX_VALUE);
          System.out.println("Valor mínimo de [short]: " + Short.MIN_VALUE);
          break;
        case 10:
          System.out.println();
          System.out.println("Valor máximo de [int]: " + Integer.MAX_VALUE);
          System.out.println("Valor mínimo de [int]: " + Integer.MIN_VALUE);
          break;
        case 11:
          System.out.println();
          System.out.println("Valor máximo de [long]: " + Long.MAX_VALUE);
          System.out.println("Valor mínimo de [long]: " + Long.MIN_VALUE);
          break;
        case 12:
          System.out.println();
          System.out.println("Valor máximo de [float]: " + Float.MAX_VALUE);
          System.out.println("Valor mínimo de [float]: " + Float.MIN_VALUE);
          break;
        case 13:
          System.out.println();
          System.out.println("Valor máximo de [double]: " + Double.MAX_VALUE);
          System.out.println("Valor mínimo de [double]: " + Double.MIN_VALUE);
          break;
        case 14:
          System.out.println();
          System.out.println("Valor máximo de [char]: " + Character.MAX_VALUE);
          System.out.println("Valor mínimo de [char]: " + Character.MIN_VALUE);
          break;
        case 15:
          System.out.println();
          System.out.println("Valor máximo de [bool]: " + true);
          System.out.println("Valor mínimo de [bool]: " + false);
          break;
      }
    } while(repeat);
  }
}
