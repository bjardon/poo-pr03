public class MatrizP {
  private double m[][];

  public MatrizP() {
    m = new double[4][4];
  }

  public MatrizP(int x, int y) {
    m = new double[x][y];
  }

  public void rellenar(){
    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m[i].length; i++ ) {
        m[i][j] = i * j;
      }
    }
  }

  public void imprimir(){
    for(int i=0; i< m.length; i++) {
        for(int j=0; j<m[i].length; j++)
            System.out.print(m[i][j] + " ");
        System.out.println();
    }
  }
}
