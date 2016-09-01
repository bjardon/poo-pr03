public class MatrizTriangular {

    private int dosD[][] = new int[4][];

    public MatrizTriangular(){
        this(1,2,3,4);
    }

    public MatrizTriangular(int f1, int f2, int f3, int f4){
        dosD[0] = new int[f1];
        dosD[1] = new int[f2];
        dosD[2] = new int[f3];
        dosD[3] = new int[f4];
    }

    public void rellenar(){
        int i, j, k = 0;
        for (i = 0; i < 4; i++){
            for (j = 0; j < i + 1; j++) {
                dosD[i][j] = k;
                k++;
            }
        }
    }

    public void imprimir(){
        int i, j, k = 0;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < i + 1; j++){
                System.out.print(dosD[i][j] + " ");
            }
            System.out.println();
        }
    }

}
