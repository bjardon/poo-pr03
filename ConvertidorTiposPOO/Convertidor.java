import java.util.Scanner;

public class Convertidor {
  private byte b;
	private short s;
	private int i;
	private long l;
	private float f;
	private double d;
	private char c;
  private boolean bool;
	private String str;

  public Convertidor(){
    this("0");
  }

  public Convertidor(String str){
    this.b = 0;
  	this.s = 0;
  	this.i = 0;
  	this.l = 0;
  	this.f = 0f;
  	this.d = 0.0;
  	this.c = 0;
  	this.bool = false;
    this.str = str;
  }

  public void obtenerValor(){
    System.out.println("Ingrese el valor a convertir");
    System.out.print("> ");
    this.str = new Scanner(System.in).nextLine();
  }

  public void convertirAByte(){
    System.out.println("Convertir '" + str + "' [String] a [byte]");
    b = Byte.parseByte(this.str);
  }

  public void convertirAByte(String s){
    this.str = s;
    this.convertirAByte();
  }

  public void convertirAShort(){
    System.out.println("Convertir '" + str + "' [String] a [short]");
    s = Short.parseShort(this.str);
  }

  public void convertirAShort(String s){
    this.str = s;
    this.convertirAShort();
  }

  public void convertirAInt(){
    System.out.println("Convertir '" + str + "' [String] a [int]");
    i = Integer.parseInt(this.str);
  }

  public void convertirAInt(String s){
    this.str = s;
    this.convertirAInt();
  }

  public void convertirALong(){
    System.out.println("Convertir '" + str + "' [String] a [long]");
    l = Long.parseLong(this.str);
  }

  public void convertirALong(String s){
    this.str = s;
    this.convertirALong();
  }

  public void convertirAFloat(){
    System.out.println("Convertir '" + str + "' [String] a [float]");
    f = Float.parseFloat(this.str);
  }

  public void convertirAFloat(String s){
    this.str = s;
    this.convertirAFloat();
  }

  public void convertirADouble(){
    System.out.println("Convertir '" + str + "' [String] a [double]");
    d = Double.parseDouble(this.str);
  }

  public void convertirADouble(String s){
    this.str = s;
    this.convertirADouble();
  }

  public void convertirAChar(){
    System.out.println("Convertir '" + str + "' [String] a [char]");
    c = str.charAt(0);
  }

  public void convertirAChar(String s){
    this.str = s;
    this.convertirAChar();
  }

  public void convertirABool(){
    System.out.println("Convertir '" + str + "' [String] a [boolean]");
    bool = Boolean.parseBoolean(this.str);
  }

  public void convertirABool(String s){
    this.str = s;
    convertirABool();
  }

  public byte getByte(){
    return this.b;
  }
	public short getShort(){
    return this.s;
  }
	public int getInt(){
    return this.i;
  }
	public long getLong(){
    return this.l;
  }
	public float getFloat(){
    return this.f;
  }
	public double getDouble(){
    return this.d;
  }
	public char getChar(){
    return this.c;
  }
  public boolean getBool(){
    return this.bool;
  }
	public String getString(){
    return this.str;
  }


}
