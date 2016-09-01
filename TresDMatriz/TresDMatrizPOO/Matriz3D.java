public class Matriz3D {

    private int tresD[][][];

    public Matriz3D(){
        this(3,4,5);
    }

    public Matriz3D(int x, int y, int z){
        tresD = new int[x][y][z];
    }

    public void rellenar(){
        int i, j, k;
        for(i=0; i<3; i++){
            for(j=0; j<4; j++){
                for(k=0; k<5; k++){
                    tresD[i][j][k] = i * j * k;
                }
            }
        }
    }

    public void imprimir(){
      int i, j, k;
        for(i=0; i<3; i++) {
            for(j=0; j<4; j++) {
                for(k=0; k<5; k++){
                    System.out.print(tresD[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

}
