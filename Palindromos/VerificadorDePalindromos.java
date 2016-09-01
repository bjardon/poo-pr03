import java.util.Scanner;

public class VerificadorDePalindromos {
  private String valor;

  public VerificadorDePalindromos(){
    this("");
  }

  public VerificadorDePalindromos(String valor){
    this.valor = valor;
  }

  public void obtenerValor(){
    System.out.println("Ingrese el valor a verificar");
    System.out.print("> ");
    this.valor = new Scanner(System.in).nextLine();
  }

  public boolean esPalindromo(){
    return this.esPalindromo(this.valor);
  }

  public boolean esPalindromo(int numero){
    return this.esPalindromo("" + numero);
  }

  public boolean esPalindromo(String cadena){
    this.valor = cadena;
    char a, b;
    int longitud = this.valor.length();
    for(int i=0;i<longitud;i++){
			a=this.valor.charAt(i);
			b=this.valor.charAt(longitud-1);
			if(a!=b){
				return false;
			}
			longitud--;
		}
    return true;
  }

}
