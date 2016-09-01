import javax.swing.JOptionPane;

public class CreditoPOO {
  public static void main(String[] args) {
    String numeroCuenta, saldoInicial, totalCompras, totalCreditos, limiteCredito;
    numeroCuenta = JOptionPane.showInputDialog(null, "Ingrese el numero de cuenta");
    saldoInicial = JOptionPane.showInputDialog(null, "Ingrese el saldo inicial");
    totalCompras = JOptionPane.showInputDialog(null, "Ingrese el total de compras");
    totalCreditos = JOptionPane.showInputDialog(null, "Ingrese el total de creditos");
    limiteCredito = JOptionPane.showInputDialog(null, "Ingrese el limite de credito");

    Cliente cliente = new Cliente(numeroCuenta, saldoInicial, totalCompras, totalCreditos, limiteCredito);
    cliente.calcularSaldoFinal();
    cliente.describir();
    cliente.estaExcedido();
  }
}
