import javax.swing.JOptionPane;

public class Cliente {
  private int numeroCuenta;
  private double saldoInicial;
  private double totalCompras;
  private double totalCreditos;
  private double limiteCredito;
  private double saldoFinal;
  private boolean excedido;

  public Cliente(){
    this(0, 0.0, 0.0, 0.0, 0.0, 0.0, false);
  }

  public Cliente(String numeroCuenta, String saldoInicial, String totalCompras, String totalCreditos, String limiteCredito){
    this(
      Integer.parseInt(numeroCuenta),
      Double.parseDouble(saldoInicial),
      Double.parseDouble(totalCompras),
      Double.parseDouble(totalCreditos),
      Double.parseDouble(limiteCredito),
      0.0,
      false
    );
  }

  public Cliente(int numeroCuenta, double saldoInicial, double totalCompras, double totalCreditos, double limiteCredito, double saldoFinal, boolean excedido){
    this.numeroCuenta = numeroCuenta;
    this.saldoInicial = saldoInicial;
    this.totalCompras = totalCompras;
    this.totalCreditos = totalCreditos;
    this.limiteCredito = limiteCredito;
    this.saldoFinal = saldoFinal;
    this.excedido = excedido;
  }

  public void calcularSaldoFinal(){
    this.saldoFinal = this.saldoInicial + this.totalCompras - this.totalCreditos;
    if (this.saldoFinal > this.limiteCredito) {
      this.excedido = true;
    }
  }

  public void estaExcedido(){
    if (this.excedido) {
      JOptionPane.showMessageDialog(null, "Límite de crédito excedido");
    } else {
      JOptionPane.showMessageDialog(null, "No excedió el límite de crédito");
    }
  }

  public void describir(){
    String des = "Numero de cuenta: " + this.numeroCuenta + "\nSaldo inicial: " + this.saldoInicial + "\nTotal de compras: " + this.totalCompras + "\nTotal de créditos: " + this.totalCreditos + "\nLimite de crédito: " + this.limiteCredito + "\nSaldo final: " + this.saldoFinal;
    JOptionPane.showMessageDialog(null, des);
  }

}
